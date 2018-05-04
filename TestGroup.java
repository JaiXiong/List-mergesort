import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

import junit.framework.TestCase;
import edu.uwm.cs351.Student;
import edu.uwm.cs351.Student.Group;
import edu.uwm.cs351.util.Alphabetical;
import edu.uwm.cs351.util.AttendanceDescending;
import edu.uwm.cs351.util.GradeDescending;


public class TestGroup extends TestCase {
	
	private Group group;
	private Iterator<Student> it, it2;
	private Student s1, s2, s3, s4, s5;
	
	@Override
	protected void setUp() {
		group = new Group(Alphabetical.getInstance());

		s1 = new Student("Arnold", 0, 0);
		s2 = new Student("Benjie", 0, 0);
		s3 = new Student("Catherine", 0, 0);
		s4 = new Student("Dana", 0, 0);
		s5 = new Student("Eeyore", 0, 0);
		try {
			assert (1/(int)s1.getAttendance()) == 0 : "OK";
			System.err.println("Assertions must be enabled to use this test suite.");
			System.err.println("In Eclipse: add -ea in the VM Arguments box under Run>Run Configurations>Arguments");
			assertFalse("Assertions must be -ea enabled in the Run Configuration>Arguments>VM Arguments",true);
		} catch (ArithmeticException ex) {
			return;
		}
			
	}
	
	private Comparator<Student> nondiscrimination = new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			return 0;
		}
		
	};
	
	protected void testGroup(Group group, String name, Student... students)
	{
		assertEquals(name + ".size()",students.length,group.size());
		Iterator<Student> it = group.iterator();
		int i=0;
		while (it.hasNext() && i < students.length) {
			assertEquals(name + "[" + i + "]",students[i],it.next());
			++i;
		}
		assertFalse(name + " too long",it.hasNext());
		assertFalse(name + " too short",(i < students.length));
	}
	
	public void test00() {
		group = new Group(Alphabetical.getInstance());
		
		group.add(new Student("Kathy", 0, 0));
		assertEquals("Kathy", group.getHead().getName());
		assertEquals("Kathy", group.getTail().getName());
		
		group.add(new Student("Omar", 0, 0));
		assertEquals("Kathy", group.getHead().getName());
		assertEquals("Omar", group.getTail().getName());
		
		group.add(new Student("Fitz", 0, 0));
		assertEquals("Fitz", group.getHead().getName());
		assertEquals("Omar", group.getTail().getName());
	}
	
	public void test01() {
		group = new Group(GradeDescending.getInstance());
		
		// Student constructor takes (name, grade, attendance)
		group.add(new Student("Trevor", 70, 0));
		group.add(new Student("Bobby", 70, 0));
		assertEquals("Bobby", group.getTail().getName());
		group.add(new Student("Arnold", 60, 0));
		assertEquals("Trevor", group.getHead().getName());
	}

	public void test02()
	{
		assertTrue(group.isEmpty());
		it = group.iterator();
		assertFalse(it.hasNext());
		group.add(s1);
		it = group.iterator();
		assertTrue(it.hasNext());
		assertEquals(s1, it.next());
		assertFalse(it.hasNext());
	
		group.add(s2);
		testGroup(group,"{s1,s2}",s1,s2);
		group.add(s3);
		testGroup(group,"{s1,s2,s3}",s1,s2,s3);
		group.add(s4);
		testGroup(group,"{s1,s2,s3,s4}",s1,s2,s3,s4);
		
		group.clear();
		testGroup(group,"after clear");
		it = group.iterator();
		assertFalse(it.hasNext());
	}
	
	public void test03() {
		group.add(s1);
		it = group.iterator();
		it.next();
		it.remove();
		assertFalse(it.hasNext());
		testGroup(group,"{s1} after remove(s1)");
	}
	
	public void test04() {
		group.add(s2);
		group.add(s1);
		it = group.iterator();
		it.next();
		it.remove();
		assertTrue(it.hasNext());
		assertEquals(s2, it.next());
		assertFalse(it.hasNext());
		testGroup(group,"{s1,s2} after remove(s1)",s2);
	}
	
	public void test05() {
		group.add(s1);
		group.add(s2);
		
		Group group2 = new Group(Alphabetical.getInstance());
		try {
			group2.add(s1);
			assertFalse("adding student to two groups should throw exception",true);
		} catch (Exception ex) {
			assertTrue("add(Student) threw wrong exception ",ex instanceof IllegalArgumentException);
		}
		
		try {
			group2.add(s2);
			assertFalse("adding student to two groups should throw exception",true);
		} catch (Exception ex) {
			assertTrue("add(Student) threw wrong exception ",ex instanceof IllegalArgumentException);
		}
	}
	
	public void test06() {
		group.add(s1);
		group.add(s2);
		it = group.iterator();
		assertEquals(s1, it.next());
		group.clear();
		try {
			it.next();
			assertFalse("next() on stale iterator should throw exception",true);
		} catch (Exception ex) {
			assertTrue("next() threw wrong exception ",ex instanceof ConcurrentModificationException);
		}
		
		// s1 and s2 were removed from other group, so we can add them to group2
		Group group2 = new Group(Alphabetical.getInstance());
		group2.add(s1);
		group2.add(s2);
		it2 = group2.iterator();
		assertEquals(s1, it2.next());
		assertEquals(s2, it2.next());
		assertFalse(it2.hasNext());
	}
	
	public void test07() {
		group.add(s1);
		group.add(s2);
		group.add(s3);
		
		it = group.iterator();
		assertEquals(s1, it.next());
		assertEquals(s2, it.next());
		it.remove(); // Remove s2 from group
		
		Group group2 = new Group(Alphabetical.getInstance());
		group2.add(s2);
		it2 = group2.iterator();
		assertEquals(s2, it2.next());
		
		assertEquals(s3, it.next());
		assertFalse(it.hasNext());
		it.remove(); // Remove s3 from group
		
		group2.add(s3);
		try {
			it2.next();
			assertFalse("next() on stale iterator should throw exception",true);
		} catch (Exception ex) {
			assertTrue("next() threw wrong exception ",ex instanceof ConcurrentModificationException);
		}
		it2 = group2.iterator();
		assertEquals(s2, it2.next());
		assertEquals(s3, it2.next());
		assertFalse(it2.hasNext());
		
		it = group.iterator();
		assertEquals(s1, it.next());
		assertFalse(it.hasNext());
	}
	
	public void test08() {
		group.add(s1);
		group.add(s2);
		it = group.iterator();
		it.next();
		it.next();
		it.remove();
		assertFalse(it.hasNext());
		testGroup(group,"{s1,s2} after remove(s2)",s1);
	}
	
	public void test09() {
		group = new Group(Alphabetical.getInstance());
		s2 = new Student("Dana", 0, 0);
		s1 = new Student("Benjie", 0, 0);
		s3 = new Student("Eeyore", 0, 0);
		
		group.add(s2);
		group.add(s1);
		group.add(s3);
		it = group.iterator();
		assertTrue(it.hasNext());
		assertEquals("Benjie", it.next().getName());
		assertEquals("Dana", it.next().getName());
		it.remove();
		assertEquals(true, it.hasNext());
		assertEquals("Eeyore", it.next().getName());
		assertFalse(it.hasNext());
		testGroup(group,"{s1,s2,s3} after remove(s2)",s1,s3);
				
	}
	
	public void test10() {
		group.add(s3);
		group.add(s2);
		group.add(s1);
		it = group.iterator();
		assertEquals(s1, it.next());
		it.remove();
		assertTrue(it.hasNext());
		assertEquals(s2, it.next());
		assertEquals(s3, it.next());
		assertFalse(it.hasNext());
		testGroup(group,"{s1,s2,s3} after remove(s1)",s2,s3);
	}

	public void test11() {
		group.add(s1);
		group.add(s3);
		group.add(s2);
		it = group.iterator();
		assertEquals(s1, it.next());
		assertEquals(s2, it.next());
		assertEquals(s3, it.next());
		it.remove();
		assertEquals(false, it.hasNext());
		it = group.iterator();
		assertEquals(true, it.hasNext());
		assertEquals(s1, it.next());
		assertEquals(true, it.hasNext());
		assertEquals(s2, it.next());
		assertEquals(false, it.hasNext());
		testGroup(group,"{s1,s2,s3} after remove(s3)",s1,s2);	
	}

	public void test12() {
		group.add(s1);
		group.add(s2);
		group.add(s3);
		it = group.iterator();
		it.next(); it.remove();
		it.next(); it.remove();
		assertTrue(it.hasNext());
		assertEquals(s3,it.next());
		testGroup(group,"{s1,s2,s3} after remove(s1,s2)",s3);
	}

	public void test13() {
		group.add(s1);
		group.add(s2);
		group.add(s3);
		it = group.iterator();
		it.next(); it.remove();
		it.next();
		it.next(); it.remove();
		assertEquals(false, it.hasNext());
		testGroup(group,"{s1,s2,s3} after remove(s1,s3)",s2);
	}

	public void test14() {
		group.add(s1);
		group.add(s2);
		group.add(s3);
		it = group.iterator();
		it.next(); it.remove();
		it.next(); it.remove();
		it.next(); it.remove();
		assertEquals(false, it.hasNext());
		it = group.iterator();
		assertEquals(false, it.hasNext());
		testGroup(group,"{s1,s2,s3} after remove(s1,s2,s3)");
	}

	public void test15() 
	{
		group.add(s1);
		group.add(s2);
		group.add(s3);
		group.add(s4);
		testGroup(group,"{s1 s2 s3 s4}",s1,s2,s3,s4);
		
		it = group.iterator();
		it.next();
		it.next();
		it.remove();
		assertTrue(it.hasNext());
		assertEquals(s3,it.next());
		assertTrue(it.hasNext());
		assertEquals(s4,it.next());
		assertFalse(it.hasNext());		
		testGroup(group,"{s1,s2,s3,s4} after remove(s2)",s1,s3,s4);
		
		group.clear();
		testGroup(group,"after clear");
	}
	
	public void test16() {
		group.add(s1);
		group.add(s2);
		group.add(s3);
		group.add(s4);
		
		it = group.iterator();
		it.next();
		it.remove();
		assertTrue(it.hasNext());
		assertEquals(s2,it.next());
		testGroup(group,"{s1,s2,s3,s4} after remove(s1)",s2,s3,s4);
		assertTrue(it.hasNext());
		assertEquals(s3,it.next());
		it.remove();
		assertTrue(it.hasNext());
		assertEquals(s4,it.next());
		testGroup(group,"{s1,s2,s3,s4} after remove(s1,s3)",s2,s4);
		it.remove();
		assertFalse(it.hasNext());
		testGroup(group,"{s1,s2,s3,s4} after remove(s1,s3,s4)",s2);
		
		it = group.iterator();
		it.next();
		it.remove();
		assertFalse(it.hasNext());
		testGroup(group,"all removed");
		
	}
	
	public void test17() {
		group.add(s1);
		group.add(s2);
		group.add(s3);
		group.add(s4);
		
		it= group.iterator();
		it.next();
		it.remove();
		testGroup(group,"{s1,s2,s3,s4} after remove(s1)",s2,s3,s4);
		it = group.iterator();
		it.next();
		it.remove();
		testGroup(group,"{s1,s2,s3,s4} after remove(s1,s2)",s3,s4);
		it = group.iterator();
		it.next();
		it.next();
		it.remove();
		testGroup(group,"{s1,s2,s3,s4} after remove(s1,s2,s4)",s3);
		it = group.iterator();
		it.next();
		it.remove();
		testGroup(group,"all removed again");
	}
	
	public void test18()
	{
		it = group.iterator();
		try {
			it.next();
			assertFalse("next() on iterator over empty collection should throw exception",true);
		} catch (Exception ex) {
			assertTrue("empty.next() threw wrong exception ",ex instanceof NoSuchElementException);
		}
		assertFalse(it.hasNext());
		testGroup(group,"still empty");
	}
	
	public void test19()
	{
		it = group.iterator();
		try {
			it.remove();
			assertFalse("remove() on iterator over empty collection should throw exception",true);
		} catch (Exception ex) {
			assertTrue("empty.remove() threw wrong exception ",ex instanceof IllegalStateException);
		}
		assertFalse(it.hasNext());
		testGroup(group,"still empty");

	}
	
	public void test20()
	{
		it = group.iterator();
		group.add(s3);
		try {
			it.hasNext();
			assertTrue("hasNext() on stale iterator should throw exception",false);
		} catch (RuntimeException ex) {
			assertTrue(("hasNext() on stale iterator threw wrong exception " + ex),(ex instanceof ConcurrentModificationException));
		}
		testGroup(group,"{s3}",s3);
	}
	
	public void test21()
	{
		group.add(s3);
		it = group.iterator();
		try {
			it.remove();
			assertTrue("remove() at start of iteration should throw exception",false);
		} catch (RuntimeException ex) {
			assertTrue(("just started remove() threw wrong exception " + ex),(ex instanceof IllegalStateException));
		}
		assertTrue(it.hasNext());
		assertEquals(s3, it.next());
		testGroup(group,"still {s3}",s3);
	}
	
	public void test22()
	{
		group.add(s4);
		it = group.iterator();
		it.next();
		it.remove();
		try {
			it.next();
			assertTrue("next() after removed only element should throw exception",false);
		} catch (RuntimeException ex) {
			assertTrue(("after removal of only element, next() threw wrong exception " + ex),(ex instanceof NoSuchElementException));
		}
		assertFalse("after removal of only element, hasNext() should still be false",it.hasNext());
		testGroup(group,"{s4} after remove (s4)");
	}
	
	public void test23()
	{
		group.add(s2);
		group.add(s4);
		it = group.iterator();
		it.next();
		it.remove();
		try {
			it.remove();
			assertTrue("remove() after remove() should throw exception",false);
		} catch (RuntimeException ex) {
			assertTrue(("remove() after remove() threw wrong exception " + ex),(ex instanceof IllegalStateException));
		}
		assertTrue(it.hasNext());
		assertEquals(s4, it.next());
		testGroup(group,"{s2,s4} after remove (s2)",s4);
	}
	
	public void test24()
	{
		group.add(s3);
		it = group.iterator();
		it.next();
		it.remove();
		group.add(s4);
		try {
			it.hasNext();
			assertTrue("hasNext() on stale iterator should throw exception",false);
		} catch (RuntimeException ex) {
			assertTrue(("hasNext() on stale iterator threw wrong exception " + ex),(ex instanceof ConcurrentModificationException));
		}
		testGroup(group,"{s4}",s4);
	}
	
	public void test25()
	{
		group.add(s2);
		it = group.iterator();
		it.next();
		try {
			it.next();
			assertTrue("next() after iterated past only element should throw exception",false);
		} catch (RuntimeException ex) {
			assertTrue(("after iteration past only element, next() threw wrong exception " + ex),(ex instanceof NoSuchElementException));
		}
		assertTrue("after iteration past only element, hasNext() should still be false",(!it.hasNext()));
		testGroup(group,"{s2}",s2);
	}
	
	public void test26()
	{
		group.add(s5);
		group.add(s1);
		it = group.iterator();
		it2 = group.iterator();
		it.next();
		it2.next();
		it.remove();
		try {
			it2.hasNext();
			assertTrue("hasNext() on stale iterator should throw exception",false);
		} catch (RuntimeException ex) {
			assertTrue(("hasNext() on stale iterator threw wrong exception " + ex),(ex instanceof ConcurrentModificationException));
		}	
		try {
			it2.remove();
			assertTrue("remove() on stale iterator should throw exception",false);
		} catch (RuntimeException ex) {
			assertTrue(("remove() on stale iterator threw wrong exception " + ex),(ex instanceof ConcurrentModificationException));
		}		
		try {
			it.remove();
			assertTrue("remove() after first remove() should throw exception",false);
		} catch (RuntimeException ex) {
			assertTrue(("remove() after first remove() threw wrong exception " + ex),ex instanceof IllegalStateException);
		}
		assertTrue(it.hasNext());
		testGroup(group,"{s1,s5} after remove (s1)",s5);
		
	}
	
	public void test27() {
		group.add(s1);
		group.add(s3);
		it = group.iterator();
		it.next();
		it.remove();
		
		it2 = group.iterator();
		it.next();
		it.remove();
		
		try {
			it2.hasNext();
			assertTrue("hasNext() on stale iterator should throw exception",false);
		} catch (RuntimeException ex) {
			assertTrue(("hasNext() on stale iterator threw wrong exception " + ex),(ex instanceof ConcurrentModificationException));
		}
		
		try {
			it2.next();
			assertTrue("next() on stale iterator should throw exception",false);
		} catch (RuntimeException ex) {
			assertTrue(("next() on stale iterator threw wrong exception " + ex),(ex instanceof ConcurrentModificationException));
		}

		try {
			it2.remove();
			assertTrue("remove() on stale iterator should throw exception",false);
		} catch (RuntimeException ex) {
			assertTrue(("remove() on stale iterator threw wrong exception " + ex),(ex instanceof ConcurrentModificationException));
		}
		
		try {
			it.remove();
			assertTrue("remove() after second remove() should throw exception",false);
		} catch (RuntimeException ex) {
			assertTrue(("remove() after second remove() threw wrong exception " + ex),ex instanceof IllegalStateException);
		}
		assertTrue("after remove() after second remove(), hasNext() should still be false",(!it.hasNext()));
		testGroup(group,"{s1,s3} after remove (s1,s3)");
	}
	
	public void test28() {
		group.add(s1);
		it = group.iterator();
		group.clear();
		
		try {
			it.hasNext();
			assertTrue("hasNext() on stale iterator should throw exception",false);
		} catch (RuntimeException ex) {
			assertTrue(("hasNext() on stale iterator threw wrong exception " + ex),(ex instanceof ConcurrentModificationException));
		}
		
		try {
			it.next();
			assertTrue("next() on stale iterator should throw exception",false);
		} catch (RuntimeException ex) {
			assertTrue(("next() on stale iterator threw wrong exception " + ex),(ex instanceof ConcurrentModificationException));
		}

		try {
			it.remove();
			assertTrue("remove() on stale iterator should throw exception",false);
		} catch (RuntimeException ex) {
			assertTrue(("remove() on stale iterator threw wrong exception " + ex),(ex instanceof ConcurrentModificationException));
		}
	}
	
	public void test29() {
		group = new Group(nondiscrimination);
		group.add(s3);
		group.add(s2);
		assertSame(s3,group.getHead());
		assertSame(s2,group.getTail());
		group.add(s5);
		assertSame(s5,group.getTail());
	}
	
	public void test30() {
		group.add(s3);
		group.add(s2);
		Student s1a = new Student("Arnold", 40, 50);
		Student s2a = new Student("Benjie", 30, 10);
		Student s3a = new Student("Catherine", 20, 70);
		group.add(s1a);
		group.add(s2a);
		group.add(s3a);
		it = group.iterator();
		assertSame(s1a,it.next());
		assertSame(s2,it.next());
		assertSame(s2a,it.next());
		assertSame(s3,it.next());
		assertSame(s3a,it.next());
	}
	
	public void test31() {
		Group copy = group.clone();
		assertEquals(0, copy.size());
		assertNull(copy.getHead());
		assertNull(copy.getTail());
		copy.add(s1);
		copy.add(s2);
		
		assertEquals(0, group.size());
		try {
			group.add(s1);
			assertTrue("adding s1 to original group should have throw exception",false);
		}
		catch (Exception e) {
			assertEquals("What type of exception?", "IllegalArgumentException", e.getClass().getSimpleName());
		}
	}
	
	public void test32() {
		Group copy = group.clone();
		group.add(s1);
		group.add(s2);
		copy.add(s1.clone());
		copy.add(s2.clone());
		
		it = group.iterator();
		it2 = copy.iterator();
		while (it.hasNext() && it2.hasNext()) {
			Student cur1 = it.next();
			Student cur2 = it2.next();
			assertEquals(cur1.getName(), cur2.getName());
			assertEquals(cur1.getAttendance(), cur2.getAttendance());
			assertEquals(cur1.getGrade(), cur2.getGrade());
		}
		assertFalse("shouldn't have a next", it.hasNext());
		assertFalse("shouldn't have a next", it2.hasNext());
	}
	
	public void test33() {
		group.add(s1);
		group.add(s2);
		Group copy = group.clone();
		
		it = group.iterator();
		it.next();
		it.remove();
		assertEquals(2, copy.size());
		
		it2 = copy.iterator();
		assertTrue(it2.hasNext());
		it2.next();
		assertEquals(true, it2.hasNext());
		it2.next();
		assertFalse(it2.hasNext());
	}
	
	public void test34() {
		group.add(s1);
		group.add(s2);
		group.add(s3);
		group.clear();
		group.add(s4);
		// If any of the following adds fail, it probably means
		// that the student overrode clear to do the wrong thing.
		group.add(s2);
		group.add(s3); 
		group.add(s1);
		assertEquals(4,group.size());
	}
	
	public void test40() {
		group.reverse();
	}
	
	public void test41() {
		group.add(s2);
		group.reverse();
		assertSame(s2,group.getHead());
	}
	
	public void test42() {
		group.add(s3);
		group.add(s4);
		assertSame(s3,group.getHead());
		assertSame(s4,group.getTail());
		group.reverse();
		assertSame(s4,group.getHead());
		assertSame(s3,group.getTail());
	}
	
	public void test43() {
		group.add(s3);
		group.add(s2);
		group.add(s1);
		assertSame(s1,group.getHead());
		assertSame(s3,group.getTail());
		group.reverse();
		assertSame(s3,group.getHead());
		assertSame(s1,group.getTail());
	}
	
	public void test44() {
		group.add(s3);
		group.add(s4);
		group.add(s2);
		group.add(s1);
		group.reverse();
		assertSame(s4,group.getHead());
		assertSame(s1,group.getTail());
	}
	
	public void test45() {
		group.reverse();
		group.add(s5);
		assertSame(s5,group.getHead());
		assertSame(s5,group.getTail());
	}
	
	public void test46() {
		group.reverse();
		group.add(s3);
		group.add(s4);
		assertSame(s4,group.getHead());
		assertSame(s3,group.getTail());
	}
	
	public void test47() {
		group.add(s3);
		group.add(s2);
		assertSame(s2,group.getHead());
		assertSame(s3,group.getTail());
		group.reverse();
		group.add(s4);
		assertSame(s4,group.getHead());
		assertSame(s2,group.getTail());
		group.add(s1);
		assertSame(s1,group.getTail());
	}
	
	public void test48() {
		group = new Student.Group(nondiscrimination);
		group.reverse();
		group.add(s3);
		group.add(s1);
		assertSame(s1,group.getTail());
		group.reverse();
		assertSame(s3,group.getTail());
	}
	
	public void test49() {
		group.add(s1);
		group.add(s3);
		group.reverse();
		assertSame(s3,group.getHead());
		assertSame(s1,group.getTail());
		group.add(s4);
		assertSame(s4,group.getHead());
		group.reverse();
		assertSame(s1,group.getHead());
		assertSame(s4,group.getTail());
	}
	
	public void test50() {
		group.setComparator(GradeDescending.getInstance());
		group.setComparator(AttendanceDescending.getInstance());
		assertEquals(0,group.size());
	}
	
	public void test51() {
		group.add(s1);
		group.setComparator(GradeDescending.getInstance());
		group.setComparator(AttendanceDescending.getInstance());
		assertEquals(1,group.size());
	}
	
	public void test52() {
		group.setComparator(nondiscrimination);
		group.add(s2);
		group.add(s1);
		assertSame(s2,group.getHead());
		assertSame(s1,group.getTail());
		group.setComparator(Alphabetical.getInstance());
		assertSame(s1,group.getHead());
		assertSame(s2,group.getTail());
	}
	
	public void test53() {
		Student p = new Student("Pat",1.0,0.5);
		Student s = new Student("Sandy",0.7,0.7);
		Student c = new Student("Chris",0.5,1.0);
		group.add(p);
		group.add(s);
		group.add(c);
		assertSame(c,group.getHead());
		assertSame(s,group.getTail());
		group.setComparator(GradeDescending.getInstance());
		assertSame(p,group.getHead());
		assertSame(c,group.getTail());
		group.setComparator(AttendanceDescending.getInstance());
		assertSame(c,group.getHead());
		assertSame(p,group.getTail());
	}
	
	public void test55() {
		group.add(s3);
		group.add(s2);
		group.reverse();
		assertSame(s3,group.getHead());
		assertSame(s2,group.getTail());
		group.setComparator(Alphabetical.getInstance());
		assertSame(s2,group.getHead());
		assertSame(s3,group.getTail());
	}
	
	public void test56() {
		group.setComparator(nondiscrimination);
		group.add(s1);
		group.add(s4);
		group.reverse();
		assertSame(s4,group.getHead());
		assertSame(s1,group.getTail());
		group.setComparator(Alphabetical.getInstance());
		assertSame(s1,group.getHead());
		assertSame(s4,group.getTail());
	}
	
	public void test59() {
		double[] grades = { 0.3, 0.7, 0.1, 0.8, 0.5, 0.9, 0.0, 0.4, 0.2, 0.6 };
		Student[] ss = new Student[10];
		for (int i=0; i < 10; ++i) {
			ss[i] = new Student("S" + i, grades[i], 1.0);
			group.add(ss[i]);
		}
		assertSame(ss[0],group.getHead());
		assertSame(ss[9],group.getTail());
		group.setComparator(GradeDescending.getInstance());
		it = group.iterator();
		assertEquals(ss[5],it.next());
		assertEquals(ss[3],it.next());
		assertEquals(ss[1],it.next());
		assertEquals(ss[9],it.next());
		assertEquals(ss[4],it.next());
		assertEquals(ss[7],it.next());
		assertEquals(ss[0],it.next());
		assertEquals(ss[8],it.next());
		assertEquals(ss[2],it.next());
		assertEquals(ss[6],it.next());
	}
	
	public void test60() {
		group.add(s1);
		group.add(s3);
		it = group.iterator();
		assertSame(s1,it.next());
		group.reverse();
		testException(() -> { it.next(); }, "after reversal, next() ",ConcurrentModificationException.class);
	}
	
	public void test61() {
		group.setComparator(nondiscrimination);
		group.add(s2);
		group.add(s3);
		group.add(s1);
		it = group.iterator();
		assertSame(s2,it.next());
		group.setComparator(Alphabetical.getInstance());
		testException(() -> { it.next(); }, "after sort, next() ",ConcurrentModificationException.class);		
	}
	
	private <T> void testException(Runnable throwsException, String description, Class<T> type) {
		try {
			throwsException.run();
			assertFalse(description+"should have thrown exception", true);
		}
		catch (Exception e) {
			String message = description+" threw wrong type of exception: "+e.getClass().getSimpleName();
			assertTrue(message, type.isInstance(e));
		}
	}

}

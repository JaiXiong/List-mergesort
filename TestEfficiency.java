import java.util.Comparator;
import java.util.Iterator;
import java.util.Random;

import junit.framework.TestCase;
import edu.uwm.cs351.Student;
import edu.uwm.cs351.util.Alphabetical;
import edu.uwm.cs351.util.GradeDescending;


public class TestEfficiency extends TestCase {

	// These tests should take a few seconds only.
	
	private static final int BIG = 1 << 20; // a million
	
	private static final Comparator<Student> gradeAscending = new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			return (int)Math.signum(o1.getGrade() - o2.getGrade());
		}
		
	};
	
	private static final Comparator<Student> nondiscrimination = new Comparator<Student>() {
		@Override
		public int compare(Student o1, Student o2) {
			return 0;
		}
	};
	
	private Random r = new Random();
	
	protected void setUp() throws Exception {
		assert false : "Do not enable assertions for efficiency test!";
		super.setUp();
	}

	private void genBigGroup(Student.Group g, boolean random) {
		for (int i=0; i < BIG; ++i) {
			/*
			if (i > 0 && i < 100000 && (i % 10000) == 0 ||
				i >= 100000 && (i % 100000) == 0) System.out.println("... " + i + " created");
			*/
			double score = random ? r.nextDouble()*100 : (i*100.0)/BIG;
			Student s = new Student("Student " + (BIG+i),score,100);
			g.add(s);
		}
	}

	public void test1() {
		Student.Group g = new Student.Group(gradeAscending);
		genBigGroup(g,false);
		// now cloning:
		assertEquals(BIG,g.clone().size());
	}
	
	public void test2() {
		Student.Group g = new Student.Group(nondiscrimination);
		genBigGroup(g,true);
		for (Iterator<Student> it = g.iterator(); it.hasNext();) {
			Student s = it.next();
			String name = s.getName();
			if (name.endsWith("0") || name.endsWith("2") || name.endsWith("4") ||
					name.endsWith("6") || name.endsWith("8")) it.remove();
		}
		assertEquals(BIG/2,g.size());
	}

	public void test3() {
		Student.Group g = new Student.Group(nondiscrimination);
		genBigGroup(g,true);
		g.setComparator(GradeDescending.getInstance());
	}
	
	public void test4() {
		Student.Group g = new Student.Group(GradeDescending.getInstance());
		g.reverse();
		genBigGroup(g,false);
	}
	
	public void test5() {
		Student.Group g = new Student.Group(gradeAscending);
		genBigGroup(g,false);
		g.reverse();
	}
	
	private static final int SMALL = 10;
	
	public void test6() {
		Student.Group g = new Student.Group(GradeDescending.getInstance());
		for (int i=0; i < SMALL; ++i) {
			g.add(new Student("Student " + i, r.nextDouble()*100,80));
		}
		for (int i=0; i < BIG/SMALL; ++i) {
			g.reverse();
		}
		int sqrt = (int)Math.sqrt(BIG);
		for (int i=0; i < sqrt; ++i) {
			g.add(new Student("New Student " + i, r.nextDouble()*100,80));
		}
	}
	
	public void test7() {
		Student.Group g = new Student.Group(Alphabetical.getInstance());
		genBigGroup(g,true);
		for (int i=0; i < BIG; ++i) {
			g.setComparator(gradeAscending);
		}
	}
	
	public void test8() {
		Student.Group g = new Student.Group(nondiscrimination);
		for (int i=0; i < SMALL; ++i) {
			g.add(new Student("Student " + i, r.nextDouble()*100,80));
		}
		for (int i=0; i < BIG/SMALL; ++i) {
			g.setComparator((i % 2) == 0 ? Alphabetical.getInstance() : gradeAscending);
		}
	}
	
	public void test9() {
		Student.Group g = new Student.Group(nondiscrimination);
		for (int i=0; i < BIG/SMALL; ++i) {
			g.add(new Student("Student " + i, r.nextDouble()*100,80));
		}
		for (int i=0; i < SMALL; ++i) {
			g.setComparator((i % 2) == 0 ? Alphabetical.getInstance() : gradeAscending);
		}
	}
}

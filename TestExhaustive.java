import java.util.Comparator;
import java.util.Iterator;

import junit.framework.TestCase;
import edu.uwm.cs351.Student;
import edu.uwm.cs351.util.Alphabetical;

public class TestExhaustive extends TestCase {
  private Student.Group group;
  private Iterator<Student> it;
  private Student s1, s2, s3, s4, s5, s6;

  private Comparator<Student> nondiscrimination = new Comparator<Student>() {
  	@Override
  	public int compare(Student o1, Student o2) {
  		return 0;
  	}
  };

  @Override
  protected void setUp() {
    s1 = new Student("Aron",0,0);
    s2 = new Student("Bobi",0,0);
    s3 = new Student("Cris",0,0);
    s4 = new Student("Dane",0,0);
    s5 = new Student("Elie",0,0);
    s6 = new Student("Fran",0,0);
    group = new Student.Group(nondiscrimination);
   }

  public void test1001() {
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
  }

  public void test2001() {
    group.add(s1);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
  }

  public void test2002() {
    group.add(s2);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
  }

  public void test3001() {
    group.add(s1);
    group.add(s2);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
  }

  public void test3002() {
    group.add(s2);
    group.add(s1);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
  }

  public void test3003() {
    group.add(s3);
    group.add(s1);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
  }

  public void test3004() {
    group.add(s1);
    group.add(s3);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
  }

  public void test3005() {
    group.add(s2);
    group.add(s3);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
  }

  public void test3006() {
    group.add(s3);
    group.add(s2);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
  }

  public void test4001() {
    group.add(s1);
    group.add(s2);
    group.add(s3);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
  }

  public void test4002() {
    group.add(s2);
    group.add(s1);
    group.add(s3);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
  }

  public void test4003() {
    group.add(s3);
    group.add(s1);
    group.add(s2);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
  }

  public void test4004() {
    group.add(s1);
    group.add(s3);
    group.add(s2);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
  }

  public void test4005() {
    group.add(s2);
    group.add(s3);
    group.add(s1);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
  }

  public void test4006() {
    group.add(s3);
    group.add(s2);
    group.add(s1);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
  }

  public void test4007() {
    group.add(s4);
    group.add(s2);
    group.add(s1);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
  }

  public void test4008() {
    group.add(s2);
    group.add(s4);
    group.add(s1);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
  }

  public void test4009() {
    group.add(s1);
    group.add(s4);
    group.add(s2);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
  }

  public void test4010() {
    group.add(s4);
    group.add(s1);
    group.add(s2);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
  }

  public void test4011() {
    group.add(s2);
    group.add(s1);
    group.add(s4);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
  }

  public void test4012() {
    group.add(s1);
    group.add(s2);
    group.add(s4);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
  }

  public void test4013() {
    group.add(s1);
    group.add(s3);
    group.add(s4);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
  }

  public void test4014() {
    group.add(s3);
    group.add(s1);
    group.add(s4);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
  }

  public void test4015() {
    group.add(s4);
    group.add(s1);
    group.add(s3);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
  }

  public void test4016() {
    group.add(s1);
    group.add(s4);
    group.add(s3);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
  }

  public void test4017() {
    group.add(s3);
    group.add(s4);
    group.add(s1);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
  }

  public void test4018() {
    group.add(s4);
    group.add(s3);
    group.add(s1);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
  }

  public void test4019() {
    group.add(s4);
    group.add(s3);
    group.add(s2);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
  }

  public void test4020() {
    group.add(s3);
    group.add(s4);
    group.add(s2);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
  }

  public void test4021() {
    group.add(s2);
    group.add(s4);
    group.add(s3);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
  }

  public void test4022() {
    group.add(s4);
    group.add(s2);
    group.add(s3);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
  }

  public void test4023() {
    group.add(s3);
    group.add(s2);
    group.add(s4);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
  }

  public void test4024() {
    group.add(s2);
    group.add(s3);
    group.add(s4);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
  }

  public void test5001() {
    group.add(s1);
    group.add(s2);
    group.add(s3);
    group.add(s4);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5002() {
    group.add(s2);
    group.add(s1);
    group.add(s3);
    group.add(s4);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5003() {
    group.add(s3);
    group.add(s1);
    group.add(s2);
    group.add(s4);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5004() {
    group.add(s1);
    group.add(s3);
    group.add(s2);
    group.add(s4);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5005() {
    group.add(s2);
    group.add(s3);
    group.add(s1);
    group.add(s4);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5006() {
    group.add(s3);
    group.add(s2);
    group.add(s1);
    group.add(s4);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5007() {
    group.add(s4);
    group.add(s2);
    group.add(s1);
    group.add(s3);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5008() {
    group.add(s2);
    group.add(s4);
    group.add(s1);
    group.add(s3);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5009() {
    group.add(s1);
    group.add(s4);
    group.add(s2);
    group.add(s3);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5010() {
    group.add(s4);
    group.add(s1);
    group.add(s2);
    group.add(s3);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5011() {
    group.add(s2);
    group.add(s1);
    group.add(s4);
    group.add(s3);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5012() {
    group.add(s1);
    group.add(s2);
    group.add(s4);
    group.add(s3);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5013() {
    group.add(s1);
    group.add(s3);
    group.add(s4);
    group.add(s2);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5014() {
    group.add(s3);
    group.add(s1);
    group.add(s4);
    group.add(s2);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5015() {
    group.add(s4);
    group.add(s1);
    group.add(s3);
    group.add(s2);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5016() {
    group.add(s1);
    group.add(s4);
    group.add(s3);
    group.add(s2);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5017() {
    group.add(s3);
    group.add(s4);
    group.add(s1);
    group.add(s2);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5018() {
    group.add(s4);
    group.add(s3);
    group.add(s1);
    group.add(s2);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5019() {
    group.add(s4);
    group.add(s3);
    group.add(s2);
    group.add(s1);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5020() {
    group.add(s3);
    group.add(s4);
    group.add(s2);
    group.add(s1);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5021() {
    group.add(s2);
    group.add(s4);
    group.add(s3);
    group.add(s1);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5022() {
    group.add(s4);
    group.add(s2);
    group.add(s3);
    group.add(s1);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5023() {
    group.add(s3);
    group.add(s2);
    group.add(s4);
    group.add(s1);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5024() {
    group.add(s2);
    group.add(s3);
    group.add(s4);
    group.add(s1);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5025() {
    group.add(s5);
    group.add(s3);
    group.add(s4);
    group.add(s1);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5026() {
    group.add(s3);
    group.add(s5);
    group.add(s4);
    group.add(s1);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5027() {
    group.add(s4);
    group.add(s5);
    group.add(s3);
    group.add(s1);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5028() {
    group.add(s5);
    group.add(s4);
    group.add(s3);
    group.add(s1);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5029() {
    group.add(s3);
    group.add(s4);
    group.add(s5);
    group.add(s1);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5030() {
    group.add(s4);
    group.add(s3);
    group.add(s5);
    group.add(s1);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5031() {
    group.add(s1);
    group.add(s3);
    group.add(s5);
    group.add(s4);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5032() {
    group.add(s3);
    group.add(s1);
    group.add(s5);
    group.add(s4);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5033() {
    group.add(s5);
    group.add(s1);
    group.add(s3);
    group.add(s4);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5034() {
    group.add(s1);
    group.add(s5);
    group.add(s3);
    group.add(s4);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5035() {
    group.add(s3);
    group.add(s5);
    group.add(s1);
    group.add(s4);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5036() {
    group.add(s5);
    group.add(s3);
    group.add(s1);
    group.add(s4);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5037() {
    group.add(s5);
    group.add(s4);
    group.add(s1);
    group.add(s3);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5038() {
    group.add(s4);
    group.add(s5);
    group.add(s1);
    group.add(s3);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5039() {
    group.add(s1);
    group.add(s5);
    group.add(s4);
    group.add(s3);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5040() {
    group.add(s5);
    group.add(s1);
    group.add(s4);
    group.add(s3);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5041() {
    group.add(s4);
    group.add(s1);
    group.add(s5);
    group.add(s3);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5042() {
    group.add(s1);
    group.add(s4);
    group.add(s5);
    group.add(s3);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5043() {
    group.add(s1);
    group.add(s4);
    group.add(s3);
    group.add(s5);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5044() {
    group.add(s4);
    group.add(s1);
    group.add(s3);
    group.add(s5);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5045() {
    group.add(s3);
    group.add(s1);
    group.add(s4);
    group.add(s5);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5046() {
    group.add(s1);
    group.add(s3);
    group.add(s4);
    group.add(s5);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5047() {
    group.add(s4);
    group.add(s3);
    group.add(s1);
    group.add(s5);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5048() {
    group.add(s3);
    group.add(s4);
    group.add(s1);
    group.add(s5);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5049() {
    group.add(s2);
    group.add(s4);
    group.add(s1);
    group.add(s5);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5050() {
    group.add(s4);
    group.add(s2);
    group.add(s1);
    group.add(s5);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5051() {
    group.add(s1);
    group.add(s2);
    group.add(s4);
    group.add(s5);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5052() {
    group.add(s2);
    group.add(s1);
    group.add(s4);
    group.add(s5);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5053() {
    group.add(s4);
    group.add(s1);
    group.add(s2);
    group.add(s5);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5054() {
    group.add(s1);
    group.add(s4);
    group.add(s2);
    group.add(s5);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5055() {
    group.add(s5);
    group.add(s4);
    group.add(s2);
    group.add(s1);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5056() {
    group.add(s4);
    group.add(s5);
    group.add(s2);
    group.add(s1);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5057() {
    group.add(s2);
    group.add(s5);
    group.add(s4);
    group.add(s1);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5058() {
    group.add(s5);
    group.add(s2);
    group.add(s4);
    group.add(s1);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5059() {
    group.add(s4);
    group.add(s2);
    group.add(s5);
    group.add(s1);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5060() {
    group.add(s2);
    group.add(s4);
    group.add(s5);
    group.add(s1);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5061() {
    group.add(s2);
    group.add(s1);
    group.add(s5);
    group.add(s4);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5062() {
    group.add(s1);
    group.add(s2);
    group.add(s5);
    group.add(s4);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5063() {
    group.add(s5);
    group.add(s2);
    group.add(s1);
    group.add(s4);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5064() {
    group.add(s2);
    group.add(s5);
    group.add(s1);
    group.add(s4);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5065() {
    group.add(s1);
    group.add(s5);
    group.add(s2);
    group.add(s4);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5066() {
    group.add(s5);
    group.add(s1);
    group.add(s2);
    group.add(s4);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5067() {
    group.add(s5);
    group.add(s1);
    group.add(s4);
    group.add(s2);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5068() {
    group.add(s1);
    group.add(s5);
    group.add(s4);
    group.add(s2);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5069() {
    group.add(s4);
    group.add(s5);
    group.add(s1);
    group.add(s2);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5070() {
    group.add(s5);
    group.add(s4);
    group.add(s1);
    group.add(s2);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5071() {
    group.add(s1);
    group.add(s4);
    group.add(s5);
    group.add(s2);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5072() {
    group.add(s4);
    group.add(s1);
    group.add(s5);
    group.add(s2);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5073() {
    group.add(s3);
    group.add(s1);
    group.add(s5);
    group.add(s2);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5074() {
    group.add(s1);
    group.add(s3);
    group.add(s5);
    group.add(s2);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5075() {
    group.add(s5);
    group.add(s3);
    group.add(s1);
    group.add(s2);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5076() {
    group.add(s3);
    group.add(s5);
    group.add(s1);
    group.add(s2);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5077() {
    group.add(s1);
    group.add(s5);
    group.add(s3);
    group.add(s2);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5078() {
    group.add(s5);
    group.add(s1);
    group.add(s3);
    group.add(s2);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5079() {
    group.add(s2);
    group.add(s1);
    group.add(s3);
    group.add(s5);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5080() {
    group.add(s1);
    group.add(s2);
    group.add(s3);
    group.add(s5);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5081() {
    group.add(s3);
    group.add(s2);
    group.add(s1);
    group.add(s5);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5082() {
    group.add(s2);
    group.add(s3);
    group.add(s1);
    group.add(s5);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5083() {
    group.add(s1);
    group.add(s3);
    group.add(s2);
    group.add(s5);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5084() {
    group.add(s3);
    group.add(s1);
    group.add(s2);
    group.add(s5);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5085() {
    group.add(s3);
    group.add(s5);
    group.add(s2);
    group.add(s1);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5086() {
    group.add(s5);
    group.add(s3);
    group.add(s2);
    group.add(s1);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5087() {
    group.add(s2);
    group.add(s3);
    group.add(s5);
    group.add(s1);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5088() {
    group.add(s3);
    group.add(s2);
    group.add(s5);
    group.add(s1);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5089() {
    group.add(s5);
    group.add(s2);
    group.add(s3);
    group.add(s1);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5090() {
    group.add(s2);
    group.add(s5);
    group.add(s3);
    group.add(s1);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5091() {
    group.add(s2);
    group.add(s5);
    group.add(s1);
    group.add(s3);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5092() {
    group.add(s5);
    group.add(s2);
    group.add(s1);
    group.add(s3);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5093() {
    group.add(s1);
    group.add(s2);
    group.add(s5);
    group.add(s3);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5094() {
    group.add(s2);
    group.add(s1);
    group.add(s5);
    group.add(s3);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5095() {
    group.add(s5);
    group.add(s1);
    group.add(s2);
    group.add(s3);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5096() {
    group.add(s1);
    group.add(s5);
    group.add(s2);
    group.add(s3);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5097() {
    group.add(s4);
    group.add(s5);
    group.add(s2);
    group.add(s3);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5098() {
    group.add(s5);
    group.add(s4);
    group.add(s2);
    group.add(s3);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5099() {
    group.add(s2);
    group.add(s4);
    group.add(s5);
    group.add(s3);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5100() {
    group.add(s4);
    group.add(s2);
    group.add(s5);
    group.add(s3);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5101() {
    group.add(s5);
    group.add(s2);
    group.add(s4);
    group.add(s3);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5102() {
    group.add(s2);
    group.add(s5);
    group.add(s4);
    group.add(s3);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5103() {
    group.add(s3);
    group.add(s5);
    group.add(s4);
    group.add(s2);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5104() {
    group.add(s5);
    group.add(s3);
    group.add(s4);
    group.add(s2);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5105() {
    group.add(s4);
    group.add(s3);
    group.add(s5);
    group.add(s2);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5106() {
    group.add(s3);
    group.add(s4);
    group.add(s5);
    group.add(s2);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5107() {
    group.add(s5);
    group.add(s4);
    group.add(s3);
    group.add(s2);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5108() {
    group.add(s4);
    group.add(s5);
    group.add(s3);
    group.add(s2);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5109() {
    group.add(s4);
    group.add(s2);
    group.add(s3);
    group.add(s5);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5110() {
    group.add(s2);
    group.add(s4);
    group.add(s3);
    group.add(s5);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5111() {
    group.add(s3);
    group.add(s4);
    group.add(s2);
    group.add(s5);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5112() {
    group.add(s4);
    group.add(s3);
    group.add(s2);
    group.add(s5);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5113() {
    group.add(s2);
    group.add(s3);
    group.add(s4);
    group.add(s5);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5114() {
    group.add(s3);
    group.add(s2);
    group.add(s4);
    group.add(s5);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5115() {
    group.add(s3);
    group.add(s2);
    group.add(s5);
    group.add(s4);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5116() {
    group.add(s2);
    group.add(s3);
    group.add(s5);
    group.add(s4);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5117() {
    group.add(s5);
    group.add(s3);
    group.add(s2);
    group.add(s4);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5118() {
    group.add(s3);
    group.add(s5);
    group.add(s2);
    group.add(s4);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5119() {
    group.add(s2);
    group.add(s5);
    group.add(s3);
    group.add(s4);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test5120() {
    group.add(s5);
    group.add(s2);
    group.add(s3);
    group.add(s4);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
  }

  public void test6001() {
    group.add(s1);
    group.add(s2);
    group.add(s3);
    group.add(s4);
    group.add(s5);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6002() {
    group.add(s2);
    group.add(s1);
    group.add(s3);
    group.add(s4);
    group.add(s5);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6003() {
    group.add(s3);
    group.add(s1);
    group.add(s2);
    group.add(s4);
    group.add(s5);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6004() {
    group.add(s1);
    group.add(s3);
    group.add(s2);
    group.add(s4);
    group.add(s5);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6005() {
    group.add(s2);
    group.add(s3);
    group.add(s1);
    group.add(s4);
    group.add(s5);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6006() {
    group.add(s3);
    group.add(s2);
    group.add(s1);
    group.add(s4);
    group.add(s5);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6007() {
    group.add(s4);
    group.add(s2);
    group.add(s1);
    group.add(s3);
    group.add(s5);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6008() {
    group.add(s2);
    group.add(s4);
    group.add(s1);
    group.add(s3);
    group.add(s5);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6009() {
    group.add(s1);
    group.add(s4);
    group.add(s2);
    group.add(s3);
    group.add(s5);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6010() {
    group.add(s4);
    group.add(s1);
    group.add(s2);
    group.add(s3);
    group.add(s5);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6011() {
    group.add(s2);
    group.add(s1);
    group.add(s4);
    group.add(s3);
    group.add(s5);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6012() {
    group.add(s1);
    group.add(s2);
    group.add(s4);
    group.add(s3);
    group.add(s5);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6013() {
    group.add(s1);
    group.add(s3);
    group.add(s4);
    group.add(s2);
    group.add(s5);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6014() {
    group.add(s3);
    group.add(s1);
    group.add(s4);
    group.add(s2);
    group.add(s5);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6015() {
    group.add(s4);
    group.add(s1);
    group.add(s3);
    group.add(s2);
    group.add(s5);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6016() {
    group.add(s1);
    group.add(s4);
    group.add(s3);
    group.add(s2);
    group.add(s5);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6017() {
    group.add(s3);
    group.add(s4);
    group.add(s1);
    group.add(s2);
    group.add(s5);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6018() {
    group.add(s4);
    group.add(s3);
    group.add(s1);
    group.add(s2);
    group.add(s5);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6019() {
    group.add(s4);
    group.add(s3);
    group.add(s2);
    group.add(s1);
    group.add(s5);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6020() {
    group.add(s3);
    group.add(s4);
    group.add(s2);
    group.add(s1);
    group.add(s5);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6021() {
    group.add(s2);
    group.add(s4);
    group.add(s3);
    group.add(s1);
    group.add(s5);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6022() {
    group.add(s4);
    group.add(s2);
    group.add(s3);
    group.add(s1);
    group.add(s5);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6023() {
    group.add(s3);
    group.add(s2);
    group.add(s4);
    group.add(s1);
    group.add(s5);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6024() {
    group.add(s2);
    group.add(s3);
    group.add(s4);
    group.add(s1);
    group.add(s5);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6025() {
    group.add(s5);
    group.add(s3);
    group.add(s4);
    group.add(s1);
    group.add(s2);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6026() {
    group.add(s3);
    group.add(s5);
    group.add(s4);
    group.add(s1);
    group.add(s2);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6027() {
    group.add(s4);
    group.add(s5);
    group.add(s3);
    group.add(s1);
    group.add(s2);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6028() {
    group.add(s5);
    group.add(s4);
    group.add(s3);
    group.add(s1);
    group.add(s2);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6029() {
    group.add(s3);
    group.add(s4);
    group.add(s5);
    group.add(s1);
    group.add(s2);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6030() {
    group.add(s4);
    group.add(s3);
    group.add(s5);
    group.add(s1);
    group.add(s2);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6031() {
    group.add(s1);
    group.add(s3);
    group.add(s5);
    group.add(s4);
    group.add(s2);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6032() {
    group.add(s3);
    group.add(s1);
    group.add(s5);
    group.add(s4);
    group.add(s2);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6033() {
    group.add(s5);
    group.add(s1);
    group.add(s3);
    group.add(s4);
    group.add(s2);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6034() {
    group.add(s1);
    group.add(s5);
    group.add(s3);
    group.add(s4);
    group.add(s2);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6035() {
    group.add(s3);
    group.add(s5);
    group.add(s1);
    group.add(s4);
    group.add(s2);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6036() {
    group.add(s5);
    group.add(s3);
    group.add(s1);
    group.add(s4);
    group.add(s2);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6037() {
    group.add(s5);
    group.add(s4);
    group.add(s1);
    group.add(s3);
    group.add(s2);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6038() {
    group.add(s4);
    group.add(s5);
    group.add(s1);
    group.add(s3);
    group.add(s2);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6039() {
    group.add(s1);
    group.add(s5);
    group.add(s4);
    group.add(s3);
    group.add(s2);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6040() {
    group.add(s5);
    group.add(s1);
    group.add(s4);
    group.add(s3);
    group.add(s2);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6041() {
    group.add(s4);
    group.add(s1);
    group.add(s5);
    group.add(s3);
    group.add(s2);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6042() {
    group.add(s1);
    group.add(s4);
    group.add(s5);
    group.add(s3);
    group.add(s2);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6043() {
    group.add(s1);
    group.add(s4);
    group.add(s3);
    group.add(s5);
    group.add(s2);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6044() {
    group.add(s4);
    group.add(s1);
    group.add(s3);
    group.add(s5);
    group.add(s2);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6045() {
    group.add(s3);
    group.add(s1);
    group.add(s4);
    group.add(s5);
    group.add(s2);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6046() {
    group.add(s1);
    group.add(s3);
    group.add(s4);
    group.add(s5);
    group.add(s2);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6047() {
    group.add(s4);
    group.add(s3);
    group.add(s1);
    group.add(s5);
    group.add(s2);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6048() {
    group.add(s3);
    group.add(s4);
    group.add(s1);
    group.add(s5);
    group.add(s2);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6049() {
    group.add(s2);
    group.add(s4);
    group.add(s1);
    group.add(s5);
    group.add(s3);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6050() {
    group.add(s4);
    group.add(s2);
    group.add(s1);
    group.add(s5);
    group.add(s3);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6051() {
    group.add(s1);
    group.add(s2);
    group.add(s4);
    group.add(s5);
    group.add(s3);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6052() {
    group.add(s2);
    group.add(s1);
    group.add(s4);
    group.add(s5);
    group.add(s3);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6053() {
    group.add(s4);
    group.add(s1);
    group.add(s2);
    group.add(s5);
    group.add(s3);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6054() {
    group.add(s1);
    group.add(s4);
    group.add(s2);
    group.add(s5);
    group.add(s3);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6055() {
    group.add(s5);
    group.add(s4);
    group.add(s2);
    group.add(s1);
    group.add(s3);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6056() {
    group.add(s4);
    group.add(s5);
    group.add(s2);
    group.add(s1);
    group.add(s3);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6057() {
    group.add(s2);
    group.add(s5);
    group.add(s4);
    group.add(s1);
    group.add(s3);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6058() {
    group.add(s5);
    group.add(s2);
    group.add(s4);
    group.add(s1);
    group.add(s3);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6059() {
    group.add(s4);
    group.add(s2);
    group.add(s5);
    group.add(s1);
    group.add(s3);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6060() {
    group.add(s2);
    group.add(s4);
    group.add(s5);
    group.add(s1);
    group.add(s3);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6061() {
    group.add(s2);
    group.add(s1);
    group.add(s5);
    group.add(s4);
    group.add(s3);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6062() {
    group.add(s1);
    group.add(s2);
    group.add(s5);
    group.add(s4);
    group.add(s3);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6063() {
    group.add(s5);
    group.add(s2);
    group.add(s1);
    group.add(s4);
    group.add(s3);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6064() {
    group.add(s2);
    group.add(s5);
    group.add(s1);
    group.add(s4);
    group.add(s3);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6065() {
    group.add(s1);
    group.add(s5);
    group.add(s2);
    group.add(s4);
    group.add(s3);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6066() {
    group.add(s5);
    group.add(s1);
    group.add(s2);
    group.add(s4);
    group.add(s3);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6067() {
    group.add(s5);
    group.add(s1);
    group.add(s4);
    group.add(s2);
    group.add(s3);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6068() {
    group.add(s1);
    group.add(s5);
    group.add(s4);
    group.add(s2);
    group.add(s3);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6069() {
    group.add(s4);
    group.add(s5);
    group.add(s1);
    group.add(s2);
    group.add(s3);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6070() {
    group.add(s5);
    group.add(s4);
    group.add(s1);
    group.add(s2);
    group.add(s3);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6071() {
    group.add(s1);
    group.add(s4);
    group.add(s5);
    group.add(s2);
    group.add(s3);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6072() {
    group.add(s4);
    group.add(s1);
    group.add(s5);
    group.add(s2);
    group.add(s3);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6073() {
    group.add(s3);
    group.add(s1);
    group.add(s5);
    group.add(s2);
    group.add(s4);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6074() {
    group.add(s1);
    group.add(s3);
    group.add(s5);
    group.add(s2);
    group.add(s4);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6075() {
    group.add(s5);
    group.add(s3);
    group.add(s1);
    group.add(s2);
    group.add(s4);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6076() {
    group.add(s3);
    group.add(s5);
    group.add(s1);
    group.add(s2);
    group.add(s4);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6077() {
    group.add(s1);
    group.add(s5);
    group.add(s3);
    group.add(s2);
    group.add(s4);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6078() {
    group.add(s5);
    group.add(s1);
    group.add(s3);
    group.add(s2);
    group.add(s4);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6079() {
    group.add(s2);
    group.add(s1);
    group.add(s3);
    group.add(s5);
    group.add(s4);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6080() {
    group.add(s1);
    group.add(s2);
    group.add(s3);
    group.add(s5);
    group.add(s4);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6081() {
    group.add(s3);
    group.add(s2);
    group.add(s1);
    group.add(s5);
    group.add(s4);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6082() {
    group.add(s2);
    group.add(s3);
    group.add(s1);
    group.add(s5);
    group.add(s4);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6083() {
    group.add(s1);
    group.add(s3);
    group.add(s2);
    group.add(s5);
    group.add(s4);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6084() {
    group.add(s3);
    group.add(s1);
    group.add(s2);
    group.add(s5);
    group.add(s4);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6085() {
    group.add(s3);
    group.add(s5);
    group.add(s2);
    group.add(s1);
    group.add(s4);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6086() {
    group.add(s5);
    group.add(s3);
    group.add(s2);
    group.add(s1);
    group.add(s4);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6087() {
    group.add(s2);
    group.add(s3);
    group.add(s5);
    group.add(s1);
    group.add(s4);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6088() {
    group.add(s3);
    group.add(s2);
    group.add(s5);
    group.add(s1);
    group.add(s4);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6089() {
    group.add(s5);
    group.add(s2);
    group.add(s3);
    group.add(s1);
    group.add(s4);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6090() {
    group.add(s2);
    group.add(s5);
    group.add(s3);
    group.add(s1);
    group.add(s4);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6091() {
    group.add(s2);
    group.add(s5);
    group.add(s1);
    group.add(s3);
    group.add(s4);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6092() {
    group.add(s5);
    group.add(s2);
    group.add(s1);
    group.add(s3);
    group.add(s4);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6093() {
    group.add(s1);
    group.add(s2);
    group.add(s5);
    group.add(s3);
    group.add(s4);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6094() {
    group.add(s2);
    group.add(s1);
    group.add(s5);
    group.add(s3);
    group.add(s4);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6095() {
    group.add(s5);
    group.add(s1);
    group.add(s2);
    group.add(s3);
    group.add(s4);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6096() {
    group.add(s1);
    group.add(s5);
    group.add(s2);
    group.add(s3);
    group.add(s4);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6097() {
    group.add(s4);
    group.add(s5);
    group.add(s2);
    group.add(s3);
    group.add(s1);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6098() {
    group.add(s5);
    group.add(s4);
    group.add(s2);
    group.add(s3);
    group.add(s1);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6099() {
    group.add(s2);
    group.add(s4);
    group.add(s5);
    group.add(s3);
    group.add(s1);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6100() {
    group.add(s4);
    group.add(s2);
    group.add(s5);
    group.add(s3);
    group.add(s1);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6101() {
    group.add(s5);
    group.add(s2);
    group.add(s4);
    group.add(s3);
    group.add(s1);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6102() {
    group.add(s2);
    group.add(s5);
    group.add(s4);
    group.add(s3);
    group.add(s1);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6103() {
    group.add(s3);
    group.add(s5);
    group.add(s4);
    group.add(s2);
    group.add(s1);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6104() {
    group.add(s5);
    group.add(s3);
    group.add(s4);
    group.add(s2);
    group.add(s1);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6105() {
    group.add(s4);
    group.add(s3);
    group.add(s5);
    group.add(s2);
    group.add(s1);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6106() {
    group.add(s3);
    group.add(s4);
    group.add(s5);
    group.add(s2);
    group.add(s1);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6107() {
    group.add(s5);
    group.add(s4);
    group.add(s3);
    group.add(s2);
    group.add(s1);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6108() {
    group.add(s4);
    group.add(s5);
    group.add(s3);
    group.add(s2);
    group.add(s1);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6109() {
    group.add(s4);
    group.add(s2);
    group.add(s3);
    group.add(s5);
    group.add(s1);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6110() {
    group.add(s2);
    group.add(s4);
    group.add(s3);
    group.add(s5);
    group.add(s1);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6111() {
    group.add(s3);
    group.add(s4);
    group.add(s2);
    group.add(s5);
    group.add(s1);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6112() {
    group.add(s4);
    group.add(s3);
    group.add(s2);
    group.add(s5);
    group.add(s1);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6113() {
    group.add(s2);
    group.add(s3);
    group.add(s4);
    group.add(s5);
    group.add(s1);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6114() {
    group.add(s3);
    group.add(s2);
    group.add(s4);
    group.add(s5);
    group.add(s1);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6115() {
    group.add(s3);
    group.add(s2);
    group.add(s5);
    group.add(s4);
    group.add(s1);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6116() {
    group.add(s2);
    group.add(s3);
    group.add(s5);
    group.add(s4);
    group.add(s1);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6117() {
    group.add(s5);
    group.add(s3);
    group.add(s2);
    group.add(s4);
    group.add(s1);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6118() {
    group.add(s3);
    group.add(s5);
    group.add(s2);
    group.add(s4);
    group.add(s1);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6119() {
    group.add(s2);
    group.add(s5);
    group.add(s3);
    group.add(s4);
    group.add(s1);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6120() {
    group.add(s5);
    group.add(s2);
    group.add(s3);
    group.add(s4);
    group.add(s1);
    group.add(s6);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6121() {
    group.add(s6);
    group.add(s2);
    group.add(s3);
    group.add(s4);
    group.add(s1);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6122() {
    group.add(s2);
    group.add(s6);
    group.add(s3);
    group.add(s4);
    group.add(s1);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6123() {
    group.add(s3);
    group.add(s6);
    group.add(s2);
    group.add(s4);
    group.add(s1);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6124() {
    group.add(s6);
    group.add(s3);
    group.add(s2);
    group.add(s4);
    group.add(s1);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6125() {
    group.add(s2);
    group.add(s3);
    group.add(s6);
    group.add(s4);
    group.add(s1);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6126() {
    group.add(s3);
    group.add(s2);
    group.add(s6);
    group.add(s4);
    group.add(s1);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6127() {
    group.add(s4);
    group.add(s2);
    group.add(s6);
    group.add(s3);
    group.add(s1);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6128() {
    group.add(s2);
    group.add(s4);
    group.add(s6);
    group.add(s3);
    group.add(s1);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6129() {
    group.add(s6);
    group.add(s4);
    group.add(s2);
    group.add(s3);
    group.add(s1);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6130() {
    group.add(s4);
    group.add(s6);
    group.add(s2);
    group.add(s3);
    group.add(s1);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6131() {
    group.add(s2);
    group.add(s6);
    group.add(s4);
    group.add(s3);
    group.add(s1);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6132() {
    group.add(s6);
    group.add(s2);
    group.add(s4);
    group.add(s3);
    group.add(s1);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6133() {
    group.add(s6);
    group.add(s3);
    group.add(s4);
    group.add(s2);
    group.add(s1);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6134() {
    group.add(s3);
    group.add(s6);
    group.add(s4);
    group.add(s2);
    group.add(s1);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6135() {
    group.add(s4);
    group.add(s6);
    group.add(s3);
    group.add(s2);
    group.add(s1);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6136() {
    group.add(s6);
    group.add(s4);
    group.add(s3);
    group.add(s2);
    group.add(s1);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6137() {
    group.add(s3);
    group.add(s4);
    group.add(s6);
    group.add(s2);
    group.add(s1);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6138() {
    group.add(s4);
    group.add(s3);
    group.add(s6);
    group.add(s2);
    group.add(s1);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6139() {
    group.add(s4);
    group.add(s3);
    group.add(s2);
    group.add(s6);
    group.add(s1);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6140() {
    group.add(s3);
    group.add(s4);
    group.add(s2);
    group.add(s6);
    group.add(s1);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6141() {
    group.add(s2);
    group.add(s4);
    group.add(s3);
    group.add(s6);
    group.add(s1);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6142() {
    group.add(s4);
    group.add(s2);
    group.add(s3);
    group.add(s6);
    group.add(s1);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6143() {
    group.add(s3);
    group.add(s2);
    group.add(s4);
    group.add(s6);
    group.add(s1);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6144() {
    group.add(s2);
    group.add(s3);
    group.add(s4);
    group.add(s6);
    group.add(s1);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6145() {
    group.add(s1);
    group.add(s3);
    group.add(s4);
    group.add(s6);
    group.add(s2);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6146() {
    group.add(s3);
    group.add(s1);
    group.add(s4);
    group.add(s6);
    group.add(s2);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6147() {
    group.add(s4);
    group.add(s1);
    group.add(s3);
    group.add(s6);
    group.add(s2);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6148() {
    group.add(s1);
    group.add(s4);
    group.add(s3);
    group.add(s6);
    group.add(s2);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6149() {
    group.add(s3);
    group.add(s4);
    group.add(s1);
    group.add(s6);
    group.add(s2);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6150() {
    group.add(s4);
    group.add(s3);
    group.add(s1);
    group.add(s6);
    group.add(s2);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6151() {
    group.add(s6);
    group.add(s3);
    group.add(s1);
    group.add(s4);
    group.add(s2);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6152() {
    group.add(s3);
    group.add(s6);
    group.add(s1);
    group.add(s4);
    group.add(s2);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6153() {
    group.add(s1);
    group.add(s6);
    group.add(s3);
    group.add(s4);
    group.add(s2);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6154() {
    group.add(s6);
    group.add(s1);
    group.add(s3);
    group.add(s4);
    group.add(s2);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6155() {
    group.add(s3);
    group.add(s1);
    group.add(s6);
    group.add(s4);
    group.add(s2);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6156() {
    group.add(s1);
    group.add(s3);
    group.add(s6);
    group.add(s4);
    group.add(s2);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6157() {
    group.add(s1);
    group.add(s4);
    group.add(s6);
    group.add(s3);
    group.add(s2);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6158() {
    group.add(s4);
    group.add(s1);
    group.add(s6);
    group.add(s3);
    group.add(s2);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6159() {
    group.add(s6);
    group.add(s1);
    group.add(s4);
    group.add(s3);
    group.add(s2);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6160() {
    group.add(s1);
    group.add(s6);
    group.add(s4);
    group.add(s3);
    group.add(s2);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6161() {
    group.add(s4);
    group.add(s6);
    group.add(s1);
    group.add(s3);
    group.add(s2);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6162() {
    group.add(s6);
    group.add(s4);
    group.add(s1);
    group.add(s3);
    group.add(s2);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6163() {
    group.add(s6);
    group.add(s4);
    group.add(s3);
    group.add(s1);
    group.add(s2);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6164() {
    group.add(s4);
    group.add(s6);
    group.add(s3);
    group.add(s1);
    group.add(s2);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6165() {
    group.add(s3);
    group.add(s6);
    group.add(s4);
    group.add(s1);
    group.add(s2);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6166() {
    group.add(s6);
    group.add(s3);
    group.add(s4);
    group.add(s1);
    group.add(s2);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6167() {
    group.add(s4);
    group.add(s3);
    group.add(s6);
    group.add(s1);
    group.add(s2);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6168() {
    group.add(s3);
    group.add(s4);
    group.add(s6);
    group.add(s1);
    group.add(s2);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6169() {
    group.add(s2);
    group.add(s4);
    group.add(s6);
    group.add(s1);
    group.add(s3);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6170() {
    group.add(s4);
    group.add(s2);
    group.add(s6);
    group.add(s1);
    group.add(s3);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6171() {
    group.add(s6);
    group.add(s2);
    group.add(s4);
    group.add(s1);
    group.add(s3);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6172() {
    group.add(s2);
    group.add(s6);
    group.add(s4);
    group.add(s1);
    group.add(s3);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6173() {
    group.add(s4);
    group.add(s6);
    group.add(s2);
    group.add(s1);
    group.add(s3);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6174() {
    group.add(s6);
    group.add(s4);
    group.add(s2);
    group.add(s1);
    group.add(s3);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6175() {
    group.add(s1);
    group.add(s4);
    group.add(s2);
    group.add(s6);
    group.add(s3);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6176() {
    group.add(s4);
    group.add(s1);
    group.add(s2);
    group.add(s6);
    group.add(s3);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6177() {
    group.add(s2);
    group.add(s1);
    group.add(s4);
    group.add(s6);
    group.add(s3);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6178() {
    group.add(s1);
    group.add(s2);
    group.add(s4);
    group.add(s6);
    group.add(s3);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6179() {
    group.add(s4);
    group.add(s2);
    group.add(s1);
    group.add(s6);
    group.add(s3);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6180() {
    group.add(s2);
    group.add(s4);
    group.add(s1);
    group.add(s6);
    group.add(s3);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6181() {
    group.add(s2);
    group.add(s6);
    group.add(s1);
    group.add(s4);
    group.add(s3);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6182() {
    group.add(s6);
    group.add(s2);
    group.add(s1);
    group.add(s4);
    group.add(s3);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6183() {
    group.add(s1);
    group.add(s2);
    group.add(s6);
    group.add(s4);
    group.add(s3);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6184() {
    group.add(s2);
    group.add(s1);
    group.add(s6);
    group.add(s4);
    group.add(s3);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6185() {
    group.add(s6);
    group.add(s1);
    group.add(s2);
    group.add(s4);
    group.add(s3);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6186() {
    group.add(s1);
    group.add(s6);
    group.add(s2);
    group.add(s4);
    group.add(s3);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6187() {
    group.add(s1);
    group.add(s6);
    group.add(s4);
    group.add(s2);
    group.add(s3);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6188() {
    group.add(s6);
    group.add(s1);
    group.add(s4);
    group.add(s2);
    group.add(s3);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6189() {
    group.add(s4);
    group.add(s1);
    group.add(s6);
    group.add(s2);
    group.add(s3);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6190() {
    group.add(s1);
    group.add(s4);
    group.add(s6);
    group.add(s2);
    group.add(s3);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6191() {
    group.add(s6);
    group.add(s4);
    group.add(s1);
    group.add(s2);
    group.add(s3);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6192() {
    group.add(s4);
    group.add(s6);
    group.add(s1);
    group.add(s2);
    group.add(s3);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6193() {
    group.add(s3);
    group.add(s6);
    group.add(s1);
    group.add(s2);
    group.add(s4);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6194() {
    group.add(s6);
    group.add(s3);
    group.add(s1);
    group.add(s2);
    group.add(s4);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6195() {
    group.add(s1);
    group.add(s3);
    group.add(s6);
    group.add(s2);
    group.add(s4);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6196() {
    group.add(s3);
    group.add(s1);
    group.add(s6);
    group.add(s2);
    group.add(s4);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6197() {
    group.add(s6);
    group.add(s1);
    group.add(s3);
    group.add(s2);
    group.add(s4);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6198() {
    group.add(s1);
    group.add(s6);
    group.add(s3);
    group.add(s2);
    group.add(s4);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6199() {
    group.add(s2);
    group.add(s6);
    group.add(s3);
    group.add(s1);
    group.add(s4);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6200() {
    group.add(s6);
    group.add(s2);
    group.add(s3);
    group.add(s1);
    group.add(s4);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6201() {
    group.add(s3);
    group.add(s2);
    group.add(s6);
    group.add(s1);
    group.add(s4);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6202() {
    group.add(s2);
    group.add(s3);
    group.add(s6);
    group.add(s1);
    group.add(s4);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6203() {
    group.add(s6);
    group.add(s3);
    group.add(s2);
    group.add(s1);
    group.add(s4);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6204() {
    group.add(s3);
    group.add(s6);
    group.add(s2);
    group.add(s1);
    group.add(s4);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6205() {
    group.add(s3);
    group.add(s1);
    group.add(s2);
    group.add(s6);
    group.add(s4);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6206() {
    group.add(s1);
    group.add(s3);
    group.add(s2);
    group.add(s6);
    group.add(s4);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6207() {
    group.add(s2);
    group.add(s3);
    group.add(s1);
    group.add(s6);
    group.add(s4);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6208() {
    group.add(s3);
    group.add(s2);
    group.add(s1);
    group.add(s6);
    group.add(s4);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6209() {
    group.add(s1);
    group.add(s2);
    group.add(s3);
    group.add(s6);
    group.add(s4);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6210() {
    group.add(s2);
    group.add(s1);
    group.add(s3);
    group.add(s6);
    group.add(s4);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6211() {
    group.add(s2);
    group.add(s1);
    group.add(s6);
    group.add(s3);
    group.add(s4);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6212() {
    group.add(s1);
    group.add(s2);
    group.add(s6);
    group.add(s3);
    group.add(s4);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6213() {
    group.add(s6);
    group.add(s2);
    group.add(s1);
    group.add(s3);
    group.add(s4);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6214() {
    group.add(s2);
    group.add(s6);
    group.add(s1);
    group.add(s3);
    group.add(s4);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6215() {
    group.add(s1);
    group.add(s6);
    group.add(s2);
    group.add(s3);
    group.add(s4);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6216() {
    group.add(s6);
    group.add(s1);
    group.add(s2);
    group.add(s3);
    group.add(s4);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6217() {
    group.add(s4);
    group.add(s1);
    group.add(s2);
    group.add(s3);
    group.add(s6);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6218() {
    group.add(s1);
    group.add(s4);
    group.add(s2);
    group.add(s3);
    group.add(s6);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6219() {
    group.add(s2);
    group.add(s4);
    group.add(s1);
    group.add(s3);
    group.add(s6);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6220() {
    group.add(s4);
    group.add(s2);
    group.add(s1);
    group.add(s3);
    group.add(s6);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6221() {
    group.add(s1);
    group.add(s2);
    group.add(s4);
    group.add(s3);
    group.add(s6);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6222() {
    group.add(s2);
    group.add(s1);
    group.add(s4);
    group.add(s3);
    group.add(s6);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6223() {
    group.add(s3);
    group.add(s1);
    group.add(s4);
    group.add(s2);
    group.add(s6);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6224() {
    group.add(s1);
    group.add(s3);
    group.add(s4);
    group.add(s2);
    group.add(s6);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6225() {
    group.add(s4);
    group.add(s3);
    group.add(s1);
    group.add(s2);
    group.add(s6);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6226() {
    group.add(s3);
    group.add(s4);
    group.add(s1);
    group.add(s2);
    group.add(s6);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6227() {
    group.add(s1);
    group.add(s4);
    group.add(s3);
    group.add(s2);
    group.add(s6);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6228() {
    group.add(s4);
    group.add(s1);
    group.add(s3);
    group.add(s2);
    group.add(s6);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6229() {
    group.add(s4);
    group.add(s2);
    group.add(s3);
    group.add(s1);
    group.add(s6);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6230() {
    group.add(s2);
    group.add(s4);
    group.add(s3);
    group.add(s1);
    group.add(s6);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6231() {
    group.add(s3);
    group.add(s4);
    group.add(s2);
    group.add(s1);
    group.add(s6);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6232() {
    group.add(s4);
    group.add(s3);
    group.add(s2);
    group.add(s1);
    group.add(s6);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6233() {
    group.add(s2);
    group.add(s3);
    group.add(s4);
    group.add(s1);
    group.add(s6);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6234() {
    group.add(s3);
    group.add(s2);
    group.add(s4);
    group.add(s1);
    group.add(s6);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6235() {
    group.add(s3);
    group.add(s2);
    group.add(s1);
    group.add(s4);
    group.add(s6);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6236() {
    group.add(s2);
    group.add(s3);
    group.add(s1);
    group.add(s4);
    group.add(s6);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6237() {
    group.add(s1);
    group.add(s3);
    group.add(s2);
    group.add(s4);
    group.add(s6);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6238() {
    group.add(s3);
    group.add(s1);
    group.add(s2);
    group.add(s4);
    group.add(s6);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6239() {
    group.add(s2);
    group.add(s1);
    group.add(s3);
    group.add(s4);
    group.add(s6);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6240() {
    group.add(s1);
    group.add(s2);
    group.add(s3);
    group.add(s4);
    group.add(s6);
    group.add(s5);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6241() {
    group.add(s1);
    group.add(s5);
    group.add(s3);
    group.add(s4);
    group.add(s6);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6242() {
    group.add(s5);
    group.add(s1);
    group.add(s3);
    group.add(s4);
    group.add(s6);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6243() {
    group.add(s3);
    group.add(s1);
    group.add(s5);
    group.add(s4);
    group.add(s6);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6244() {
    group.add(s1);
    group.add(s3);
    group.add(s5);
    group.add(s4);
    group.add(s6);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6245() {
    group.add(s5);
    group.add(s3);
    group.add(s1);
    group.add(s4);
    group.add(s6);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6246() {
    group.add(s3);
    group.add(s5);
    group.add(s1);
    group.add(s4);
    group.add(s6);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6247() {
    group.add(s4);
    group.add(s5);
    group.add(s1);
    group.add(s3);
    group.add(s6);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6248() {
    group.add(s5);
    group.add(s4);
    group.add(s1);
    group.add(s3);
    group.add(s6);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6249() {
    group.add(s1);
    group.add(s4);
    group.add(s5);
    group.add(s3);
    group.add(s6);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6250() {
    group.add(s4);
    group.add(s1);
    group.add(s5);
    group.add(s3);
    group.add(s6);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6251() {
    group.add(s5);
    group.add(s1);
    group.add(s4);
    group.add(s3);
    group.add(s6);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6252() {
    group.add(s1);
    group.add(s5);
    group.add(s4);
    group.add(s3);
    group.add(s6);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6253() {
    group.add(s1);
    group.add(s3);
    group.add(s4);
    group.add(s5);
    group.add(s6);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6254() {
    group.add(s3);
    group.add(s1);
    group.add(s4);
    group.add(s5);
    group.add(s6);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6255() {
    group.add(s4);
    group.add(s1);
    group.add(s3);
    group.add(s5);
    group.add(s6);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6256() {
    group.add(s1);
    group.add(s4);
    group.add(s3);
    group.add(s5);
    group.add(s6);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6257() {
    group.add(s3);
    group.add(s4);
    group.add(s1);
    group.add(s5);
    group.add(s6);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6258() {
    group.add(s4);
    group.add(s3);
    group.add(s1);
    group.add(s5);
    group.add(s6);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6259() {
    group.add(s4);
    group.add(s3);
    group.add(s5);
    group.add(s1);
    group.add(s6);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6260() {
    group.add(s3);
    group.add(s4);
    group.add(s5);
    group.add(s1);
    group.add(s6);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6261() {
    group.add(s5);
    group.add(s4);
    group.add(s3);
    group.add(s1);
    group.add(s6);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6262() {
    group.add(s4);
    group.add(s5);
    group.add(s3);
    group.add(s1);
    group.add(s6);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6263() {
    group.add(s3);
    group.add(s5);
    group.add(s4);
    group.add(s1);
    group.add(s6);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6264() {
    group.add(s5);
    group.add(s3);
    group.add(s4);
    group.add(s1);
    group.add(s6);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6265() {
    group.add(s6);
    group.add(s3);
    group.add(s4);
    group.add(s1);
    group.add(s5);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6266() {
    group.add(s3);
    group.add(s6);
    group.add(s4);
    group.add(s1);
    group.add(s5);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6267() {
    group.add(s4);
    group.add(s6);
    group.add(s3);
    group.add(s1);
    group.add(s5);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6268() {
    group.add(s6);
    group.add(s4);
    group.add(s3);
    group.add(s1);
    group.add(s5);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6269() {
    group.add(s3);
    group.add(s4);
    group.add(s6);
    group.add(s1);
    group.add(s5);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6270() {
    group.add(s4);
    group.add(s3);
    group.add(s6);
    group.add(s1);
    group.add(s5);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6271() {
    group.add(s1);
    group.add(s3);
    group.add(s6);
    group.add(s4);
    group.add(s5);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6272() {
    group.add(s3);
    group.add(s1);
    group.add(s6);
    group.add(s4);
    group.add(s5);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6273() {
    group.add(s6);
    group.add(s1);
    group.add(s3);
    group.add(s4);
    group.add(s5);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6274() {
    group.add(s1);
    group.add(s6);
    group.add(s3);
    group.add(s4);
    group.add(s5);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6275() {
    group.add(s3);
    group.add(s6);
    group.add(s1);
    group.add(s4);
    group.add(s5);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6276() {
    group.add(s6);
    group.add(s3);
    group.add(s1);
    group.add(s4);
    group.add(s5);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6277() {
    group.add(s6);
    group.add(s4);
    group.add(s1);
    group.add(s3);
    group.add(s5);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6278() {
    group.add(s4);
    group.add(s6);
    group.add(s1);
    group.add(s3);
    group.add(s5);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6279() {
    group.add(s1);
    group.add(s6);
    group.add(s4);
    group.add(s3);
    group.add(s5);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6280() {
    group.add(s6);
    group.add(s1);
    group.add(s4);
    group.add(s3);
    group.add(s5);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6281() {
    group.add(s4);
    group.add(s1);
    group.add(s6);
    group.add(s3);
    group.add(s5);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6282() {
    group.add(s1);
    group.add(s4);
    group.add(s6);
    group.add(s3);
    group.add(s5);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6283() {
    group.add(s1);
    group.add(s4);
    group.add(s3);
    group.add(s6);
    group.add(s5);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6284() {
    group.add(s4);
    group.add(s1);
    group.add(s3);
    group.add(s6);
    group.add(s5);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6285() {
    group.add(s3);
    group.add(s1);
    group.add(s4);
    group.add(s6);
    group.add(s5);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6286() {
    group.add(s1);
    group.add(s3);
    group.add(s4);
    group.add(s6);
    group.add(s5);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6287() {
    group.add(s4);
    group.add(s3);
    group.add(s1);
    group.add(s6);
    group.add(s5);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6288() {
    group.add(s3);
    group.add(s4);
    group.add(s1);
    group.add(s6);
    group.add(s5);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6289() {
    group.add(s5);
    group.add(s4);
    group.add(s1);
    group.add(s6);
    group.add(s3);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6290() {
    group.add(s4);
    group.add(s5);
    group.add(s1);
    group.add(s6);
    group.add(s3);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6291() {
    group.add(s1);
    group.add(s5);
    group.add(s4);
    group.add(s6);
    group.add(s3);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6292() {
    group.add(s5);
    group.add(s1);
    group.add(s4);
    group.add(s6);
    group.add(s3);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6293() {
    group.add(s4);
    group.add(s1);
    group.add(s5);
    group.add(s6);
    group.add(s3);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6294() {
    group.add(s1);
    group.add(s4);
    group.add(s5);
    group.add(s6);
    group.add(s3);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6295() {
    group.add(s6);
    group.add(s4);
    group.add(s5);
    group.add(s1);
    group.add(s3);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6296() {
    group.add(s4);
    group.add(s6);
    group.add(s5);
    group.add(s1);
    group.add(s3);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6297() {
    group.add(s5);
    group.add(s6);
    group.add(s4);
    group.add(s1);
    group.add(s3);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6298() {
    group.add(s6);
    group.add(s5);
    group.add(s4);
    group.add(s1);
    group.add(s3);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6299() {
    group.add(s4);
    group.add(s5);
    group.add(s6);
    group.add(s1);
    group.add(s3);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6300() {
    group.add(s5);
    group.add(s4);
    group.add(s6);
    group.add(s1);
    group.add(s3);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6301() {
    group.add(s5);
    group.add(s1);
    group.add(s6);
    group.add(s4);
    group.add(s3);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6302() {
    group.add(s1);
    group.add(s5);
    group.add(s6);
    group.add(s4);
    group.add(s3);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6303() {
    group.add(s6);
    group.add(s5);
    group.add(s1);
    group.add(s4);
    group.add(s3);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6304() {
    group.add(s5);
    group.add(s6);
    group.add(s1);
    group.add(s4);
    group.add(s3);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6305() {
    group.add(s1);
    group.add(s6);
    group.add(s5);
    group.add(s4);
    group.add(s3);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6306() {
    group.add(s6);
    group.add(s1);
    group.add(s5);
    group.add(s4);
    group.add(s3);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6307() {
    group.add(s6);
    group.add(s1);
    group.add(s4);
    group.add(s5);
    group.add(s3);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6308() {
    group.add(s1);
    group.add(s6);
    group.add(s4);
    group.add(s5);
    group.add(s3);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6309() {
    group.add(s4);
    group.add(s6);
    group.add(s1);
    group.add(s5);
    group.add(s3);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6310() {
    group.add(s6);
    group.add(s4);
    group.add(s1);
    group.add(s5);
    group.add(s3);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6311() {
    group.add(s1);
    group.add(s4);
    group.add(s6);
    group.add(s5);
    group.add(s3);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6312() {
    group.add(s4);
    group.add(s1);
    group.add(s6);
    group.add(s5);
    group.add(s3);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6313() {
    group.add(s3);
    group.add(s1);
    group.add(s6);
    group.add(s5);
    group.add(s4);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6314() {
    group.add(s1);
    group.add(s3);
    group.add(s6);
    group.add(s5);
    group.add(s4);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6315() {
    group.add(s6);
    group.add(s3);
    group.add(s1);
    group.add(s5);
    group.add(s4);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6316() {
    group.add(s3);
    group.add(s6);
    group.add(s1);
    group.add(s5);
    group.add(s4);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6317() {
    group.add(s1);
    group.add(s6);
    group.add(s3);
    group.add(s5);
    group.add(s4);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6318() {
    group.add(s6);
    group.add(s1);
    group.add(s3);
    group.add(s5);
    group.add(s4);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6319() {
    group.add(s5);
    group.add(s1);
    group.add(s3);
    group.add(s6);
    group.add(s4);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6320() {
    group.add(s1);
    group.add(s5);
    group.add(s3);
    group.add(s6);
    group.add(s4);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6321() {
    group.add(s3);
    group.add(s5);
    group.add(s1);
    group.add(s6);
    group.add(s4);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6322() {
    group.add(s5);
    group.add(s3);
    group.add(s1);
    group.add(s6);
    group.add(s4);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6323() {
    group.add(s1);
    group.add(s3);
    group.add(s5);
    group.add(s6);
    group.add(s4);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6324() {
    group.add(s3);
    group.add(s1);
    group.add(s5);
    group.add(s6);
    group.add(s4);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6325() {
    group.add(s3);
    group.add(s6);
    group.add(s5);
    group.add(s1);
    group.add(s4);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6326() {
    group.add(s6);
    group.add(s3);
    group.add(s5);
    group.add(s1);
    group.add(s4);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6327() {
    group.add(s5);
    group.add(s3);
    group.add(s6);
    group.add(s1);
    group.add(s4);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6328() {
    group.add(s3);
    group.add(s5);
    group.add(s6);
    group.add(s1);
    group.add(s4);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6329() {
    group.add(s6);
    group.add(s5);
    group.add(s3);
    group.add(s1);
    group.add(s4);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6330() {
    group.add(s5);
    group.add(s6);
    group.add(s3);
    group.add(s1);
    group.add(s4);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6331() {
    group.add(s5);
    group.add(s6);
    group.add(s1);
    group.add(s3);
    group.add(s4);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6332() {
    group.add(s6);
    group.add(s5);
    group.add(s1);
    group.add(s3);
    group.add(s4);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6333() {
    group.add(s1);
    group.add(s5);
    group.add(s6);
    group.add(s3);
    group.add(s4);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6334() {
    group.add(s5);
    group.add(s1);
    group.add(s6);
    group.add(s3);
    group.add(s4);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6335() {
    group.add(s6);
    group.add(s1);
    group.add(s5);
    group.add(s3);
    group.add(s4);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6336() {
    group.add(s1);
    group.add(s6);
    group.add(s5);
    group.add(s3);
    group.add(s4);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6337() {
    group.add(s4);
    group.add(s6);
    group.add(s5);
    group.add(s3);
    group.add(s1);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6338() {
    group.add(s6);
    group.add(s4);
    group.add(s5);
    group.add(s3);
    group.add(s1);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6339() {
    group.add(s5);
    group.add(s4);
    group.add(s6);
    group.add(s3);
    group.add(s1);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6340() {
    group.add(s4);
    group.add(s5);
    group.add(s6);
    group.add(s3);
    group.add(s1);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6341() {
    group.add(s6);
    group.add(s5);
    group.add(s4);
    group.add(s3);
    group.add(s1);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6342() {
    group.add(s5);
    group.add(s6);
    group.add(s4);
    group.add(s3);
    group.add(s1);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6343() {
    group.add(s3);
    group.add(s6);
    group.add(s4);
    group.add(s5);
    group.add(s1);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6344() {
    group.add(s6);
    group.add(s3);
    group.add(s4);
    group.add(s5);
    group.add(s1);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6345() {
    group.add(s4);
    group.add(s3);
    group.add(s6);
    group.add(s5);
    group.add(s1);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6346() {
    group.add(s3);
    group.add(s4);
    group.add(s6);
    group.add(s5);
    group.add(s1);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6347() {
    group.add(s6);
    group.add(s4);
    group.add(s3);
    group.add(s5);
    group.add(s1);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6348() {
    group.add(s4);
    group.add(s6);
    group.add(s3);
    group.add(s5);
    group.add(s1);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6349() {
    group.add(s4);
    group.add(s5);
    group.add(s3);
    group.add(s6);
    group.add(s1);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6350() {
    group.add(s5);
    group.add(s4);
    group.add(s3);
    group.add(s6);
    group.add(s1);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6351() {
    group.add(s3);
    group.add(s4);
    group.add(s5);
    group.add(s6);
    group.add(s1);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6352() {
    group.add(s4);
    group.add(s3);
    group.add(s5);
    group.add(s6);
    group.add(s1);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6353() {
    group.add(s5);
    group.add(s3);
    group.add(s4);
    group.add(s6);
    group.add(s1);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6354() {
    group.add(s3);
    group.add(s5);
    group.add(s4);
    group.add(s6);
    group.add(s1);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6355() {
    group.add(s3);
    group.add(s5);
    group.add(s6);
    group.add(s4);
    group.add(s1);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6356() {
    group.add(s5);
    group.add(s3);
    group.add(s6);
    group.add(s4);
    group.add(s1);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6357() {
    group.add(s6);
    group.add(s3);
    group.add(s5);
    group.add(s4);
    group.add(s1);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6358() {
    group.add(s3);
    group.add(s6);
    group.add(s5);
    group.add(s4);
    group.add(s1);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6359() {
    group.add(s5);
    group.add(s6);
    group.add(s3);
    group.add(s4);
    group.add(s1);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6360() {
    group.add(s6);
    group.add(s5);
    group.add(s3);
    group.add(s4);
    group.add(s1);
    group.add(s2);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6361() {
    group.add(s6);
    group.add(s5);
    group.add(s2);
    group.add(s4);
    group.add(s1);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6362() {
    group.add(s5);
    group.add(s6);
    group.add(s2);
    group.add(s4);
    group.add(s1);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6363() {
    group.add(s2);
    group.add(s6);
    group.add(s5);
    group.add(s4);
    group.add(s1);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6364() {
    group.add(s6);
    group.add(s2);
    group.add(s5);
    group.add(s4);
    group.add(s1);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6365() {
    group.add(s5);
    group.add(s2);
    group.add(s6);
    group.add(s4);
    group.add(s1);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6366() {
    group.add(s2);
    group.add(s5);
    group.add(s6);
    group.add(s4);
    group.add(s1);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6367() {
    group.add(s4);
    group.add(s5);
    group.add(s6);
    group.add(s2);
    group.add(s1);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6368() {
    group.add(s5);
    group.add(s4);
    group.add(s6);
    group.add(s2);
    group.add(s1);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6369() {
    group.add(s6);
    group.add(s4);
    group.add(s5);
    group.add(s2);
    group.add(s1);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6370() {
    group.add(s4);
    group.add(s6);
    group.add(s5);
    group.add(s2);
    group.add(s1);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6371() {
    group.add(s5);
    group.add(s6);
    group.add(s4);
    group.add(s2);
    group.add(s1);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6372() {
    group.add(s6);
    group.add(s5);
    group.add(s4);
    group.add(s2);
    group.add(s1);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6373() {
    group.add(s6);
    group.add(s2);
    group.add(s4);
    group.add(s5);
    group.add(s1);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6374() {
    group.add(s2);
    group.add(s6);
    group.add(s4);
    group.add(s5);
    group.add(s1);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6375() {
    group.add(s4);
    group.add(s6);
    group.add(s2);
    group.add(s5);
    group.add(s1);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6376() {
    group.add(s6);
    group.add(s4);
    group.add(s2);
    group.add(s5);
    group.add(s1);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6377() {
    group.add(s2);
    group.add(s4);
    group.add(s6);
    group.add(s5);
    group.add(s1);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6378() {
    group.add(s4);
    group.add(s2);
    group.add(s6);
    group.add(s5);
    group.add(s1);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6379() {
    group.add(s4);
    group.add(s2);
    group.add(s5);
    group.add(s6);
    group.add(s1);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6380() {
    group.add(s2);
    group.add(s4);
    group.add(s5);
    group.add(s6);
    group.add(s1);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6381() {
    group.add(s5);
    group.add(s4);
    group.add(s2);
    group.add(s6);
    group.add(s1);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6382() {
    group.add(s4);
    group.add(s5);
    group.add(s2);
    group.add(s6);
    group.add(s1);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6383() {
    group.add(s2);
    group.add(s5);
    group.add(s4);
    group.add(s6);
    group.add(s1);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6384() {
    group.add(s5);
    group.add(s2);
    group.add(s4);
    group.add(s6);
    group.add(s1);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6385() {
    group.add(s1);
    group.add(s2);
    group.add(s4);
    group.add(s6);
    group.add(s5);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6386() {
    group.add(s2);
    group.add(s1);
    group.add(s4);
    group.add(s6);
    group.add(s5);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6387() {
    group.add(s4);
    group.add(s1);
    group.add(s2);
    group.add(s6);
    group.add(s5);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6388() {
    group.add(s1);
    group.add(s4);
    group.add(s2);
    group.add(s6);
    group.add(s5);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6389() {
    group.add(s2);
    group.add(s4);
    group.add(s1);
    group.add(s6);
    group.add(s5);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6390() {
    group.add(s4);
    group.add(s2);
    group.add(s1);
    group.add(s6);
    group.add(s5);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6391() {
    group.add(s6);
    group.add(s2);
    group.add(s1);
    group.add(s4);
    group.add(s5);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6392() {
    group.add(s2);
    group.add(s6);
    group.add(s1);
    group.add(s4);
    group.add(s5);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6393() {
    group.add(s1);
    group.add(s6);
    group.add(s2);
    group.add(s4);
    group.add(s5);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6394() {
    group.add(s6);
    group.add(s1);
    group.add(s2);
    group.add(s4);
    group.add(s5);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6395() {
    group.add(s2);
    group.add(s1);
    group.add(s6);
    group.add(s4);
    group.add(s5);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6396() {
    group.add(s1);
    group.add(s2);
    group.add(s6);
    group.add(s4);
    group.add(s5);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6397() {
    group.add(s1);
    group.add(s4);
    group.add(s6);
    group.add(s2);
    group.add(s5);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6398() {
    group.add(s4);
    group.add(s1);
    group.add(s6);
    group.add(s2);
    group.add(s5);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6399() {
    group.add(s6);
    group.add(s1);
    group.add(s4);
    group.add(s2);
    group.add(s5);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6400() {
    group.add(s1);
    group.add(s6);
    group.add(s4);
    group.add(s2);
    group.add(s5);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6401() {
    group.add(s4);
    group.add(s6);
    group.add(s1);
    group.add(s2);
    group.add(s5);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6402() {
    group.add(s6);
    group.add(s4);
    group.add(s1);
    group.add(s2);
    group.add(s5);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6403() {
    group.add(s6);
    group.add(s4);
    group.add(s2);
    group.add(s1);
    group.add(s5);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6404() {
    group.add(s4);
    group.add(s6);
    group.add(s2);
    group.add(s1);
    group.add(s5);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6405() {
    group.add(s2);
    group.add(s6);
    group.add(s4);
    group.add(s1);
    group.add(s5);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6406() {
    group.add(s6);
    group.add(s2);
    group.add(s4);
    group.add(s1);
    group.add(s5);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6407() {
    group.add(s4);
    group.add(s2);
    group.add(s6);
    group.add(s1);
    group.add(s5);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6408() {
    group.add(s2);
    group.add(s4);
    group.add(s6);
    group.add(s1);
    group.add(s5);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6409() {
    group.add(s5);
    group.add(s4);
    group.add(s6);
    group.add(s1);
    group.add(s2);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6410() {
    group.add(s4);
    group.add(s5);
    group.add(s6);
    group.add(s1);
    group.add(s2);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6411() {
    group.add(s6);
    group.add(s5);
    group.add(s4);
    group.add(s1);
    group.add(s2);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6412() {
    group.add(s5);
    group.add(s6);
    group.add(s4);
    group.add(s1);
    group.add(s2);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6413() {
    group.add(s4);
    group.add(s6);
    group.add(s5);
    group.add(s1);
    group.add(s2);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6414() {
    group.add(s6);
    group.add(s4);
    group.add(s5);
    group.add(s1);
    group.add(s2);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6415() {
    group.add(s1);
    group.add(s4);
    group.add(s5);
    group.add(s6);
    group.add(s2);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6416() {
    group.add(s4);
    group.add(s1);
    group.add(s5);
    group.add(s6);
    group.add(s2);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6417() {
    group.add(s5);
    group.add(s1);
    group.add(s4);
    group.add(s6);
    group.add(s2);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6418() {
    group.add(s1);
    group.add(s5);
    group.add(s4);
    group.add(s6);
    group.add(s2);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6419() {
    group.add(s4);
    group.add(s5);
    group.add(s1);
    group.add(s6);
    group.add(s2);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6420() {
    group.add(s5);
    group.add(s4);
    group.add(s1);
    group.add(s6);
    group.add(s2);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6421() {
    group.add(s5);
    group.add(s6);
    group.add(s1);
    group.add(s4);
    group.add(s2);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6422() {
    group.add(s6);
    group.add(s5);
    group.add(s1);
    group.add(s4);
    group.add(s2);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6423() {
    group.add(s1);
    group.add(s5);
    group.add(s6);
    group.add(s4);
    group.add(s2);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6424() {
    group.add(s5);
    group.add(s1);
    group.add(s6);
    group.add(s4);
    group.add(s2);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6425() {
    group.add(s6);
    group.add(s1);
    group.add(s5);
    group.add(s4);
    group.add(s2);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6426() {
    group.add(s1);
    group.add(s6);
    group.add(s5);
    group.add(s4);
    group.add(s2);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6427() {
    group.add(s1);
    group.add(s6);
    group.add(s4);
    group.add(s5);
    group.add(s2);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6428() {
    group.add(s6);
    group.add(s1);
    group.add(s4);
    group.add(s5);
    group.add(s2);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6429() {
    group.add(s4);
    group.add(s1);
    group.add(s6);
    group.add(s5);
    group.add(s2);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6430() {
    group.add(s1);
    group.add(s4);
    group.add(s6);
    group.add(s5);
    group.add(s2);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6431() {
    group.add(s6);
    group.add(s4);
    group.add(s1);
    group.add(s5);
    group.add(s2);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6432() {
    group.add(s4);
    group.add(s6);
    group.add(s1);
    group.add(s5);
    group.add(s2);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6433() {
    group.add(s2);
    group.add(s6);
    group.add(s1);
    group.add(s5);
    group.add(s4);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6434() {
    group.add(s6);
    group.add(s2);
    group.add(s1);
    group.add(s5);
    group.add(s4);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6435() {
    group.add(s1);
    group.add(s2);
    group.add(s6);
    group.add(s5);
    group.add(s4);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6436() {
    group.add(s2);
    group.add(s1);
    group.add(s6);
    group.add(s5);
    group.add(s4);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6437() {
    group.add(s6);
    group.add(s1);
    group.add(s2);
    group.add(s5);
    group.add(s4);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6438() {
    group.add(s1);
    group.add(s6);
    group.add(s2);
    group.add(s5);
    group.add(s4);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6439() {
    group.add(s5);
    group.add(s6);
    group.add(s2);
    group.add(s1);
    group.add(s4);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6440() {
    group.add(s6);
    group.add(s5);
    group.add(s2);
    group.add(s1);
    group.add(s4);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6441() {
    group.add(s2);
    group.add(s5);
    group.add(s6);
    group.add(s1);
    group.add(s4);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6442() {
    group.add(s5);
    group.add(s2);
    group.add(s6);
    group.add(s1);
    group.add(s4);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6443() {
    group.add(s6);
    group.add(s2);
    group.add(s5);
    group.add(s1);
    group.add(s4);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6444() {
    group.add(s2);
    group.add(s6);
    group.add(s5);
    group.add(s1);
    group.add(s4);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6445() {
    group.add(s2);
    group.add(s1);
    group.add(s5);
    group.add(s6);
    group.add(s4);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6446() {
    group.add(s1);
    group.add(s2);
    group.add(s5);
    group.add(s6);
    group.add(s4);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6447() {
    group.add(s5);
    group.add(s2);
    group.add(s1);
    group.add(s6);
    group.add(s4);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6448() {
    group.add(s2);
    group.add(s5);
    group.add(s1);
    group.add(s6);
    group.add(s4);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6449() {
    group.add(s1);
    group.add(s5);
    group.add(s2);
    group.add(s6);
    group.add(s4);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6450() {
    group.add(s5);
    group.add(s1);
    group.add(s2);
    group.add(s6);
    group.add(s4);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6451() {
    group.add(s5);
    group.add(s1);
    group.add(s6);
    group.add(s2);
    group.add(s4);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6452() {
    group.add(s1);
    group.add(s5);
    group.add(s6);
    group.add(s2);
    group.add(s4);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6453() {
    group.add(s6);
    group.add(s5);
    group.add(s1);
    group.add(s2);
    group.add(s4);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6454() {
    group.add(s5);
    group.add(s6);
    group.add(s1);
    group.add(s2);
    group.add(s4);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6455() {
    group.add(s1);
    group.add(s6);
    group.add(s5);
    group.add(s2);
    group.add(s4);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6456() {
    group.add(s6);
    group.add(s1);
    group.add(s5);
    group.add(s2);
    group.add(s4);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6457() {
    group.add(s4);
    group.add(s1);
    group.add(s5);
    group.add(s2);
    group.add(s6);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6458() {
    group.add(s1);
    group.add(s4);
    group.add(s5);
    group.add(s2);
    group.add(s6);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6459() {
    group.add(s5);
    group.add(s4);
    group.add(s1);
    group.add(s2);
    group.add(s6);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6460() {
    group.add(s4);
    group.add(s5);
    group.add(s1);
    group.add(s2);
    group.add(s6);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6461() {
    group.add(s1);
    group.add(s5);
    group.add(s4);
    group.add(s2);
    group.add(s6);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6462() {
    group.add(s5);
    group.add(s1);
    group.add(s4);
    group.add(s2);
    group.add(s6);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6463() {
    group.add(s2);
    group.add(s1);
    group.add(s4);
    group.add(s5);
    group.add(s6);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6464() {
    group.add(s1);
    group.add(s2);
    group.add(s4);
    group.add(s5);
    group.add(s6);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6465() {
    group.add(s4);
    group.add(s2);
    group.add(s1);
    group.add(s5);
    group.add(s6);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6466() {
    group.add(s2);
    group.add(s4);
    group.add(s1);
    group.add(s5);
    group.add(s6);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6467() {
    group.add(s1);
    group.add(s4);
    group.add(s2);
    group.add(s5);
    group.add(s6);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6468() {
    group.add(s4);
    group.add(s1);
    group.add(s2);
    group.add(s5);
    group.add(s6);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6469() {
    group.add(s4);
    group.add(s5);
    group.add(s2);
    group.add(s1);
    group.add(s6);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6470() {
    group.add(s5);
    group.add(s4);
    group.add(s2);
    group.add(s1);
    group.add(s6);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6471() {
    group.add(s2);
    group.add(s4);
    group.add(s5);
    group.add(s1);
    group.add(s6);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6472() {
    group.add(s4);
    group.add(s2);
    group.add(s5);
    group.add(s1);
    group.add(s6);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6473() {
    group.add(s5);
    group.add(s2);
    group.add(s4);
    group.add(s1);
    group.add(s6);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6474() {
    group.add(s2);
    group.add(s5);
    group.add(s4);
    group.add(s1);
    group.add(s6);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6475() {
    group.add(s2);
    group.add(s5);
    group.add(s1);
    group.add(s4);
    group.add(s6);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6476() {
    group.add(s5);
    group.add(s2);
    group.add(s1);
    group.add(s4);
    group.add(s6);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6477() {
    group.add(s1);
    group.add(s2);
    group.add(s5);
    group.add(s4);
    group.add(s6);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6478() {
    group.add(s2);
    group.add(s1);
    group.add(s5);
    group.add(s4);
    group.add(s6);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6479() {
    group.add(s5);
    group.add(s1);
    group.add(s2);
    group.add(s4);
    group.add(s6);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6480() {
    group.add(s1);
    group.add(s5);
    group.add(s2);
    group.add(s4);
    group.add(s6);
    group.add(s3);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6481() {
    group.add(s1);
    group.add(s5);
    group.add(s2);
    group.add(s3);
    group.add(s6);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6482() {
    group.add(s5);
    group.add(s1);
    group.add(s2);
    group.add(s3);
    group.add(s6);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6483() {
    group.add(s2);
    group.add(s1);
    group.add(s5);
    group.add(s3);
    group.add(s6);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6484() {
    group.add(s1);
    group.add(s2);
    group.add(s5);
    group.add(s3);
    group.add(s6);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6485() {
    group.add(s5);
    group.add(s2);
    group.add(s1);
    group.add(s3);
    group.add(s6);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6486() {
    group.add(s2);
    group.add(s5);
    group.add(s1);
    group.add(s3);
    group.add(s6);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6487() {
    group.add(s3);
    group.add(s5);
    group.add(s1);
    group.add(s2);
    group.add(s6);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6488() {
    group.add(s5);
    group.add(s3);
    group.add(s1);
    group.add(s2);
    group.add(s6);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6489() {
    group.add(s1);
    group.add(s3);
    group.add(s5);
    group.add(s2);
    group.add(s6);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6490() {
    group.add(s3);
    group.add(s1);
    group.add(s5);
    group.add(s2);
    group.add(s6);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6491() {
    group.add(s5);
    group.add(s1);
    group.add(s3);
    group.add(s2);
    group.add(s6);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6492() {
    group.add(s1);
    group.add(s5);
    group.add(s3);
    group.add(s2);
    group.add(s6);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6493() {
    group.add(s1);
    group.add(s2);
    group.add(s3);
    group.add(s5);
    group.add(s6);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6494() {
    group.add(s2);
    group.add(s1);
    group.add(s3);
    group.add(s5);
    group.add(s6);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6495() {
    group.add(s3);
    group.add(s1);
    group.add(s2);
    group.add(s5);
    group.add(s6);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6496() {
    group.add(s1);
    group.add(s3);
    group.add(s2);
    group.add(s5);
    group.add(s6);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6497() {
    group.add(s2);
    group.add(s3);
    group.add(s1);
    group.add(s5);
    group.add(s6);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6498() {
    group.add(s3);
    group.add(s2);
    group.add(s1);
    group.add(s5);
    group.add(s6);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6499() {
    group.add(s3);
    group.add(s2);
    group.add(s5);
    group.add(s1);
    group.add(s6);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6500() {
    group.add(s2);
    group.add(s3);
    group.add(s5);
    group.add(s1);
    group.add(s6);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6501() {
    group.add(s5);
    group.add(s3);
    group.add(s2);
    group.add(s1);
    group.add(s6);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6502() {
    group.add(s3);
    group.add(s5);
    group.add(s2);
    group.add(s1);
    group.add(s6);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6503() {
    group.add(s2);
    group.add(s5);
    group.add(s3);
    group.add(s1);
    group.add(s6);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6504() {
    group.add(s5);
    group.add(s2);
    group.add(s3);
    group.add(s1);
    group.add(s6);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6505() {
    group.add(s6);
    group.add(s2);
    group.add(s3);
    group.add(s1);
    group.add(s5);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6506() {
    group.add(s2);
    group.add(s6);
    group.add(s3);
    group.add(s1);
    group.add(s5);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6507() {
    group.add(s3);
    group.add(s6);
    group.add(s2);
    group.add(s1);
    group.add(s5);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6508() {
    group.add(s6);
    group.add(s3);
    group.add(s2);
    group.add(s1);
    group.add(s5);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6509() {
    group.add(s2);
    group.add(s3);
    group.add(s6);
    group.add(s1);
    group.add(s5);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6510() {
    group.add(s3);
    group.add(s2);
    group.add(s6);
    group.add(s1);
    group.add(s5);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6511() {
    group.add(s1);
    group.add(s2);
    group.add(s6);
    group.add(s3);
    group.add(s5);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6512() {
    group.add(s2);
    group.add(s1);
    group.add(s6);
    group.add(s3);
    group.add(s5);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6513() {
    group.add(s6);
    group.add(s1);
    group.add(s2);
    group.add(s3);
    group.add(s5);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6514() {
    group.add(s1);
    group.add(s6);
    group.add(s2);
    group.add(s3);
    group.add(s5);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6515() {
    group.add(s2);
    group.add(s6);
    group.add(s1);
    group.add(s3);
    group.add(s5);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6516() {
    group.add(s6);
    group.add(s2);
    group.add(s1);
    group.add(s3);
    group.add(s5);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6517() {
    group.add(s6);
    group.add(s3);
    group.add(s1);
    group.add(s2);
    group.add(s5);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6518() {
    group.add(s3);
    group.add(s6);
    group.add(s1);
    group.add(s2);
    group.add(s5);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6519() {
    group.add(s1);
    group.add(s6);
    group.add(s3);
    group.add(s2);
    group.add(s5);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6520() {
    group.add(s6);
    group.add(s1);
    group.add(s3);
    group.add(s2);
    group.add(s5);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6521() {
    group.add(s3);
    group.add(s1);
    group.add(s6);
    group.add(s2);
    group.add(s5);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6522() {
    group.add(s1);
    group.add(s3);
    group.add(s6);
    group.add(s2);
    group.add(s5);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6523() {
    group.add(s1);
    group.add(s3);
    group.add(s2);
    group.add(s6);
    group.add(s5);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6524() {
    group.add(s3);
    group.add(s1);
    group.add(s2);
    group.add(s6);
    group.add(s5);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6525() {
    group.add(s2);
    group.add(s1);
    group.add(s3);
    group.add(s6);
    group.add(s5);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6526() {
    group.add(s1);
    group.add(s2);
    group.add(s3);
    group.add(s6);
    group.add(s5);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6527() {
    group.add(s3);
    group.add(s2);
    group.add(s1);
    group.add(s6);
    group.add(s5);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6528() {
    group.add(s2);
    group.add(s3);
    group.add(s1);
    group.add(s6);
    group.add(s5);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6529() {
    group.add(s5);
    group.add(s3);
    group.add(s1);
    group.add(s6);
    group.add(s2);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6530() {
    group.add(s3);
    group.add(s5);
    group.add(s1);
    group.add(s6);
    group.add(s2);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6531() {
    group.add(s1);
    group.add(s5);
    group.add(s3);
    group.add(s6);
    group.add(s2);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6532() {
    group.add(s5);
    group.add(s1);
    group.add(s3);
    group.add(s6);
    group.add(s2);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6533() {
    group.add(s3);
    group.add(s1);
    group.add(s5);
    group.add(s6);
    group.add(s2);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6534() {
    group.add(s1);
    group.add(s3);
    group.add(s5);
    group.add(s6);
    group.add(s2);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6535() {
    group.add(s6);
    group.add(s3);
    group.add(s5);
    group.add(s1);
    group.add(s2);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6536() {
    group.add(s3);
    group.add(s6);
    group.add(s5);
    group.add(s1);
    group.add(s2);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6537() {
    group.add(s5);
    group.add(s6);
    group.add(s3);
    group.add(s1);
    group.add(s2);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6538() {
    group.add(s6);
    group.add(s5);
    group.add(s3);
    group.add(s1);
    group.add(s2);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6539() {
    group.add(s3);
    group.add(s5);
    group.add(s6);
    group.add(s1);
    group.add(s2);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6540() {
    group.add(s5);
    group.add(s3);
    group.add(s6);
    group.add(s1);
    group.add(s2);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6541() {
    group.add(s5);
    group.add(s1);
    group.add(s6);
    group.add(s3);
    group.add(s2);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6542() {
    group.add(s1);
    group.add(s5);
    group.add(s6);
    group.add(s3);
    group.add(s2);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6543() {
    group.add(s6);
    group.add(s5);
    group.add(s1);
    group.add(s3);
    group.add(s2);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6544() {
    group.add(s5);
    group.add(s6);
    group.add(s1);
    group.add(s3);
    group.add(s2);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6545() {
    group.add(s1);
    group.add(s6);
    group.add(s5);
    group.add(s3);
    group.add(s2);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6546() {
    group.add(s6);
    group.add(s1);
    group.add(s5);
    group.add(s3);
    group.add(s2);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6547() {
    group.add(s6);
    group.add(s1);
    group.add(s3);
    group.add(s5);
    group.add(s2);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6548() {
    group.add(s1);
    group.add(s6);
    group.add(s3);
    group.add(s5);
    group.add(s2);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6549() {
    group.add(s3);
    group.add(s6);
    group.add(s1);
    group.add(s5);
    group.add(s2);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6550() {
    group.add(s6);
    group.add(s3);
    group.add(s1);
    group.add(s5);
    group.add(s2);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6551() {
    group.add(s1);
    group.add(s3);
    group.add(s6);
    group.add(s5);
    group.add(s2);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6552() {
    group.add(s3);
    group.add(s1);
    group.add(s6);
    group.add(s5);
    group.add(s2);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6553() {
    group.add(s2);
    group.add(s1);
    group.add(s6);
    group.add(s5);
    group.add(s3);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6554() {
    group.add(s1);
    group.add(s2);
    group.add(s6);
    group.add(s5);
    group.add(s3);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6555() {
    group.add(s6);
    group.add(s2);
    group.add(s1);
    group.add(s5);
    group.add(s3);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6556() {
    group.add(s2);
    group.add(s6);
    group.add(s1);
    group.add(s5);
    group.add(s3);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6557() {
    group.add(s1);
    group.add(s6);
    group.add(s2);
    group.add(s5);
    group.add(s3);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6558() {
    group.add(s6);
    group.add(s1);
    group.add(s2);
    group.add(s5);
    group.add(s3);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6559() {
    group.add(s5);
    group.add(s1);
    group.add(s2);
    group.add(s6);
    group.add(s3);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6560() {
    group.add(s1);
    group.add(s5);
    group.add(s2);
    group.add(s6);
    group.add(s3);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6561() {
    group.add(s2);
    group.add(s5);
    group.add(s1);
    group.add(s6);
    group.add(s3);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6562() {
    group.add(s5);
    group.add(s2);
    group.add(s1);
    group.add(s6);
    group.add(s3);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6563() {
    group.add(s1);
    group.add(s2);
    group.add(s5);
    group.add(s6);
    group.add(s3);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6564() {
    group.add(s2);
    group.add(s1);
    group.add(s5);
    group.add(s6);
    group.add(s3);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6565() {
    group.add(s2);
    group.add(s6);
    group.add(s5);
    group.add(s1);
    group.add(s3);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6566() {
    group.add(s6);
    group.add(s2);
    group.add(s5);
    group.add(s1);
    group.add(s3);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6567() {
    group.add(s5);
    group.add(s2);
    group.add(s6);
    group.add(s1);
    group.add(s3);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6568() {
    group.add(s2);
    group.add(s5);
    group.add(s6);
    group.add(s1);
    group.add(s3);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6569() {
    group.add(s6);
    group.add(s5);
    group.add(s2);
    group.add(s1);
    group.add(s3);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6570() {
    group.add(s5);
    group.add(s6);
    group.add(s2);
    group.add(s1);
    group.add(s3);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6571() {
    group.add(s5);
    group.add(s6);
    group.add(s1);
    group.add(s2);
    group.add(s3);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6572() {
    group.add(s6);
    group.add(s5);
    group.add(s1);
    group.add(s2);
    group.add(s3);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6573() {
    group.add(s1);
    group.add(s5);
    group.add(s6);
    group.add(s2);
    group.add(s3);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6574() {
    group.add(s5);
    group.add(s1);
    group.add(s6);
    group.add(s2);
    group.add(s3);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6575() {
    group.add(s6);
    group.add(s1);
    group.add(s5);
    group.add(s2);
    group.add(s3);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6576() {
    group.add(s1);
    group.add(s6);
    group.add(s5);
    group.add(s2);
    group.add(s3);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6577() {
    group.add(s3);
    group.add(s6);
    group.add(s5);
    group.add(s2);
    group.add(s1);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6578() {
    group.add(s6);
    group.add(s3);
    group.add(s5);
    group.add(s2);
    group.add(s1);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6579() {
    group.add(s5);
    group.add(s3);
    group.add(s6);
    group.add(s2);
    group.add(s1);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6580() {
    group.add(s3);
    group.add(s5);
    group.add(s6);
    group.add(s2);
    group.add(s1);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6581() {
    group.add(s6);
    group.add(s5);
    group.add(s3);
    group.add(s2);
    group.add(s1);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6582() {
    group.add(s5);
    group.add(s6);
    group.add(s3);
    group.add(s2);
    group.add(s1);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6583() {
    group.add(s2);
    group.add(s6);
    group.add(s3);
    group.add(s5);
    group.add(s1);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6584() {
    group.add(s6);
    group.add(s2);
    group.add(s3);
    group.add(s5);
    group.add(s1);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6585() {
    group.add(s3);
    group.add(s2);
    group.add(s6);
    group.add(s5);
    group.add(s1);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6586() {
    group.add(s2);
    group.add(s3);
    group.add(s6);
    group.add(s5);
    group.add(s1);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6587() {
    group.add(s6);
    group.add(s3);
    group.add(s2);
    group.add(s5);
    group.add(s1);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6588() {
    group.add(s3);
    group.add(s6);
    group.add(s2);
    group.add(s5);
    group.add(s1);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6589() {
    group.add(s3);
    group.add(s5);
    group.add(s2);
    group.add(s6);
    group.add(s1);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6590() {
    group.add(s5);
    group.add(s3);
    group.add(s2);
    group.add(s6);
    group.add(s1);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6591() {
    group.add(s2);
    group.add(s3);
    group.add(s5);
    group.add(s6);
    group.add(s1);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6592() {
    group.add(s3);
    group.add(s2);
    group.add(s5);
    group.add(s6);
    group.add(s1);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6593() {
    group.add(s5);
    group.add(s2);
    group.add(s3);
    group.add(s6);
    group.add(s1);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6594() {
    group.add(s2);
    group.add(s5);
    group.add(s3);
    group.add(s6);
    group.add(s1);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6595() {
    group.add(s2);
    group.add(s5);
    group.add(s6);
    group.add(s3);
    group.add(s1);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6596() {
    group.add(s5);
    group.add(s2);
    group.add(s6);
    group.add(s3);
    group.add(s1);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6597() {
    group.add(s6);
    group.add(s2);
    group.add(s5);
    group.add(s3);
    group.add(s1);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6598() {
    group.add(s2);
    group.add(s6);
    group.add(s5);
    group.add(s3);
    group.add(s1);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6599() {
    group.add(s5);
    group.add(s6);
    group.add(s2);
    group.add(s3);
    group.add(s1);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6600() {
    group.add(s6);
    group.add(s5);
    group.add(s2);
    group.add(s3);
    group.add(s1);
    group.add(s4);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6601() {
    group.add(s6);
    group.add(s5);
    group.add(s2);
    group.add(s3);
    group.add(s4);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6602() {
    group.add(s5);
    group.add(s6);
    group.add(s2);
    group.add(s3);
    group.add(s4);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6603() {
    group.add(s2);
    group.add(s6);
    group.add(s5);
    group.add(s3);
    group.add(s4);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6604() {
    group.add(s6);
    group.add(s2);
    group.add(s5);
    group.add(s3);
    group.add(s4);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6605() {
    group.add(s5);
    group.add(s2);
    group.add(s6);
    group.add(s3);
    group.add(s4);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6606() {
    group.add(s2);
    group.add(s5);
    group.add(s6);
    group.add(s3);
    group.add(s4);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6607() {
    group.add(s3);
    group.add(s5);
    group.add(s6);
    group.add(s2);
    group.add(s4);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6608() {
    group.add(s5);
    group.add(s3);
    group.add(s6);
    group.add(s2);
    group.add(s4);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6609() {
    group.add(s6);
    group.add(s3);
    group.add(s5);
    group.add(s2);
    group.add(s4);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6610() {
    group.add(s3);
    group.add(s6);
    group.add(s5);
    group.add(s2);
    group.add(s4);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6611() {
    group.add(s5);
    group.add(s6);
    group.add(s3);
    group.add(s2);
    group.add(s4);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6612() {
    group.add(s6);
    group.add(s5);
    group.add(s3);
    group.add(s2);
    group.add(s4);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6613() {
    group.add(s6);
    group.add(s2);
    group.add(s3);
    group.add(s5);
    group.add(s4);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6614() {
    group.add(s2);
    group.add(s6);
    group.add(s3);
    group.add(s5);
    group.add(s4);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6615() {
    group.add(s3);
    group.add(s6);
    group.add(s2);
    group.add(s5);
    group.add(s4);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6616() {
    group.add(s6);
    group.add(s3);
    group.add(s2);
    group.add(s5);
    group.add(s4);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6617() {
    group.add(s2);
    group.add(s3);
    group.add(s6);
    group.add(s5);
    group.add(s4);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6618() {
    group.add(s3);
    group.add(s2);
    group.add(s6);
    group.add(s5);
    group.add(s4);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6619() {
    group.add(s3);
    group.add(s2);
    group.add(s5);
    group.add(s6);
    group.add(s4);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6620() {
    group.add(s2);
    group.add(s3);
    group.add(s5);
    group.add(s6);
    group.add(s4);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6621() {
    group.add(s5);
    group.add(s3);
    group.add(s2);
    group.add(s6);
    group.add(s4);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6622() {
    group.add(s3);
    group.add(s5);
    group.add(s2);
    group.add(s6);
    group.add(s4);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6623() {
    group.add(s2);
    group.add(s5);
    group.add(s3);
    group.add(s6);
    group.add(s4);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6624() {
    group.add(s5);
    group.add(s2);
    group.add(s3);
    group.add(s6);
    group.add(s4);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6625() {
    group.add(s4);
    group.add(s2);
    group.add(s3);
    group.add(s6);
    group.add(s5);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6626() {
    group.add(s2);
    group.add(s4);
    group.add(s3);
    group.add(s6);
    group.add(s5);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6627() {
    group.add(s3);
    group.add(s4);
    group.add(s2);
    group.add(s6);
    group.add(s5);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6628() {
    group.add(s4);
    group.add(s3);
    group.add(s2);
    group.add(s6);
    group.add(s5);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6629() {
    group.add(s2);
    group.add(s3);
    group.add(s4);
    group.add(s6);
    group.add(s5);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6630() {
    group.add(s3);
    group.add(s2);
    group.add(s4);
    group.add(s6);
    group.add(s5);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6631() {
    group.add(s6);
    group.add(s2);
    group.add(s4);
    group.add(s3);
    group.add(s5);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6632() {
    group.add(s2);
    group.add(s6);
    group.add(s4);
    group.add(s3);
    group.add(s5);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6633() {
    group.add(s4);
    group.add(s6);
    group.add(s2);
    group.add(s3);
    group.add(s5);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6634() {
    group.add(s6);
    group.add(s4);
    group.add(s2);
    group.add(s3);
    group.add(s5);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6635() {
    group.add(s2);
    group.add(s4);
    group.add(s6);
    group.add(s3);
    group.add(s5);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6636() {
    group.add(s4);
    group.add(s2);
    group.add(s6);
    group.add(s3);
    group.add(s5);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6637() {
    group.add(s4);
    group.add(s3);
    group.add(s6);
    group.add(s2);
    group.add(s5);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6638() {
    group.add(s3);
    group.add(s4);
    group.add(s6);
    group.add(s2);
    group.add(s5);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6639() {
    group.add(s6);
    group.add(s4);
    group.add(s3);
    group.add(s2);
    group.add(s5);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6640() {
    group.add(s4);
    group.add(s6);
    group.add(s3);
    group.add(s2);
    group.add(s5);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6641() {
    group.add(s3);
    group.add(s6);
    group.add(s4);
    group.add(s2);
    group.add(s5);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6642() {
    group.add(s6);
    group.add(s3);
    group.add(s4);
    group.add(s2);
    group.add(s5);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6643() {
    group.add(s6);
    group.add(s3);
    group.add(s2);
    group.add(s4);
    group.add(s5);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6644() {
    group.add(s3);
    group.add(s6);
    group.add(s2);
    group.add(s4);
    group.add(s5);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6645() {
    group.add(s2);
    group.add(s6);
    group.add(s3);
    group.add(s4);
    group.add(s5);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6646() {
    group.add(s6);
    group.add(s2);
    group.add(s3);
    group.add(s4);
    group.add(s5);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6647() {
    group.add(s3);
    group.add(s2);
    group.add(s6);
    group.add(s4);
    group.add(s5);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6648() {
    group.add(s2);
    group.add(s3);
    group.add(s6);
    group.add(s4);
    group.add(s5);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6649() {
    group.add(s5);
    group.add(s3);
    group.add(s6);
    group.add(s4);
    group.add(s2);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6650() {
    group.add(s3);
    group.add(s5);
    group.add(s6);
    group.add(s4);
    group.add(s2);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6651() {
    group.add(s6);
    group.add(s5);
    group.add(s3);
    group.add(s4);
    group.add(s2);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6652() {
    group.add(s5);
    group.add(s6);
    group.add(s3);
    group.add(s4);
    group.add(s2);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6653() {
    group.add(s3);
    group.add(s6);
    group.add(s5);
    group.add(s4);
    group.add(s2);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6654() {
    group.add(s6);
    group.add(s3);
    group.add(s5);
    group.add(s4);
    group.add(s2);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6655() {
    group.add(s4);
    group.add(s3);
    group.add(s5);
    group.add(s6);
    group.add(s2);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6656() {
    group.add(s3);
    group.add(s4);
    group.add(s5);
    group.add(s6);
    group.add(s2);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6657() {
    group.add(s5);
    group.add(s4);
    group.add(s3);
    group.add(s6);
    group.add(s2);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6658() {
    group.add(s4);
    group.add(s5);
    group.add(s3);
    group.add(s6);
    group.add(s2);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6659() {
    group.add(s3);
    group.add(s5);
    group.add(s4);
    group.add(s6);
    group.add(s2);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6660() {
    group.add(s5);
    group.add(s3);
    group.add(s4);
    group.add(s6);
    group.add(s2);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6661() {
    group.add(s5);
    group.add(s6);
    group.add(s4);
    group.add(s3);
    group.add(s2);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6662() {
    group.add(s6);
    group.add(s5);
    group.add(s4);
    group.add(s3);
    group.add(s2);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6663() {
    group.add(s4);
    group.add(s5);
    group.add(s6);
    group.add(s3);
    group.add(s2);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6664() {
    group.add(s5);
    group.add(s4);
    group.add(s6);
    group.add(s3);
    group.add(s2);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6665() {
    group.add(s6);
    group.add(s4);
    group.add(s5);
    group.add(s3);
    group.add(s2);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6666() {
    group.add(s4);
    group.add(s6);
    group.add(s5);
    group.add(s3);
    group.add(s2);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6667() {
    group.add(s4);
    group.add(s6);
    group.add(s3);
    group.add(s5);
    group.add(s2);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6668() {
    group.add(s6);
    group.add(s4);
    group.add(s3);
    group.add(s5);
    group.add(s2);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6669() {
    group.add(s3);
    group.add(s4);
    group.add(s6);
    group.add(s5);
    group.add(s2);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6670() {
    group.add(s4);
    group.add(s3);
    group.add(s6);
    group.add(s5);
    group.add(s2);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6671() {
    group.add(s6);
    group.add(s3);
    group.add(s4);
    group.add(s5);
    group.add(s2);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6672() {
    group.add(s3);
    group.add(s6);
    group.add(s4);
    group.add(s5);
    group.add(s2);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6673() {
    group.add(s2);
    group.add(s6);
    group.add(s4);
    group.add(s5);
    group.add(s3);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6674() {
    group.add(s6);
    group.add(s2);
    group.add(s4);
    group.add(s5);
    group.add(s3);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6675() {
    group.add(s4);
    group.add(s2);
    group.add(s6);
    group.add(s5);
    group.add(s3);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6676() {
    group.add(s2);
    group.add(s4);
    group.add(s6);
    group.add(s5);
    group.add(s3);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6677() {
    group.add(s6);
    group.add(s4);
    group.add(s2);
    group.add(s5);
    group.add(s3);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6678() {
    group.add(s4);
    group.add(s6);
    group.add(s2);
    group.add(s5);
    group.add(s3);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6679() {
    group.add(s5);
    group.add(s6);
    group.add(s2);
    group.add(s4);
    group.add(s3);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6680() {
    group.add(s6);
    group.add(s5);
    group.add(s2);
    group.add(s4);
    group.add(s3);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6681() {
    group.add(s2);
    group.add(s5);
    group.add(s6);
    group.add(s4);
    group.add(s3);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6682() {
    group.add(s5);
    group.add(s2);
    group.add(s6);
    group.add(s4);
    group.add(s3);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6683() {
    group.add(s6);
    group.add(s2);
    group.add(s5);
    group.add(s4);
    group.add(s3);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6684() {
    group.add(s2);
    group.add(s6);
    group.add(s5);
    group.add(s4);
    group.add(s3);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6685() {
    group.add(s2);
    group.add(s4);
    group.add(s5);
    group.add(s6);
    group.add(s3);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6686() {
    group.add(s4);
    group.add(s2);
    group.add(s5);
    group.add(s6);
    group.add(s3);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6687() {
    group.add(s5);
    group.add(s2);
    group.add(s4);
    group.add(s6);
    group.add(s3);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6688() {
    group.add(s2);
    group.add(s5);
    group.add(s4);
    group.add(s6);
    group.add(s3);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6689() {
    group.add(s4);
    group.add(s5);
    group.add(s2);
    group.add(s6);
    group.add(s3);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6690() {
    group.add(s5);
    group.add(s4);
    group.add(s2);
    group.add(s6);
    group.add(s3);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6691() {
    group.add(s5);
    group.add(s4);
    group.add(s6);
    group.add(s2);
    group.add(s3);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6692() {
    group.add(s4);
    group.add(s5);
    group.add(s6);
    group.add(s2);
    group.add(s3);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6693() {
    group.add(s6);
    group.add(s5);
    group.add(s4);
    group.add(s2);
    group.add(s3);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6694() {
    group.add(s5);
    group.add(s6);
    group.add(s4);
    group.add(s2);
    group.add(s3);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6695() {
    group.add(s4);
    group.add(s6);
    group.add(s5);
    group.add(s2);
    group.add(s3);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6696() {
    group.add(s6);
    group.add(s4);
    group.add(s5);
    group.add(s2);
    group.add(s3);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6697() {
    group.add(s3);
    group.add(s4);
    group.add(s5);
    group.add(s2);
    group.add(s6);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6698() {
    group.add(s4);
    group.add(s3);
    group.add(s5);
    group.add(s2);
    group.add(s6);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6699() {
    group.add(s5);
    group.add(s3);
    group.add(s4);
    group.add(s2);
    group.add(s6);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6700() {
    group.add(s3);
    group.add(s5);
    group.add(s4);
    group.add(s2);
    group.add(s6);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6701() {
    group.add(s4);
    group.add(s5);
    group.add(s3);
    group.add(s2);
    group.add(s6);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6702() {
    group.add(s5);
    group.add(s4);
    group.add(s3);
    group.add(s2);
    group.add(s6);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6703() {
    group.add(s2);
    group.add(s4);
    group.add(s3);
    group.add(s5);
    group.add(s6);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6704() {
    group.add(s4);
    group.add(s2);
    group.add(s3);
    group.add(s5);
    group.add(s6);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6705() {
    group.add(s3);
    group.add(s2);
    group.add(s4);
    group.add(s5);
    group.add(s6);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6706() {
    group.add(s2);
    group.add(s3);
    group.add(s4);
    group.add(s5);
    group.add(s6);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6707() {
    group.add(s4);
    group.add(s3);
    group.add(s2);
    group.add(s5);
    group.add(s6);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6708() {
    group.add(s3);
    group.add(s4);
    group.add(s2);
    group.add(s5);
    group.add(s6);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6709() {
    group.add(s3);
    group.add(s5);
    group.add(s2);
    group.add(s4);
    group.add(s6);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6710() {
    group.add(s5);
    group.add(s3);
    group.add(s2);
    group.add(s4);
    group.add(s6);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6711() {
    group.add(s2);
    group.add(s3);
    group.add(s5);
    group.add(s4);
    group.add(s6);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6712() {
    group.add(s3);
    group.add(s2);
    group.add(s5);
    group.add(s4);
    group.add(s6);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6713() {
    group.add(s5);
    group.add(s2);
    group.add(s3);
    group.add(s4);
    group.add(s6);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6714() {
    group.add(s2);
    group.add(s5);
    group.add(s3);
    group.add(s4);
    group.add(s6);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6715() {
    group.add(s2);
    group.add(s5);
    group.add(s4);
    group.add(s3);
    group.add(s6);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6716() {
    group.add(s5);
    group.add(s2);
    group.add(s4);
    group.add(s3);
    group.add(s6);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6717() {
    group.add(s4);
    group.add(s2);
    group.add(s5);
    group.add(s3);
    group.add(s6);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6718() {
    group.add(s2);
    group.add(s4);
    group.add(s5);
    group.add(s3);
    group.add(s6);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6719() {
    group.add(s5);
    group.add(s4);
    group.add(s2);
    group.add(s3);
    group.add(s6);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

  public void test6720() {
    group.add(s4);
    group.add(s5);
    group.add(s2);
    group.add(s3);
    group.add(s6);
    group.add(s1);
    group.setComparator(Alphabetical.getInstance());
    it = group.iterator();
    assertSame(s1,it.next());
    assertSame(s2,it.next());
    assertSame(s3,it.next());
    assertSame(s4,it.next());
    assertSame(s5,it.next());
    assertSame(s6,it.next());
  }

}

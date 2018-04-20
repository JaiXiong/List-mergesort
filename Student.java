
package edu.uwm.cs351;
import java.util.AbstractCollection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

import edu.uwm.cs351.util.Alphabetical;
import junit.framework.TestCase;
//worked with 371A tutoring Megan, Kayla, zach
//worked with students: Bijaya (worked together in 371A with tutors, we discussed logic, 
//drew pictures and strategies, we wrote pseudo code design for all methods with the tutors)
//used stack overflow for reverse design
/**
 * The Class Student.
 */
public class Student implements Cloneable {

	/** Fields. */
	private String _name;
	private double _grade;
	private double _attendance;

	/** The links to the previous and next students. */
	private Student _prev, _next;

	/**
	 * Instantiates a new student.
	 *
	 * @param name the name of the student
	 * @param grade the grade percentage of the student (must be in range [0, 100])
	 * @param attendance the attendance percentage of the student (must be in range [0, 100])
	 * @throws IllegalArgumentException if name is null
	 * @throws IllegalArgumentException if grade is outside of legal range
	 * @throws IllegalArgumentException if attendance is outside of legal range
	 */
	public Student(String name, double grade, double attendance) {
		if (name == null) throw new IllegalArgumentException("name is null");
		if (grade < 0 || grade > 100)
			throw new IllegalArgumentException("grade must be in range [0, 100]: " + grade);
		if (attendance < 0 || attendance > 100)
			throw new IllegalArgumentException("attendance must be in range [0, 100]: " + attendance);
		_name = name;
		_grade = grade;
		_attendance = attendance;
	}

	/** Gets the name.
	 * @return the name */
	public String getName() {return _name;}

	/** Gets the grade percentage.
	 * @return the grade percentage */
	public double getGrade() {return _grade;}

	/** Gets the attendance percentage.
	 * @return the attendance percentage */
	public double getAttendance() {return _attendance;}

	/*
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() { return  _name + " | G: " + _grade + " | A: " + _attendance;}


	/**
	 *  Returns a clone of this student that is identical in every way
	 *  except that it has null links.
	 *
	 * @return the student with null links
	 * @see java.lang.Object#clone()
	 */
	@Override
	public Student clone(){
		Student copy = null;
		try{
			copy = (Student) super.clone();
			copy._next = copy._prev = null;
		}
		catch(CloneNotSupportedException e){
			// should not happen
		}
		return copy;
	}


	/**
	 * The Class Group.
	 */
	public static class Group extends AbstractCollection<Student> implements Cloneable {

		/** Fields */
		private Comparator<Student> _comparator;
		private int _manyItems, _version;
		private Student _head, _tail;
		//Student _dummy;
		boolean flag = false;

		private boolean _report(String s) {
			System.out.println(s);
			return false;}

		/** The Invariant */
		private boolean _wellFormed() {

			// The invariant:
			// 0. comparator is not null
			if (_comparator == null) return _report("comparator is null");
			// 1. If _head or tail is null then both are null.
			if (_head == null && _tail != null)  return _report("head is null but tail isnt");
			if (_head != null && _tail == null)  return _report("head isnt null but tail is");
			// 2. If _head exists it is first in list.
			if (_head != null && _head._prev != null)  return _report("head is not first in list");
			// 3. If _tail exists it is last in same list as head.
			// 4. Every student with a next is the previous of its next.
			//		NB: In combination with condition 2 (above), this piece of the invariant should
			//			catch any circular references within the list. (Why?)
			//			If you fail to check the invariant conditions in the order given, however,
			//			your code may never figure out that there is a loop and continue on forever!
			//
			// 5. _manyItems is the number of students in the list
			// 6. Every student with a next is lesser than or equal to its next according to _comparator
			int count = 0;
			Student cur;
			
			if (flag == false)
			{
				for(cur = _head; cur != null && cur != _tail; cur = cur._next) 
				{
					if (cur._next != null && (cur._next._prev != cur || _comparator.compare(cur, cur._next) > 0))
					{
						return _report("student is not previous of its next");
					}
					++count;
				}
			}
			else
			{
				for(cur = _head; cur != null && cur != _tail; cur = cur._next) 
				{
					if (cur._next != null && (cur._next._prev != cur || _comparator.compare(cur, cur._next) < 0))
					{
						return _report("student is not previous of its next");
					}
					++count;
				}
			

			if ((_tail != null && _tail._next != null) || cur != _tail)
				return _report("tail is not last in list");

			if (_head == null && _manyItems != 0)
				return _report("_manyItems is incorrect");
			else if (_head != null && count != _manyItems - 1)
				return _report("_manyItems is incorrect");
		}
	
	
		return true;
	}

	/**
	 * Instantiates a new group with the given comparator.
	 *
	 * @param comparator the comparator this Group will use
	 * @throws IllegalArgumentException if comparator is null
	 */
	public Group(Comparator<Student> comparator) {
		if (comparator == null) throw new IllegalArgumentException();
		_comparator = comparator;
		//_dummy = new Student("", 0, 0);
		_manyItems = _version = 0;
		assert _wellFormed() : "invariant fails at end of constructor";
	}

	public void setComparator(Comparator<Student> comparator)
	{
		if (comparator == null) return;
		if (_head == null) return;
		if (_head._next == null) return;
		_comparator = comparator;
		Student result;

		result = mergeSort(_head, _manyItems);
		//if (result._next == null && result._prev == null)

		_head = result;
		Student tmp = result;
		Student last = null;
		while (tmp != null)
		{
			last = tmp;
			tmp = tmp._next;
		}
		_tail = last;
		
//		_tail = result._prev;
//		_tail._next = null;
//		_head._prev = null;
//		result._next = null;
//		result._prev = null;
//		_head._prev = null;
//		_tail._next = null;
		++_version;
		flag = false;
	}

	private Student mergeHelper(Student a, Student b)
	{
		Student _dummy = new Student("", 0, 0);
		//Student last = null;
		Student tmp = _dummy;

		while (a != null && b != null)
		{
			if (_comparator.compare(a, b) <= 0)
			{
				tmp._next = a;
				a._prev = tmp;
				tmp = tmp._next;
				a = a._next;
			}
			else //if (_comparator.compare(a, b) > 0)
			{
				tmp._next = b;
				b._prev = tmp;
				tmp = tmp._next;
				b = b._next;
			}
		}

		if (a == null)
		{
			while (b != null)
			{
				tmp._next = b;
				b._prev = tmp;
				tmp = tmp._next;
				//last =b;
				b = b._next;
				
				//last = b;
			}
		}
		else
		{
			while (a != null)
			{
				tmp._next = a;
				a._prev = tmp;
				tmp = tmp._next;
				//last = a;
				a = a._next;
				//last = a;
			}
		}
		//_dummy._prev = last;
		//last._next = _dummy;

		return tmp._next;
	}

	private Student mergeSort(Student start, int length)
	{
		if (start == null) return null;
		if (length <= 1) return start;
		int count = 0;
		int midPoint = length / 2;
		Student tmp = null;
		Student x = null;

		for (x = start; x != null; x = x._next) //split
		{
			if (count == midPoint)
			{
				//tmp = x._next;
				tmp = x;
				x._prev._next = null;
				x._prev = null;
				
//				x._next._prev = null;  //causing nullpointer??? wrong sizes
//				x._next = null;
				break;
			}
			++count;
		}
		//						Student a = mergeSort(_head, count);
		//						Student b = mergeSort(tmp, length - midPoint);
		//
		//			return mergeHelper(start, tmp, count, length- midPoint);

		//return mergeHelper(mergeSort(start, count+1), mergeSort(tmp, (length - midPoint) - 1));
		return mergeHelper(mergeSort(start, count), mergeSort(tmp, (length - midPoint)));


	}

	public void reverse()
	{
		if (_head == null || _head._next == null)
		{
			flag = true;
			return;
		}
		Student cur = _head;
		Student tmp = null;

		Student x = _head;
		//Student tmp = _head._next;
		while (cur != null)
		{
			tmp = cur._prev;
			cur._prev = cur._next;
			cur._next = tmp;
			cur = cur._prev;
		}

		if (tmp != null) 
		{
			_head = _tail;
			_tail = x;

		}
		++_version;
		if (flag == false)
		{
		flag = true;
		}
		else
		{
			flag = false;
		}
		//_comparator.reversed();
	}

	private Group(boolean ignored) {} // DO NOT CHANGE THIS

	/**
	 * Adds a student to this group in the order specified by this group's
	 * comparator. Namely, for any new student S being added...
	 * 		S belongs before any student that is greater than it
	 * 		S belongs after all students that are equal to it
	 * 		S belongs after any student that is less than it
	 * 
	 * To keep this method in linear time (and to receive full points),
	 * your search for a student's correct position *must* begin at the end of the list,
	 * as a student must be placed *after* any students the comparator considers 'equivalent'.
	 *
	 * @param student the student to add
	 * @throws IllegalArgumentException if student is null or has existing links
	 * @return true always
	 */
	@Override
	public boolean add(Student student) {
		assert _wellFormed() : "invariant fails at beginning of add";
		if (student == null) throw new IllegalArgumentException("Cannot add null student");
		if (student._next != null || student._prev != null) throw new IllegalArgumentException("Cannot add student with existing links");

		// Empty List
		if (_head == null)
			_head = _tail = student;
		// Non-Empty List
		else if (flag == false)
		{
			Student current = _tail;
			while (current != null && _comparator.compare(current, student) > 0)
				current = current._prev;

			// Student is less than all in list - it is new head
			if (current == null) {
				student._next = _head;
				_head._prev = student;
				_head = student;
			}
			// Current is last element less or equal than S - add S after current
			else {
				student._prev = current;
				student._next = current._next;
				current._next = student;
				if (student._next == null)
					_tail = student;
				else
					student._next._prev = student;
			}
		}
		else //if (flag == true)
		{
			Student current = _tail;
			while (current != null && _comparator.compare(current, student) < 0)
				current = current._prev;

			// Student is less than all in list - it is new head
			if (current == null) {
				student._next = _head;
				_head._prev = student;
				_head = student;
			}
			// Current is last element less or equal than S - add S after current
			else {
				student._prev = current;
				student._next = current._next;
				current._next = student;
				if (student._next == null)
					_tail = student;
				else
					student._next._prev = student;
			}
		}

		_manyItems++; _version++;
		assert _wellFormed() : "invariant fails at end of add";
		return true;
	}

	/** Returns the head of this group.
	 * 	NB: We don't have to remove its links. Why?
	 * @return the head (first student) of this group */
	public Student getHead() {
		assert _wellFormed() : "invariant fails at beginning of getHead()";
		return _head;
	}

	/** Returns the tail of this group.
	 * 	NB: We don't have to remove its links. Why?
	 * @return the tail (last student) of this group */
	public Student getTail() {
		assert _wellFormed() : "invariant fails at beginning of getTail()";
		return _tail;
	}

	/* (non-Javadoc)
	 * @see java.util.AbstractCollection#size()
	 */
	@Override
	public int size() {
		assert _wellFormed() : "invariant fails at beginning of size()";
		return _manyItems;
	}

	/* (non-Javadoc)
	 * @see java.util.AbstractCollection#toString()
	 */
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder("{\n");
		for (Student cur = _head; cur != null; cur = cur._next)
			result.append("\t" + cur + "\n");
		result.append("}");
		return result.toString();
	}

	/** Returns a new copy of this group. The copy should be unaffected
	 *  by subsequent changes made to this group, and vice versa. The
	 *  students added to the copy should be clones.
	 *  NB: The Regents of the University of Wisconsin System
	 *  have not approved the cloning of students.
	 *  
	 * @return a clone of this group
	 * @see java.lang.Object#clone()
	 */
	@Override
	public Group clone(){
		assert _wellFormed() : "invariant failed at start of clone()";
		Group copy = null;

		try {
			copy = (Group) super.clone();
			copy._head = copy._tail = null;
			copy._manyItems = copy._version = 0;
			for (Student s: this)
				copy.add(s.clone());
		}
		catch(CloneNotSupportedException e){
			// should not happen
		}

		assert _wellFormed() : "invariant failed at end of clone()";
		assert copy._wellFormed() : "copy invariant failed at end of clone()";
		return copy;
	}

	/* (non-Javadoc)
	 * @see java.util.AbstractCollection#iterator()
	 */
	@Override
	public Iterator<Student> iterator() {
		return new MyIterator();
	}

	// NB: Do *not* override the inherited implementation of "clear()".
	// Question to think about: Why not? What does it do?  How?

	/**
	 * The class MyIterator.
	 */
	private class MyIterator implements Iterator<Student>{

		/** Fields */
		// Normally these would be private, but they are protected for now
		// so that TestInvariant can access them.
		protected Student _cursor;
		protected int _myVersion;
		protected boolean _removeOK;

		/** Invariant */
		private boolean _wellFormed() {
			// Invariant for iterator:
			// 1. Outer invariant holds
			if (!Group.this._wellFormed()) return _report("Outer Invariant Broken.");
			// Only check 2 and 3 if versions match...
			// 2. _removeOK is only true if _cursor exists
			// 3. if _cursor exists it is in the list
			if (_myVersion ==_version){
				if (_removeOK && _cursor == null)
					return _report("_removeOK is true but cursor is null");
				for (Student s = _head; s != _cursor; s = s._next)
					if (s == null)
						return _report("iterator _cursor is not in group");
			}
			return true;
		}

		/** Instantiates a new iterator */
		public MyIterator(){
			_cursor = _head;
			_myVersion = _version;
			_removeOK = false;
		}

		// do not change this - used for JUnit tests
		private MyIterator(boolean ignore){}

		/** Returns whether there are more students to be returned.
		 * @throws ConcurrentModificationException if versions don't match
		 * @return true if there exists another student to return
		 */
		@Override
		public boolean hasNext() {
			assert _wellFormed() : "invariant failed at start of hasNext()";
			if (_myVersion !=_version) throw new ConcurrentModificationException();
			return _cursor != null && (!_removeOK || _cursor._next != null);
		}

		/** Returns the next student in this group. This method should
		 *  *not* change the state of the group in any way.
		 *  
		 *  @throws ConcurrentModificationException if versions don't match
		 *  @throws NoSuchElementException if no next exists
		 *  @return the next student in the group
		 */
		@Override
		public Student next() {
			assert _wellFormed() : "invariant failed at start of next()";
			if (_myVersion !=_version) throw new ConcurrentModificationException();
			if (!hasNext()) throw new NoSuchElementException("no next exists");

			if (_removeOK)
				_cursor = _cursor._next;
			_removeOK = true;

			assert _wellFormed() : "invariant failed at end of next()";
			return _cursor;
		}


		/**
		 * 	Removes the most recently returned student from this group.
		 *  
		 *  @throws ConcurrentModificationException if versions don't match
		 *  @throws IllegalStateException if next hasn't been called (the cursor hasn't been returned)
		 */
		@Override
		public void remove() {
			assert _wellFormed() : "invariant failed at start of remove()";
			if (_myVersion !=_version) throw new ConcurrentModificationException();
			if (!_removeOK) throw new IllegalStateException("cannot remove before calling next");

			if (_cursor._prev == null)
				_head = _cursor._next;
			else 
				_cursor._prev._next = _cursor._next;

			if (_cursor._next == null)
				_tail = _cursor._prev;
			else 
				_cursor._next._prev = _cursor._prev;

			Student removed = _cursor;
			_cursor = removed._next;
			removed._next = removed._prev = null;

			_manyItems--; _myVersion++; _version++;
			_removeOK = false;

			assert _wellFormed() : "invariant failed at end of remove()";
		}
	}

	public static class TestInvariant extends TestCase {

		protected Group self;
		private Comparator<Student> _comp = Alphabetical.getInstance();
		private Student head, tail;
		private Student s1, s2, s3;
		private MyIterator it;

		@Override
		protected void setUp() {
			self = new Group(false);
			it = self.new MyIterator(false);
			head = new Student("A",0,0);
			s1 = new Student("B",0,0);
			s2 = new Student("C",0,0);
			s3 = new Student("D",0,0);
			tail = new Student("Z",0,0);

			// Default to valid group of 2
			self._comparator = _comp;
			self._head = head;
			self._tail = tail;
			link(head, tail);
			self._manyItems = 2;
		}

		private void link(Student a, Student b) {
			a._next = b;
			b._prev = a;
		}

		public void test00() {
			self._comparator = null;
			assertFalse("null comparator", self._wellFormed());
		}

		public void test01() {
			self._head = self._tail = null;
			assertFalse("_manyItems is incorrect", self._wellFormed());

			self._manyItems = 0;
			assertTrue("null head, null tail", self._wellFormed());

			self._head = head;
			assertFalse("valid head, null tail", self._wellFormed());

			self._head = null;
			self._tail = tail;
			assertFalse("null head, valid tail", self._wellFormed());

			self._head = head;
			head._next = null;
			tail._prev = null;
			self._manyItems = 2;
			assertFalse("valid head and tail, but no links", self._wellFormed());

			link(head, tail);
			assertTrue("valid head and tail, correct linkage", self._wellFormed());

			head._prev = s1;
			s1._next = head;
			assertFalse("head not first in list", self._wellFormed());

			head._prev = null;
			tail._next = s1;
			s1._prev = tail;
			assertFalse("tail not last in list", self._wellFormed());
		}

		public void test02() {
			assertTrue("good group of size 2", self._wellFormed());

			self._manyItems = 3;
			assertFalse("_manyItems is incorrect", self._wellFormed());

			self._head = self._tail = null;
			assertFalse("_manyItems is incorrect", self._wellFormed());
		}

		public void test03() {
			head._next = tail;
			tail._prev = tail;
			assertFalse("tail is prev of itself", self._wellFormed());

			head._next = head;
			tail._prev = head;
			assertFalse("head is next of itself", self._wellFormed());
		}

		public void test04() {
			link(head, s1);
			link(s1, tail);
			self._manyItems = 3;
			assertTrue("list has correct linkage", self._wellFormed());

			head._next = tail;
			assertFalse("head is not prev of its next", self._wellFormed());

			link(head, s1);
			tail._prev = head;
			assertFalse("p1 is not prev of its next", self._wellFormed());
		}

		public void test05() {
			link(head, s1);
			link(s1, s2);
			link(s2, tail);
			self._manyItems = 4;
			assertTrue("list has correct linkage", self._wellFormed());

			s1._next = head;
			assertFalse("p1 is not prev of its next", self._wellFormed());
			s1._next = tail;
			assertFalse("p1 is not prev of its next", self._wellFormed());

			link(s1, s2);
			s2._prev = head;
			assertFalse("p1 is not prev of its next", self._wellFormed());
			s2._prev = tail;
			assertFalse("p1 is not prev of its next", self._wellFormed());

			link(s1, s2);
			assertTrue("list has correct linkage", self._wellFormed());
			link(s2, s1);
			assertFalse("head is not prev of its next", self._wellFormed());
		}

		public void test06() {
			link(head, s1);
			link(s1, s2);
			link(s2, s3);
			link(s3, tail);
			self._manyItems = 5;
			assertTrue("list has correct linkage", self._wellFormed());

			link(s1, s3);
			self._manyItems = 4;
			assertTrue("p2 no longer in list, list has correct linkage", self._wellFormed());

			s3._prev = s2;
			assertFalse("p1 is not prev of its next", self._wellFormed());

			link(s1,s2);
			link(s2,s3);
			s1._next = s3;
			assertFalse("p1 is not prev of its next", self._wellFormed());

			link(head, tail);
			self._manyItems = 2;
			assertTrue("removed all but head/tail, list has correct linkage", self._wellFormed());
		}

		public void test07() {
			self._head = self._tail = null;
			assertFalse("outer invariant broken", it._wellFormed());
		}

		public void test08() {
			it._removeOK = true;
			assertFalse("returned cursor but it doesn't exist", it._wellFormed());
			it._cursor = self._head;
			assertTrue("fixed", it._wellFormed());

			it._removeOK = false;
			assertTrue("initial state of iterator", it._wellFormed());
		}

		public void test09() {
			it._removeOK = true;
			assertFalse("returned cursor but it doesn't exist", it._wellFormed());
			it._myVersion = 1;
			assertTrue("versions dont match", it._wellFormed());
		}

		public void test10() {
			it._cursor = s1;
			assertFalse("cursor isn't in group", it._wellFormed());
			it._cursor = head;
			assertTrue("versions dont match", it._wellFormed());
		}
	}
}
}

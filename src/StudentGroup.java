import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 *
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;

	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		System.out.println("hi");
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		ion here
		System.out.println("how");

	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here

		System.out.println("are");
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here

		System.out.println("you");

	}

	@Override
	public void addFirst(Student student) {

		System.out.println("this");

		// Add your implementation here
	}

	@Override
	public void addLast(Student student) {


		System.out.println("is");
		// Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here

		System.out.println("sai");

	}

	@Override
	public void remove(int index) {
		// Add your implementation here

		System.out.println("akshay");

	}

	@Override
	public void remove(Student student) {
		// Add your implementation here

		System.out.println("reddy");

	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here

		System.out.println("from");

	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here

		System.out.println("hyderabad");

	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here

		System.out.println("telangana");

	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here

		System.out.println("india");

	}

	@Override
	public void bubbleSort() {
		// Add your implementation here

		System.out.println("hope");

	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here

		System.out.println("you");

		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here

		System.out.println("understood");

		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here

		System.out.println("me");

		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here

		System.out.println("or");

		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here

		System.out.println("should i");

		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here

		System.out.println(""explain);

		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here

		System.out.println("u again");

		return null;
	}
}

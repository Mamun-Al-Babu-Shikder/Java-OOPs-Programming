/*
 * Inheritance in Java is a mechanism in which one object acquires all 
 * the properties and behaviors of a parent object. 
 * It is an important part of OOPs (Object Oriented programming system).
 * 'extends' keyword is used to inherit the class
 */

/*
 * A class can extends a class or an abstract class. 
 * An interface can extends another interface.
 * A class or an abstract class can implements an interface.
 */

/*
 * Inheritance represents the IS-A relationship which is also known as a parent-child relationship.
 * By extending, we can't get the private fields, methods or any kind of block of Parent class.
 */

public class Inheritance
{
	public static void main(String[] args)
	{
		/*
		 * Create an object of Teacher class.
		 */
		Teacher teacher = new Teacher();
		/*
		 * Assign basic information of Teacher
		 */
		teacher.name = "MD. Abul Basar";
		teacher.age = 42;
		teacher.gender = "Male";
		teacher.address = "Dhamrai, Dhaka";
		/*
		 * Another information that are holding Teacher class.
		 */
		teacher.designation = "Assistant Teacher";
		teacher.salary = 18500;
		// teacher.setName("MD. Abul Basar"); // It is not possible to access private method
		/*
		 * Call the method 'displayBasicInfo()' that is define at
		 * BasicInfo class.
		 */
		teacher.displayBasicInfo();
		teacher.displayTeacherInfo();
		
		/*
		 * Create an object of Student class.
		 */
		Student student = new Student();
		/*
		 * Assign basic information of Student
		 */
		student.name = "Afroza Akter Mitu";
		student.age = 17;
		student.gender = "Female";
		student.address = "Sakhipur, Tangail";
		/*
		 * Another information that are holding Student class 
		 */
		student.id = 19001;
		student.session = "2019-20";
		student.cgpa = 3.98f;
		
		student.displayBasicInfo();
		student.displayStudentInfo();
		
	}
	
}


/*
 * Here 'BasicInfo' is a parent class 
 */
class BasicInfo
{
	/*
	 * All fields of Parent class
	 */
	public String name;
	public int age;
	public String address;
	public String gender;
	
	/*
	 * Methods of Parent class
	 */
	public void displayBasicInfo() {
		System.out.println("BasicInfo [name=" + name + ", age=" + age + ", "
				+ "address=" + address + ", gender=" + gender + "]");
	}

	/*
	 *  Private method of BasicInfo class.
	 *  It can't access the child class.
	 */
	private void setName(String name) {
		this.name = name;
	}
	
	/*
	 * This is a protected method of BasicInfo, it can access those child class,
	 * which is remain the same package with 'BasicInfo'
	 */
	protected String getName() {
		return this.name;
	}
}

/*
 * 'Teacher' class is a child class of 'BasicInfo'
 */
class Teacher extends BasicInfo
{
	/*
	 * Basically there have two fields 'designation' and 'salary'.
	 * But there have total 6 fields hence it extends 'BasicInfo'.
	 */
	public String designation;
	public int salary;
	
	public void displayTeacherInfo() {
		System.out.println("Teacher [designation=" + designation + ", salary=" + salary + ", name=" + name + ", age=" + age
				+ ", address=" + address + ", gender=" + gender + "]");
	}
}

/*
 * 'Student' class is also a child class of 'BasicInfo'
 */
class Student extends BasicInfo
{
	/*
	 * Hence Student class extends BasicInfo class so,
	 * It has also those fields which exists in BasicInfo class. 
	 */
	public int id;
	public String session;
	public float cgpa;
	
	public void displayStudentInfo() {
		System.out.println("Student [id=" + id + ", session=" + session + ", cgpa=" + cgpa + ", name=" + name + ", age=" + age
				+ ", address=" + address + ", gender=" + gender + "]");
	}
	
}


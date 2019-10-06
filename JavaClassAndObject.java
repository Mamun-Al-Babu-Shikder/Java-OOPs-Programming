/*
 * A class in Java can contain:
 * Fields
 * Methods
 * Constructors
 * Blocks
 * Nested class and interface
 */

public class JavaClassAndObject {
	
	public static void main(String[] args)
	{
		/*
		 * Create Student reference
		 * By deafult a reference is null
		 */
		Student student; // student is reference variable
		student = new Student(); // now student is an object
		
		/*
		 * Access class variable by 'Student' class
		 */
		Student.department = "ICT";
		
		/*
		 * Access instance variable by 'student' object
		 */
		student.id = 101;
		student.name = "Afroza Akter Mitu";
		student.age = 20;
		student.gpa = 3.98f;
		
		/*
		 * Create object with parameterized constructor
		 */
		Student student2 = new Student(102,"Tanvir Ahamed Akash",19,3.88f);
		
		/*
		 * Access method by object
		 */
		student.method();
		
		System.out.println(student.toString());
		System.out.println(student2.toString());
	
	}
	
}


/*
 * A class named 'Student'
 */
class Student
{
	//---------- Fields --------//
	/*
	 * Instance variables 
	 */
	public int id;
	public String name;
	public int age;
	public float gpa;
	
	/*
	 * Class variables
	 */
	public static String department;
	
	
	//--------- Methods ---------//
	/*
	 * Default constructor
	 * We don't need to create default constructor
	 * Constructor name must be the same as class name
	 */
	public Student() {
		
	}
	
	/*
	 * Parameterized constructor 
	 */
	public Student(int id, String name, int age, float gpa) {
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.gpa = gpa;
	}
	
	/*
	 * Method or Function
	 */
	public void method() {
		
		/*
		 * Local variable
		 */
		int i = 0;
		
		/*
		 * Method body
		 */
	}
	
	/*
	 * Method or Function
	 */
	public void parameteridedMethod(int param) {
		
	}

	/*
	 * Override method
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", gpa=" + gpa + "]";
	}
}
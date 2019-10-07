/*
 * Abstract class is a middle position between class and interface.
 * It has two types of feature like class and interface.
 * Class can't hold method without body and interface can't hold method with body, 
 * although interface can hold static and default method with body from java-8 version.
 * But it is possible to solve this problem through Abstract Class. 
 * Because abstract class can hold those two types of method.
 */

/*
 * We can't create any object of abstract class like a normal class in java.
 * There have to way to create an object of abstract class (i) Anonymous (ii) Extending
 */

/*
 * Use 'abstract' keyword before <clas_name> and 'class' keyword to declare abstract class 
 */
abstract class AbstractClass
{
	/*
	 * Normal field in abstract class
	 */
	public int intValue;
	
	/*
	 * Static field in abstract class
	 */
	public static int staticIntValue;
	
	/*
	 * Abstract class default constructor
	 */
	public AbstractClass() {
		this.intValue = 0;
	}

	/*
	 * Abstract class with parameterized constructor
	 */
    public  AbstractClass(int value) {
		this.intValue = value;
	}
	
    /*
     * Normal method that have body as usual
     */
	public void normalMethod() {
		System.out.println("Hi, i am not an abstract method.");
	}
	 
	/*
	 * An abstract method that have not any implemented body
	 * To declare abstract method we need to use 'abstract' keyword
	 */
	public abstract void abstractMethod();
	
	/*
	 * Static method 
	 */
    public static void staticMethod() {
    	 System.out.println("Hello, This is static method");
    }
}
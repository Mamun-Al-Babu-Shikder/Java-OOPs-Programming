/*
 * The interface in Java is a mechanism to achieve abstraction. 
 * There can be only abstract methods in the Java interface, not method body. 
 * It is used to achieve abstraction and multiple inheritance in Java.
 */

/*
 * An interface is not extended by a class; it is implemented by a class,
 * But an interface can extend multiple interfaces.
 */
interface Interface
{
	/*
	 * Static final field in interface
	 * Interface fields are public, static and final by default 
	 */
	public int defaultFinalStaticIntValue = 555;
	
	/*
	 * Same as 'defaultFinalStaticIntValue' variable,
	 * But here we use 'static' and 'final; keyword
	 */
	public static final int finalStaticIntValue = 777;
   
	/*
	 * An interface does not contain any constructors
	 * public Interface() {} // not possible 
	*/
	
	/*
	 * By default all kinds of method interface are abstract for this
	 * we don't use 'abstract' keyword
	 */
	public void method();
	
	/*
	 * Since java-8 we can define a static method in an interface
	 */
	public static void staticMethod() {
		System.out.println("This is a static method.");
	}
	
	/*
	 * Since java-8 we can define a default method in an interface
	 */
	default void defaultMethod() {
		System.out.println("This is a default method.");
	}
}
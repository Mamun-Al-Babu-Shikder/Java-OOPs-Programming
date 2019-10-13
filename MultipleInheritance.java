/*
 * To reduce the complexity and simplify the language, multiple inheritance is not supported in java.
 * Consider a scenario where A, B, and C are three classes. 
 * The C class inherits A and B classes. If A and B classes have the same method and you call it from child class object, 
 * there will be ambiguity to call the method of A or B class.
 * 
 *         -----------       -----------   
 *         | Class A |       | Class B |
 *         -----------       -----------
 *              ^                 ^
 *               \               /
 *                \ (extends)   / (extends)
 *                 \           /
 *                  \         /
 *                --------------
 *                |   Class C  |
 *                --------------
 *           ( Not possible in java )
 * 
 *         ---------------      ---------------  
 *         | interface A |      | interface B |
 *         ---------------      ---------------
 *              ^                    ^
 *               \                  /
 *                \ (extends)      / (extends)
 *                 \              /
 *                  \            /
 *                ----------------                               ---------------------
 *                | interface C  |  <-------- (implements) ------| Implemented Class |
 *                ----------------                               ---------------------
 * Java support multiple inheritance with the help of interface.
 */          

public class MultipleInheritance
{
	public static void main(String[] args)
	{
		/*
		 * The object 'obj' can access the all implemented method.
		 * It can also access the default method of InterfaceA.
		 * But it can't access the static method of InterfaceA.
		 */
		ImplementedClass obj = new ImplementedClass();
		obj.publicMethodOfInterfaceA();
		obj.publicMethodOfInterfaceB();
		obj.publicMethodOfInterfaceC();
		obj.defaultMethodOfClassA();
		
		/*
		 * obj.staticMethodOfInterfaceA(); // It is not possible.
		 */
	
		/*
		 * The following way to call the static method of InterfaceA.
		 */
		InterfaceA.staticMethodOfInterfaceA();
		
		/*
		 * We can create the object of ImplementedClass with the help of InterfaceA, InterfaceB or InterfaceC reference.
		 * But in this case the object can only access those entity that are exist at that referred Interface.
		 */
		
		// 'obj1' can access 'publicMethodOfInterfaceA()' and 'defaultMethodOfClassA()'.
		InterfaceA obj1 = new ImplementedClass();
		obj1.publicMethodOfInterfaceA();
		obj1.defaultMethodOfClassA();
		
		// 'obj2' only can access 'publicMethodOfInterfaceB()'.
		InterfaceB obj2 = new ImplementedClass();
		obj2.publicMethodOfInterfaceB();
		
		/*
		 *  Hence Interface extends InterfaceA and Interface so it can access all of those 
		 *  public methods and also can access default method.
		 */
		InterfaceC obj3 = new ImplementedClass();
		obj3.publicMethodOfInterfaceA();
		obj3.publicMethodOfInterfaceB();
		obj3.publicMethodOfInterfaceC();
		obj3.defaultMethodOfClassA();
		
		
	}
}

/*
 * ImplementedClass implements InterfaceC so it must be override
 * the all abstract method that exists in InterfaceC.
 */
class ImplementedClass implements InterfaceC
{
	@Override
	public void publicMethodOfInterfaceA() {
		System.out.println("I am a public method of InterfaceA."
				+ " My declaration at InterfaceA but my implementation is in ImplementedClass.");
	}

	@Override
	public void publicMethodOfInterfaceB() {
		System.out.println("I am a public method of InterfaceB."
				+ " My declaration at InterfaceB but my implementation is in ImplementedClass.");
	}

	
	@Override
	public void publicMethodOfInterfaceC() {
		System.out.println("I am a public method of InterfaceC."
				+ " My declaration at InterfaceC but my implementation is in ImplementedClass.");
	}
	
}

/*
 * InterfaceA with public, default and static method.
 * public method can be override by the child class but
 * default method and static method can't override by a child class.
 */
interface InterfaceA
{
	/*
	 * Public method of InterfaceA that will be implemented by the child class.
	 * This method by default abstract.
	 */
	public void publicMethodOfInterfaceA();
	
	/*
	 * This method support since java 8 version.
	 * It can't be override by the child class.
	 */
	default void defaultMethodOfClassA() {
		System.out.println("This is a default method of InterfaceA");
	}
	
	/*
	 * Static method of InterfaceA that can't be override by child class.
	 */
	public static void staticMethodOfInterfaceA() {
		System.out.println("This is a static method of InterfaceA");
	}
}

/*
 * InterfaceB with public method. 
 */
interface InterfaceB{
	
	/*
	 * Public method of InterfaceB that will be implemented by the child class.
	 */
    public void publicMethodOfInterfaceB();
}

/*
 * InterfaceC extends two above interface InterfaceA and InterfaceB 
 * hence it follows the multiple inheritance.
 */
interface InterfaceC extends InterfaceA, InterfaceB{
	/*
	 * Hence InterfaceC extends InterfaceA and InterfaceB 
	 * so it have two invisible method publicMethodOfInterfaceA() and publicMethodOfInterfaceB().
	 */
    public void publicMethodOfInterfaceC(); // Public method of InterfaceC.
	
}
/*
 * Multilevel inheritance in java with 
 * For example class C extends class B and class B extends class A 
 * then this type of inheritance is known as multilevel inheritance. 
 * Lets see this in a diagram:
 *       ----------
 *       | ClassA |
 *       ----------
 *            ^
 *            |
 *       ----------
 *       | ClassB |
 *       ----------
 *            ^
 *            |
 *       ----------
 *       | ClassC | 
 *       ----------
 * It's pretty clear with the diagram that in Multilevel inheritance,
 * there is a concept of grand parent class.      
 */ 
          

public class Main
{
	public static void main(String[] args)
	{
		/*
		 * When we create an object of ClassA,
		 * then the ClassA called it's default constructor.
		 * And this object can only access the public and protected entity. 
		 */
		ClassA a = new ClassA();
		a.publicMethodOfClassA(); 
		a.protectedMethodOfClassA();
		/*
		 * It's not possible to access private method
		 * a.privateMethodOfClassA();
		 */
		
		/*
		 * When we create an object of ClassB,
		 * firstly called the default constructor of ClassA
		 * then call its own default constructor.
		 * Here, object 'b' can access all public entity of ClassA
		 * and it also can access the protected entity of ClassB if they remain in same package.
		 */
		ClassB b = new ClassB();
		b.publicMethodOfClassA();
		b.protectedMethodOfClassA(); // Possible, if ClassA and ClassB remain in same package.
		b.publicMethodOfClassB();
		b.protectedMethodOfClassB();
		
		/*
		 * When we create an object of ClassC,
		 * then the sequence of default constructor calling will be :
		 * (i) Firstly called the default constructor of ClassA
		 * (ii) Secondly called the default constructor of ClassB
		 * (iii) Finally called the  default constructor of ClassC
		 * Object 'c' can access all the public entity of ClassA and ClassB.
		 * Protected entity can be access if they remain in same package.
		 */
		ClassC c = new ClassC();
		c.publicMethodOfClassA();
		c.protectedMethodOfClassA();
		c.publicMethodOfClassB();
		c.protectedMethodOfClassB();
		c.publicMethodOfClassC();
		
		/*
		 * We can also create an object of child class with the help of their parent class constructor.
		 * In this case, this object can be able to access parent class entity only.
		 */
		
		ClassA obj1 = new ClassB();
		/*
		 * Object 'obj1' can access the ClassA accessible entity only.
		 */
		obj1.publicMethodOfClassA();
		obj1.protectedMethodOfClassA();
		
		/*
		 * Following statement are invalid
		 * obj1.publicMethodOfClassB();
		 * obj1.protectedMethodOfClassB();
		 */
		
	}
}

class ClassA
{
	/*
	 * Public and static field of ClassA that can access 
	 * with the help of every child class and grand child class.
	 * Like, ClassB.staticFieldOfClassA = 200; ClassC.staticFieldOfClassA = 300;
	 */
	public static int staticFieldOfClassA = 100;
	
	/*
	 * Constructor of ClassA
	 */
	public ClassA() {
		System.out.println("Hi, i am constructor of ClassA");
	}
	
	/*
	 * Public method of ClassA.
	 * This method is visible to all child class of it. 
	 */
	public void publicMethodOfClassA() {
		System.out.println("This is public method of ClassA");
	}
	
	/*
	 * Protected method of ClassA.
	 * This method is visible to it's child class when they are in same package.
	 */
	protected void protectedMethodOfClassA() {
		System.out.println("This is protected methode of ClassA");
	}
	
	/*
	 * Private method of ClassA.
	 * This is not visible to it's child class.
	 */
	private void privateMethodOfClassA() {
		System.out.println("This is private method of ClassA");
	}
}

/*
 * Hence ClassB extends ClassA so ClassB is a child class of ClassA.
 */
class ClassB extends ClassA
{
	/*
	 * Constructor of ClassB
	 */
	public ClassB() {
		System.out.println("Hi, i am constructor of ClassB");
	}
	
	/*
	 * Public method of ClassB.
	 * This method is visible to all child class of it. 
	 */
	public void publicMethodOfClassB() {
		System.out.println("This is public method of ClassB");
	}
	
	/*
	 * Protected method of ClassB.
	 * This method is visible to it's child class when they are in same package.
	 */
	protected void protectedMethodOfClassB() {
		System.out.println("This is protected methode of ClassB");
	}
	
	/*
	 * Private method of ClassB.
	 * This is not visible to it's child class.
	 */
	private void privateMethodOfClassB() {
		System.out.println("This is private method of ClassB");
	}
}

/*
 * Hence ClassC extends ClassB so ClassC is a child class of ClassB.
 * On the other hand ClassB extends ClassA hence ClassA is grand parent class of ClassC.
 */
class ClassC extends ClassB
{
	/*
	 * Constructor of ClassC
	 */
	public ClassC() {
		System.out.println("Hi, i am constructor of ClassC");
	}
	
	/*
	 * Public method of ClassC.
	 */
	public void publicMethodOfClassC() {
		System.out.println("This is public method of ClassC");
	}
		
}
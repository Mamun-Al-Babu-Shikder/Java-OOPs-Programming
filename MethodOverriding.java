public class MethodOverriding
{
	public static void main(String[] args)
	{
		Child obj = new Child();
		obj.publicMethodOfParent();
		obj.protectedMethodOfParent();
		obj.defaultMethodOfParent();  
		// obj.privateMethodOfParent(); // Not possible hence it is a private method.
		
	}
}

class Parent
{
	/*
	 * This is a public method and The Child class can easily can override it.
	 */
	public void publicMethodOfParent() {
		System.out.println("Public method of Parent class");
	}
	
	/*
	 * This is protected method and Child class also can override it. 
	 */
	protected void protectedMethodOfParent() {
		System.out.println("Protected method of Parent calss");
	}
	
	/*
	 * This is private method and it is not possible to override this method
	 * by any kind of Child class of it.
	 */
	private void privateMethodOfParent() {
		System.out.println("Private method of Parent class");
	}
	
	/*
	 * This is default method of parent class that have no any accessible modifier,
	 * and it can only override when Child class remain the same package with Parent class.
	 */
	void defaultMethodOfParent() {
		System.out.println("Default method od parent class without any accessible modifier");
	}
}


class Child extends Parent
{
	/*
	 * '@Override' annotation define that the following method is overridden.
	 */
	
	@Override
	public void publicMethodOfParent() {
		System.out.println("Override public method of Parent calss");
	}
	
	@Override
	protected void protectedMethodOfParent() {
		System.out.println("Override protected method of Parent calss");
	}
	
	/*
	 * This method only can override when Parent class and Child calss
	 * remain in same package.
	 */
	@Override
	void defaultMethodOfParent() {
		System.out.println("Override default method of parent class");
	}
	
	/*
	 * It's not possible to override this method
	 *@Override
	 *private void privateMethodOfParent() {
	 *System.out.println("Private method of Parent class");
	 *}
	 */
}


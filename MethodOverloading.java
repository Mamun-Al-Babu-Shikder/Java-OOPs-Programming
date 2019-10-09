public class MethodOverloading { 
	
	public static void main(String[] args)
	{
		MethodOverloading obj = new MethodOverloading();
		
		/*
		 * 'L' or 'l' for long type specifier
		 * 'F' or 'f' for float type specifier
		 * 'D' or 'd' for double type specifier
		 */
		
		obj.add(1, 2, 3); // This will call the 01 no. method.
		obj.add(1, 2, 3, 4); // This will be call the 02 no. method
		
		/*
		 * Here 1 & 2 can be int or long type but we don't specify them
		 * so by default it will call method no. 03
		 */
		obj.add(1, 2); 
		
		/*
		 * Here we specify the value type with suffix 'L'
		 * hence it call the method no. 04
		 */
		obj.add(1L, 2L);
		
		/*
		 * Here 1.45 and 2.56 can be float or double type but don't specify them
		 * So by default it will call the method no. 06 which parameter is double type
		 */
		obj.add(1.45, 2.56);
		
		/*
		 * Here we specify 42.45f and 25.55 with suffix 'f' 
		 * hence it will call method no. 05 which parameter is float type
		 */
		obj.add(42.45f, 25.55f);
		
		/*
		 * Type Promotion : 
		 * byte -> short -> int
		 * int -> float 
		 * int -> long
		 * int -> double
		 * long -> float
		 * long -> double
		 * float -> double
		 */
		
		/*
		 * If we specify those two value with suffix 'L' and 'F' 
		 * that means one of them is long and another is float,
		 * In this case method called with type 'Promotion'
		 */
		obj.add(5, 2F);
		obj.add(5, 2L);
		obj.add(5, 2D);
		obj.add(5L, 2F);
		obj.add(5L, 2D);
		obj.add(5F, 2D);
		
	}

	/*
	 * Following method with same name 'add'
	 */
	
	/*
	 * Method overloading by changing number of arguments
	 */

	// Method No : 01
	// There have three parameter in this method 
	public void add(int a, int b, int c) {
		System.out.println("add(int a, int b, int c) = "+(a+b+c));
	}
	
	// Method No : 02
	// There have four parameter in this method 
	public void add(int a, int b, int c, int d) {
		System.out.println("add(int a, int b, int c, int d) = "+(a+b+c+d));
	}
		
		
	/*
	 * Method overloading by changing the data type
	 */
	
	// Method No : 03
	// Method with int type parameter
	public void add(int a, int b) {
		System.out.println("add(int a, int b) = "+(a+b));
	}
	
	// Method No : 04
	// Method with long type parameter
	public void add(long a, long b) {
		System.out.println("add(long a, long b) = "+(a+b));
	}
	
	// Method No : 05
	// Method with float type parameter
	public void add(float a, float b) {
		System.out.println("add(float a, float b) = "+(a+b));
	}
	
	// Method No : 06
	// Method with double type parameter
	public void add(double a, double b) {
		System.out.println("add(double a, double b) = "+(a+b));
	}
	
}

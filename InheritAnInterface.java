/*
 * Inherit an interface is not exact to looks like a class in java. 
 * When we extends a class there don't have to implement the parent class methods. 
 * But it is not possible to extends an interface without implementing the abstract methods of that interface.
 * So we need to implement the all of abstract method inside child class.
 */

public class InheritAnInterface
{
	public static void main(String[] args)
	{
		// Create an object of Square class with the help of Shape reference
		Shape square = new Square(12f);
		square.calculateArea();
		square.displayArea();
		
		// Create an object of Rectangle class with the help of Shape reference
		Shape rectangle = new Rectangle(30f, 20f);
		rectangle.calculateArea();
		rectangle.displayArea();
		
		// Create an object of Circle class with the help of Shape reference
		Shape circle = new Circle(5f);
		circle.calculateArea();
		circle.displayArea();
		
		/*
		 * It is not mandatory to create an object of Child class with the help of Parent class reference.
		 * We can create object with it's reference.
		 */
		
		// Create an object of Square.
		Square square2 = new Square(21.2f);
		square2.calculateArea();
		square2.displayArea();
		
		// Create an object of Rectangle.
		Rectangle rectangle2 = new Rectangle(40.5f, 25.8f);
		rectangle2.calculateArea();
		rectangle2.displayArea();
		
		// Create an object of Circle.
		Circle circle2 = new Circle(7.4f);
		circle2.calculateArea();
		circle2.displayArea();
		
	}
}

/*
 * An interface 'Shape' with abstract methods 'calculateArea()', 'getArea()' and 'displayArea()'.
 * Hence 'calculateArea()''getArea()' and 'displayArea()' are abstract method for this they have no any body.
 */
interface Shape
{
	public void calculateArea();
	
	public float getArea();
	
	public void displayArea();
}

/*
 * Square is a class that implements the Shape interface,
 * the Square class must be implement the all abstract method of Shape interface
 */
class Square implements Shape
{
	private float side;
	private float area;
	
	public Square(float side) {
		this.side = side;
	}
	
	/*
	 * Implementation of calculateArea() method to calculate the area of Square.
	 */
	@Override
	public void calculateArea() {
		this.area = side * side;
	}
	
	/*
	 * Implementation of getArea() method to return the area of Square.
	 */
	@Override
	public float getArea() {
		return area;
	}
	
	/*
	 * Implementation of displayArea() method to display area of Square.
	 */
	@Override
	public void displayArea() {
		System.out.println("The Area of Square is "+area);
	}
	
}

/*
 * Rectangle is a class that implements the Shape interface,
 * the Rectangle class must be implement the all abstract method of Shape interface
 */
class Rectangle implements Shape
{
	private float width;
	private float height;
	private float area;
	
	public Rectangle(float width, float height){
		this.width = width;
		this.height = height;
	}

	/*
	 * Implementation of calculateArea() method to calculate the area of Rectangle.
	 */
	@Override
	public void calculateArea() {
		this.area = width * height;
	}
	
	/*
	 * Implementation of getArea() method to return the area of Rectangle.
	 */
	@Override
	public float getArea() {
		return area;
	}
	
	/*
	 * Implementation of displayArea() method to display area of Rectangle.
	 */
	@Override
	public void displayArea() {
		System.out.println("The Area of Rectangle is "+area);
	}
}

/*
 * Circle also implements the Shape interface,
 * So Circle class must be implement the all abstract method of Shape interface
 */
class Circle implements Shape
{
	public static final float PI  = 3.1416f;
	private float radius;
	private float area;
	
	public Circle(float radius) {
		this.radius = radius;
	}

	/*
	 * Implementation of calculateArea() method to calculate the area of Circle.
	 */
	@Override
	public void calculateArea() {
		this.area = PI * radius * radius;
	}
	
	/*
	 * Implementation of getArea() method to return the area of Circle.
	 */
	@Override
	public float getArea() {
		return area;
	}
	
	/*
	 * Implementation of displayArea() method to display area of Circle.
	 */
	@Override
	public void displayArea() {
		System.out.println("The Area of Circle is "+area);
	}
}

/*
 * We know that an abstract class can hold abstract and non abstract method,
 * So it is mandatory to override the all abstract method when a class extends it.
 * On the other hand, it is not mandatory to override the non abstract method.
 */
public class InheritAbstractClass
{
	public static void main(String[] args)
	{
		
		// Create an object of Square.
		Square square = new Square(32f);
		square.calculateArea();
		square.displayArea();
		
		// Create an object of Rectangle.
		Rectangle rectangle = new Rectangle(40f, 20f);
		rectangle.calculateArea();
		rectangle.displayArea();
		
		// Create an object of Circle.
		Circle circle = new Circle(12f);
		circle.calculateArea();
		System.out.println("The Area of circle is "+circle.getArea());
		
	}
}

/*
 * An abstract class 'Shape' with abstract methods 'calculateArea()'  and 'getArea()'.
 * Hence 'calculateArea()' and 'getArea()' are abstract method for this they have no any body.
 * But 'displayArea()' is not abstract so it has body.
 */
abstract class Shape
{
	/*
	 *  public float type field area that can use child class.
	 */
	public float area;
	
	// An abstract method calculateArea.
	public abstract void calculateArea();
	
	// Abstract method getArea.
	public abstract float getArea();
	
	// Non abstract class displayArea.
	public void displayArea() {
		System.out.println("Hi, you can override me, if you want to display area by me."
				+ "I don't mind if don't override me.");
	}
}

/*
 * Square is a class that extends the Shape abstract class so,
 * the Square class must be override the all abstract method of Shape class.
 */
class Square extends Shape
{
	private float side;
	
	/*
	 * Parameterized constructor of Square class.
	 */
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
	 * It is not mandatory to override this non abstract method. 
	 */
	@Override
	public void displayArea() {
		System.out.println("The Area of Square is "+area);
	}
	
}

/*
 * Rectangle is a class that extends the Shape abstract class,
 * the Rectangle class must be implement the all abstract method of Shape class.
 */
class Rectangle extends Shape
{
	private float width;
	private float height;
	
	/*
	 * Parameterized constructor of Rectangular class.
	 */
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
	 * It is not mandatory to override this non abstract method. 
	 */
	@Override
	public void displayArea() {
		System.out.println("The Area of Rectangle is "+area);
	}
}

/*
 * Circle also extends the Shape abstract class.
 * So Circle class must be implement the all abstract method of Shape class.
 */
class Circle extends Shape
{
	public static final float PI  = 3.1416f;
	private float radius;
	
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
	 * There have no any problem if we don't override the non abstract method 
	 */
	/*
	@Override
	public void displayArea() {
		System.out.println("The Area of Circle is "+area);
	}
	*/
}

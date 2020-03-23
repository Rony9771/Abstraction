package lab8;

public class ShapeTest {

	public static void main(String[] args) {
		
		Shape s=new Triangle("Red",12.0,5.0);
		
		System.out.println("Area of Triangle "+s.getArea());
		
		Shape r=new Rectangle("White",12.0,5.0);
		
		System.out.println("Area of Rectangle  "+r.getArea());
		

		Shape ss=new Circle("Red",5.0);
		System.out.println("Area of Circle "+ss.getArea());
	}

}

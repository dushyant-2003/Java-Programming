
public class SquareRunner {

	public static void main(String[] args) {
		Square obj = new Square(23);
		int area = obj.calculateArea();
		int perimeter = obj.calculatePerimeter();
		
		System.out.println("Area = " + area);
		System.out.println("Perimeter = " + perimeter);

	}

}

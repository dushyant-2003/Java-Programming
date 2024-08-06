
public class TriangleValidatorRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TriangleValidator obj = new TriangleValidator();
		boolean isValid = obj.isValidTriangle(50,100,30);
		
		if(isValid == true)
		{
			System.out.println("Valid Triangle");
		}
		else
		{
			System.out.println("Not a Valid Triangle");
		}
		
		boolean isValidRT = obj.isRightAngled(4, 3, 5);
		if(isValidRT)
		{
			System.out.println("Valid Right Angled Triangle");
		}
		else
		{
			System.out.println("Not a valid Right Angled Triangle");
		}
	}
	

}

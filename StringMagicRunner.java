
public class StringMagicRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringMagic obj = new StringMagic();
		
		int countUpCase = obj.countUppercaseLetters("AA2b1cc2D3");
		boolean ans = obj.hasConsecutiveDuplicates("AA2b1cc2D3");
		int rightMostDigit = obj.getRightmostDigit("AA2b1cc2D3");
		
		System.out.println("The string is AA2b1cc2D3");

		if(ans)
		{
			System.out.println("The string has consecutive duplicate characters");
		}
		else
		{
			System.out.println("The string has no consecutive duplicate characters");

		}
	
		System.out.println("The rightmost digit is  "+ rightMostDigit);

		
	}

}

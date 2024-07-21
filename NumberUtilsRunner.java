package introductionOOPS;

public class NumberUtilsRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberUtils obj = new NumberUtils();
		
		int lastDigit = obj.getLastDigit(12346);
		System.out.println("The last digit of the number 12346 is " + lastDigit); 
		
		int countDigits = obj.getNumberOfDigits(12346);
		System.out.println("The no. of  digits of the number 12346 is " + countDigits); 

		int sumOfDigits = obj.getSumOfDigits(12346);
		System.out.println("The sum of  digits of the number 12346 is " + sumOfDigits); 
		
		int reverseNumber = obj.reverseNumber(12346);
		System.out.println("The reverse of the number 12346 is " + reverseNumber); 

	}

}

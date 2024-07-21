package introductionOOPS;

public class LeapYearCheckerRunner {
	public static void main(String[] args)
	{
		LeapYearChecker obj = new LeapYearChecker();
		if(obj.isLeapYear(2000))
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not a Leap Year");
		}
	}
}

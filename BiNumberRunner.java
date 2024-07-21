package introductionOOPS;

public class BiNumberRunner {
	public static void main(String[] args)
	{
		BiNumber obj = new BiNumber(45,125);
		int lcm = obj.calculateLCM();
		int gcd = obj.calculateGCD();
		
		System.out.println("The LCM of 45 and 125 is " + lcm);
		System.out.println("The GCD of 45 and 125 is " + gcd);
	}
}

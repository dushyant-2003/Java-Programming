
import java.math.BigDecimal;
public class simpleInterestCalculatorRunner {
	public static void main(String[] args)
	{
		simpleInterestCalculator si = new simpleInterestCalculator("1232931.12","7.75");
		BigDecimal amount = si.calculateSI(5);
		System.out.println("Amount = " + amount);
	}
}

import java.math.BigDecimal;
public class simpleInterestCalculator {
	BigDecimal amount,principle,rate;
	
	simpleInterestCalculator(String p,String r)
	{
		principle = new BigDecimal(p);
		rate = new BigDecimal(r);
		
	}
	public BigDecimal calculateSI(int t)
	{
		BigDecimal ti = new BigDecimal(t);
		
		BigDecimal am  = principle.add(principle.multiply(rate).multiply(ti));
		
		return am;
	}
}

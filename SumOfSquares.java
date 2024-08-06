
public class SumOfSquares {
	public long calculateSumOfSquares(int n) {
        long sum = 0;
       if(n<0)
       {
           return -1;
       }
       
       for(int i=0;i<=n;i++)
       {
           sum += i*i;
       }
       return sum;
    }
	
}

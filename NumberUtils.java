package introductionOOPS;

public class NumberUtils {

    public int getLastDigit(int number) {
        // Write your code here
        if(number < 0)
        {
            return -1;
        }
        if(number == 0)
        {
            return 0;
        }
        return number %10;
    }
    public int getNumberOfDigits(int number) {
        int cnt = 0;
        if(number < 0)
        {
            return -1;
        }
        if(number ==0 )
        {
            return 1;
        }
            while(number != 0)
        {
            number /= 10;
            cnt++;
            
        }
        
        return cnt;
        
    }
    public int getSumOfDigits(int number) {
        int sum=0;
        if(number < 0)
        {
            return -1;
        }
        
        while(number != 0)
        {
            int d = number%10;
            sum += d;
            number /= 10;
        }
        return sum;
    }
    public int reverseNumber(int number) {
        // TODO: Write your code here
        int ans = 0;
        int n1 = number;
        if(number <0)
        {
            return -1;
        }
        
        while(number != 0)
        {
            int d = number % 10;
            ans = ans*10 + d;
            number /= 10;
        }
        return ans;
        
    }
}

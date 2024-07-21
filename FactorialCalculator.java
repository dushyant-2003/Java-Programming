package introductionOOPS;

public class FactorialCalculator {

    public int calculateFactorial(int number) {
        
        if(number < 0)
        {
            return -1;
        }
        if(number == 0)
        {
            return 1;
        }
        int ans = 1;
        for(int i=1;i<=number;i++)
        {
            ans *= i;
        }
        
        return ans;
    }
}

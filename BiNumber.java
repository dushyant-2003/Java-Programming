package introductionOOPS;

public class BiNumber {

    private int number1;
    private int number2;

    /**
     * Constructor that initializes the two numbers.
     * @param number1: The first number.
     * @param number2: The second number.
     */
    public BiNumber(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    /**
     * Getter for the first number.
     * @return the first number.
     */
    public int getNumber1() {
        return number1;
    }

    /**
     * Getter for the second number.
     * @return the second number.
     */
    public int getNumber2() {
        return number2;
    }

    /**
     * Calculates and returns the least common multiple (LCM) of the two numbers.
     * If either number is negative, returns -1 as the LCM for negative numbers is undefined.
     * If either number is zero, returns 0 as the LCM of 0 and any other number is 0.
     * @return LCM of the two numbers, or -1 if either number is negative, or 0 if either number is zero.
     */
    public int calculateLCM() {
        // TODO: Write your code here
        int n1 = getNumber1();
        int n2 = getNumber2();
        if(n1<0 || n2 <0)
        {
            return -1;
        }
        if(n1 == 0 || n2 == 0)
        {
            return 0;
        }
        int start = (n1>n2)?n1:n2;
        int max = start;
        while(true)
        {
            if(start%n1 == 0 && start%n2 == 0)
            {
                return start;
            }
            start+=max;
        }
    }
    public int calculateGCD() {
        // Write your code here
        int n1 = getNumber1();
        int n2 = getNumber2();
        
        
        
        if(n1 < 0 || n2 < 0)
        {
            return 1;
        }
        if(n1 == 0 || n2 == 0)
        {
            return 0;
        }
        if(n1 == n2){
            return n1;
        }
        
        int i = (n1<n2)?n1:n2;
        
       
        while(i>0)
        {
            if(n1%i == 0 && n2%i == 0)
            {
                return i;
            }
            i--;
        }
        return 1;        
    }
}
package introductionOOPS;

public class StringMagic {
    
    /**
     * This method counts the number of uppercase letters in a given string.
     *
     * @param str The string tao count uppercase letters in.
     * @return The number of uppercase letters in the string.
     */
    public int countUppercaseLetters(String str) {
        // TODO: Write your code here
        int ans = 0;
        
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch) == true)
            {
                ans++;
            }
        }
        return ans;
        
    }
    public boolean hasConsecutiveDuplicates(String str) {
        
        // TODO: Write your code here
        
        for(int i=0;i<str.length()-1;i++)
        {
            if(str.charAt(i) == str.charAt(i+1))
            {
                return true;
            }
        }
        return false;
    }
    public int getRightmostDigit(String str) {

        // TODO: Write your code here
        if(str.length() == 0)
        {
            return -1;
        }
        for(int i=str.length()-1;i>=0;i--)
        {
            if(Character.isDigit(str.charAt(i)) == true)
            {
                return Character.getNumericValue(str.charAt(i));
            }
        }
        return -1;
      
    }
}
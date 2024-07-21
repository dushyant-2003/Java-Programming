package introductionOOPS;


public class MyChar {

    // Method to determine if a character is a vowel
    public boolean isVowel(char ch) {
    
        // Use a switch statement to check for each vowel, both lowercase and uppercase
        switch (ch) {
        
           case 'A': case 'E': case 'I': case 'O': case 'U': case 'a':
               case 'e': case 'i': case 'o': case 'u':
                   return true;
               
            
        }

        return false;
    }
}
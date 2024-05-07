/** 
 * Program: LetterCaseConverter
 * 
 * Description:
 * This program takes a string input and transforms alphabetic characters.
 * It converts lowercase letters to uppercase letters (If Vovels are present) and shifts all other characters by one position in the alphabet. (if a --> b)
 * Special characters and numbers remain unchanged. (if @ --> @ || 1 --> 1)
 * 
 * Steps:
 * 1. Accept a string input from the user.
 * 2. Iterate through each character in the input string. (using charAt();
 * 3. If the character is an alphabetic lowercase letter (only if they are vovels are used), convert it to uppercase.
 * 4. If the character is an alphabetic uppercase letter, shift it by one position in the alphabet.
 * 5. Concatenate the transformed characters to form the final output.
 * 6. Display the transformed string as the program output.
 * 
 * Example Input:
 * Input String: "zello@123"
 * Modified str1: afmmp@123
 * Final output: Afmmp@123
*/




class AlphabeticCharacterTransformer {
    public static void main(String[] args) {
        String str = "zello@123";
        String str1 = "";

        for(int i = 0; i < str.length(); i++) 
        {
            char ch = str.charAt(i);
            
            if(ch >= 'a' && ch <= 'z') 
            {
                if(ch == 'z') 
                {
                    str1 += 'a';
                } else 
                {
                    str1 += ++ch;
                }
            } 
            else 
            {
                str1 += ch;
            }
            
        }

        System.out.println("Modified str1: " + str1); // Debugging print

        String op = ""; // Corrected initialization here
        for(int i = 0; i < str1.length(); i++) 
        {
            char ch = str1.charAt(i);
            
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
            {
                op += (char)(ch - 32);
            } else 
            {
                op += ch;
            }
        }

        System.out.println("Final output: " + op); // Output the final modified string
    }
}

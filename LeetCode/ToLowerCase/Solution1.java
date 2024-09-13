import java.util.Scanner;

    /**
     * This method converts all uppercase characters in the input string to lowercase.
     * 
     * @param s The input string containing uppercase and/or lowercase letters.
     * @return The string with all uppercase characters converted to lowercase.
     * 
     * Example: 
     * Input: "Hello World"
     * Output: "hello world"
     */


public class Solution1 
{
    public String toLowerCase(String s) 
  {
        // Convert the input string to a character array for easier manipulation
        char[] c = s.toCharArray();
        
        // Iterate through each character in the array
        for (int i = 0; i < c.length; i++) 
        {
            // Check if the current character is an uppercase letter (ASCII value between 65 and 90)
            if (c[i] >= 65 && c[i] <= 90) 
            {
                // Convert the uppercase letter to lowercase by adding 32 to its ASCII value
                c[i] = (char) (c[i] + 32);
            }
        }
        
        // Return the modified character array as a new string
        return new String(c);
    }

    public static void main(String[] args) 
  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        // Create an instance of Solution class
        Solution1 solution = new Solution1();

        // Call the toLowerCase method and store the result
        String result = solution.toLowerCase(input);
    
        System.out.println("String in lowercase: " + result);
    }
}

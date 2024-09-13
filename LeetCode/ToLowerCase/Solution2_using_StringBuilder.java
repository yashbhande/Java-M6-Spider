import java.util.Scanner;
    /**
     * This method converts all uppercase characters in the input string to lowercase using StringBuilder.
     * 
     * @param s The input string containing uppercase and/or lowercase letters.
     * @return The string with all uppercase characters converted to lowercase.
     * 
     * Example: 
     * Input: "Hello World"
     * Output: "hello world"
     */

public class Solution2_using_StringBuilder 
{
    public String toLowerCase(String s) 
  {
        // Create a StringBuilder to build the lowercase string
        StringBuilder sb = new StringBuilder();
        
        // Iterate over each character of the input string
        for (char c : s.toCharArray()) 
        {
            // Check if the current character is an uppercase letter (ASCII value between 65 and 90)
            if (c >= 65 && c <= 90) {
                // Convert the uppercase letter to lowercase by adding 32 to its ASCII value
                c = (char) (c + 32);
            }
            // Append the (possibly converted) character to the StringBuilder
            sb.append(c);
        }
        
        // Convert the StringBuilder to a string and return it
        return sb.toString();
    }

    public static void main(String[] args) 
  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        // Create an instance of the Solution2_using_StringBuilder class
        Solution2_using_StringBuilder solution = new Solution2_using_StringBuilder();

        // Call the toLowerCase method and store the result
        String result = solution.toLowerCase(input);

        System.out.println("String in lowercase: " + result);
    }
}

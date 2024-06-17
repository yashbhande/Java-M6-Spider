// Create own charAt method 
// String -> Char

// To fetch the characters of a String
// This program converts a string into characters and stores them in an array
// Input: Ramesh
// Output: R a m e s h

class CharAtMethod_Own 
{
    // Static string variable initialized to "Ramesh"
    static String str = "Ramesh";

    public static void main(String[] args) 
   {
        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) 
        {
            // Print each character followed by a space
            System.out.println(userCharAt(i) + " ");
        }
    }

    // Custom charAt method to get character at a specific index
    public static char userCharAt(int indx) 
  {
        // Check for invalid index
        if (indx < 0 || indx >= str.length()) 
        {
            throw new StringIndexOutOfBoundsException("Wrong Index");
        }

        char[] arr = new char[str.length()];// Convert string to char array
        for (int i = 0; i < str.length(); i++) 
        {
            arr[i] = str.charAt(i);
        }
        return arr[indx];// Return character at specified index
    }
}

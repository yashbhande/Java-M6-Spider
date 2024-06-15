import java.util.*; // Importing the necessary classes from the java.util package
 
class AssciValueOfChar_FromArray 
{
    public static void main(String[] args) 
  {  
        char ch[] = {'A', 'D', 'Z', '@'};
        System.out.println(Arrays.toString(ch)); //Print original array
        
        for (char yash : ch) // Loop through each character in the array
        {
            int asciiValue = (int) yash;// Cast the character to an int to get the ASCII value            
            System.out.println("ASCII Value of " + yash + " is " + asciiValue); // Print the character and its corresponding ASCII value
        }
    }
}


// [A, D, Z, @]
// Assci Value of is 65
// Assci Value of is 68
// Assci Value of is 90
// Assci Value of is 64

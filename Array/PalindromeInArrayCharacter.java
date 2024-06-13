import java.util.*; // Importing the utility package which includes Scanner and Arrays classes

class PalindromeInArrayCharacter
  {
    public static void main(String[] args) 
  {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter Array size"); 
        int size = sc.nextInt(); 

        System.out.println("Enter character to be stored in Array"); 
        char[] arr = new char[size]; // Declaring a character array of the specified size

        // Loop to read characters from the user and store them in the array
        for (int i = 0; i < size; i++) 
        {
            arr[i] = sc.next().charAt(0); // Reading the next character input and storing it in the array
        }

        char[] reverseArray = new char[size]; // Declaring another character array to store the reverse of the input array
        int indx = 0; // Index for reverseArray

        // Loop to reverse the input array and store it in reverseArray
        for (int i = arr.length - 1; i >= 0; i--) 
        {
            reverseArray[indx++] = arr[i]; // Storing elements in reverse order
        }

        System.out.println("Reversed Array: "+Arrays.toString(reverseArray));// Printing the reversed array
        System.out.println("Original Array: "+Arrays.toString(arr));// Printing the original array

        // Checking if the original array and the reversed array are equal
        if (Arrays.equals(arr, reverseArray)) 
        {
            System.out.println("Reversed array and Original array are same , Hence its Palindrome"); // If they are equal, it is a palindrome
        } else 
        {
            System.out.println("Reversed array and Original array are NOT same , Hence its NOT Palindrome"); // If they are not equal, it is not a palindrome
        }
    }
}

// Enter Array size
// 3
// Enter character to be stored in Array
// s
// o
// s
// Reversed Array: [s, o, s]
// Original Array: [s, o, s]
// Reversed array and Original array are same , Hence its Palindrome

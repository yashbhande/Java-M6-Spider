// WAP to find count the vowels and consonants

import java.util.*; // Importing the utility package which includes Scanner class

class Vowels_Consonants_CountsArray 
{
    public static void main(String[] args) 
  {
        
        Scanner sc = new Scanner(System.in); // Creating a Scanner object for taking input from the user
        System.out.println("Enter size"); // Prompting user to enter the size of the character array
        int size = sc.nextInt(); // Reading the size of the character array

        System.out.println("Enter characters"); // Prompting user to enter characters
        char[] arr = new char[size]; // Declaring a character array of the specified size

        int vowels = 0, consonants = 0; // Initializing counters for vowels and consonants

        // Loop to read characters from the user, store them in the array, and count vowels and consonants
        for (int i = 0; i < size; i++) 
        {
            arr[i] = sc.next().charAt(0); // Reading the next character input and storing it in the array
            // Checking if the character is a vowel
            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u' || arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U') 
            {
                vowels++; // Incrementing the vowel counter
            } else 
            {
                consonants++; // Incrementing the consonant counter
            }
        }

        System.out.println("Vowels: " + vowels);// Printing the count of vowels
        System.out.println("Consonants: " + consonants); // Printing the count of consonants
    }
}

// Enter size
// 6
// Enter characters
// a
// e
// i
// o
// x
// z
// Vowels: 4
// Consonants: 2

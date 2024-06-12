import java.util.*;

class ConcatenateTwoArrays_Normal 
{
    public static void main(String[] args) 
  {
        int a[] = {1, 2, 3}; 
        int b[] = {4, 5, 6}; 
        System.out.println("Array 1: " + Arrays.toString(a)); // Printing the first array
        System.out.println("Array 2: " + Arrays.toString(b)); // Printing the second array

        int length = a.length + b.length; // Calculating the total length for the concatenated array
        int result[] = new int[length]; // Initializing the result array with the total length
        int pos = 0; // Position index for inserting elements into the result array

        for (int elements : a) 
        { // Loop through each element in the first array
            result[pos] = elements; // Copy element to the result array
            pos++; // Increment position index
        }

        for (int elements : b) 
        { // Loop through each element in the second array
            result[pos] = elements; // Copy element to the result array
            pos++; // Increment position index
        }

        System.out.println("Concatenated Array: " + Arrays.toString(result)); // Printing the concatenated array
    }
}


// Array 1: [1, 2, 3]
// Array 2: [4, 5, 6]
// Concatenated Array: [1, 2, 3, 4, 5, 6]

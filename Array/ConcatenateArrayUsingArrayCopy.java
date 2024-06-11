import java.util.*;

class ConcatenateArrayUsingArrayCopy 
{
    public static void main(String[] args) 
  {
        int [] arr1 = {1, 2, 3}; 
        int [] arr2 = {4, 5, 6}; 
        System.out.println("Array 1: " + Arrays.toString(arr1)); // Printing the first array
        System.out.println("Array 2: " + Arrays.toString(arr2)); // Printing the second array
        System.out.println();

        int aLen = arr1.length; // Getting the length of the first array
        int bLen = arr2.length; // Getting the length of the second array

        int [] result = new int[aLen + bLen]; // Initializing the result array with the combined length

        System.arraycopy(arr1, 0, result, 0, aLen); // Copying the first array into the result array
        System.arraycopy(arr2, 0, result, aLen, bLen); // Copying the second array into the result array starting at position aLen

        System.out.println("Concatenated Array: " + Arrays.toString(result)); // Printing the concatenated array
    }
}

// Array 1: [1, 2, 3]
// Array 2: [4, 5, 6]

// Concatenated Array: [1, 2, 3, 4, 5, 6]

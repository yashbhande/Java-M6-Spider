import java.util.*;

class MergeArray
{
    public static void main(String[] args) 
    {
        int a[] = {1, 2, 3, 4}; 
        int b[] = {4, 5, 6, 7}; 
        System.out.println("Array 1: " + Arrays.toString(a)); // Printing the first array
        System.out.println("Array 2: " + Arrays.toString(b)); // Printing the second array

        int length = a.length + b.length; // Calculating the total length for the concatenated array
        int result[] = new int[length]; // Initializing the result array with the total length
        int pos = 0; // Position index for inserting elements into the result array
        
        for(int i =0; i<a.length; i++)
        {
            result[i]=a[i];
        }
        for(int i =0; i<a.length; i++)
        {
            result[b.length+i]=b[i];
        }
   
        System.out.println("Merged Array: " + Arrays.toString(result)); // Printing the concatenated array
    }
}

// Array 1: [1, 2, 3, 4]
// Array 2: [4, 5, 6, 7]
// Merged Array: [1, 2, 3, 4, 4, 5, 6, 7]

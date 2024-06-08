//Array will be sorted
//Find the uninqiue elements
//add last element from array in Temp[] array
//Print unique arrays

//Print Unique elemts in Array
import java.util.*;
class RemoveDuplicateArray {
    public static void main(String[] args) {
        // Initialize the array with duplicate elements
        int a[] = {1, 4, 4, 2, 3, 6, 6, 4};
        System.out.println("Original Array: "+ Arrays.toString(a));
        
        Arrays.sort(a);// Sort the array to bring duplicates together
        int temp[] = new int[a.length];// Create a temporary array to hold unique elements
        int j = 0;// Initialize a variable to keep track of the index for the unique elements
        
        // Loop through the sorted array to find unique elements
        for (int i = 0; i < a.length - 1; i++) 
        {// If the current element is not equal to the next element, it's unique
            if (a[i] != a[i+1]) 
            {
                temp[j++] = a[i];// Store the unique element in the temporary array
            }
        }
        temp[j++] = a[a.length - 1]; // Add the last element to the temporary array, as it wasn't checked in the loop
        
        System.out.print("Unique array elemets are :");
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}

//Original Array: [1, 4, 4, 2, 3, 6, 6, 4]
//Unique array elemets are : 1 2 3 4 6 

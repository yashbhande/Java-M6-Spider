import java.util.*;

class RemoveDuplicateArray {
    public static void main(String[] args) {
        int a[] = {1, 4, 4, 2, 3, 3, 6, 4, 6, 6, 4, 6, 23, 22, 23, 23, 25, 67, 76, 55, 0};

        // Sort the array to bring duplicates together
        Arrays.sort(a);

        // Create a temporary array to hold unique elements
        int temp[] = new int[a.length];
        int j = 0;

        // Loop through the sorted array to find unique elements
        for (int i = 0; i < a.length - 1; i++) {
            // If the current element is not equal to the next element, it's unique
            if (a[i] != a[i + 1]) {
                // Store the unique element in the temporary array
                temp[j++] = a[i];
            }
        }

        // Add the last element to the temporary array, as it wasn't checked in the loop
        temp[j++] = a[a.length - 1];

        // Print the unique elements
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }
        
        
    }
}

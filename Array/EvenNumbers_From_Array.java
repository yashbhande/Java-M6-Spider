import java.util.*; // Importing the utility package which includes useful classes like Arrays

class EvenNumbers_From_Array 
{
    public static void main(String[] args) 
  {
        int a[] = {1, 2, 3, 4, 5, 6, 68, 7, 8, 9}; // Initializing an array with integers

        // Loop through each element in the array
        for (int i = 0; i < a.length; i++) 
        {
            // Check if the current element is even
            if (a[i] % 2 == 0) 
            {
                // Print the even number followed by a space
                System.out.print(a[i] + " ");
            }
        }
    }
}

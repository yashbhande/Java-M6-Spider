import java.util.*; // Importing the utility package which includes the Arrays class

class Find_ArrayLength_UsingLogic {
    public static void main(String[] args) {
        int a[][] = {{10, 20}, {30, 40, 50}, {60, 70}}; // Initializing a 2D array
        int length = 0; // Variable to keep track of the array length
        // System.out.println("2D Array : " + Arrays.deepToString(a));

        // Infinite loop to determine the length of the array
        for (;;) {
            try {
                // Access the sub-array and increase length
                int[] temp = a[length++]; // Increment length after accessing the sub-array
            } catch (Exception e) {
                // Break the loop if an exception occurs (e.g., ArrayIndexOutOfBoundsException)
                break;
            }
        }

        // Print the length of the array (subtracting 1 because length was incremented one extra time)
        System.out.println("Length of Arrays is : " + (length - 1));
    }
}

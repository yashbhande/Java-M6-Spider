*****
 ****
  ***
   **
    *


public class InvertedPyramidStarPattern {
    public static void main(String[] args) {
        int size = 5; // Adjust size as needed

        // Iterate over rows in reverse order
        for (int i = size; i >= 1; i--) {
            // Print spaces before stars
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}

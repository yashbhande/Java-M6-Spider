    *
   * *
  *   *
 *     *
*********


public class HollowPyramidStarPattern {
    public static void main(String[] args) {
        int size = 5; // Adjust size as needed

        // Iterate over rows
        for (int i = 1; i <= size; i++) {
            // Print spaces before stars
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (i == size || j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}

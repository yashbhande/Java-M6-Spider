public class SwapNumbers {
    // This program demonstrates different methods to swap the values of two integers.
    // We have three tasks:
    // 1. Swap using a third variable.
    // 2. Swap without using a third variable (using + and -).
    // 3. Swap without using a third variable (using * and /).

    public static void main(String[] args) {
        // Given numbers
        int a = 10;
        int b = 20;

        // 1. Swap using a third variable
        int temp = a;
        a = b;
        b = temp;

        // Output of swapping with a third variable
        System.out.println("After swapping with a third variable:");
        System.out.println("a = " + a + ", b = " + b);

        // Reset numbers
        a = 10;
        b = 20;

        // 2. Swap without using a third variable (using + and -)
        a = a + b;
        b = a - b;
        a = a - b;

        // Output of swapping without using a third variable (using + and -)
        System.out.println("\nAfter swapping without using a third variable (using + and -):");
        System.out.println("a = " + a + ", b = " + b);

        // Reset numbers
        a = 10;
        b = 20;

        // 3. Swap without using a third variable (using * and /)
        a = a * b;
        b = a / b;
        a = a / b;

        // Output of swapping without using a third variable (using * and /)
        System.out.println("\nAfter swapping without using a third variable (using * and /):");
        System.out.println("a = " + a + ", b = " + b);
    }
} /* Output Section 

After swapping with a third variable:
a = 20, b = 10

After swapping without using a third variable (using + and -):
a = 20, b = 10

After swapping without using a third variable (using * and /):
a = 20, b = 10

*/

// Program to check if the sum of digits of a number can divide the number itself
// Conditions:
// 1. Take a fixed number (e.g., 1234).
// 2. Calculate the sum of digits of the given number.
// 3. Check if the sum of digits can divide the given number.
// 4. If divisible, print "Divisible"; otherwise, print "Not Divisible".

class DivisibleBySumOfDigits {
    public static void main(String[] args) {
        int num = 1234; // Fixed number for demonstration
        int sum = 0; // Variable to store the sum of digits
        int org = num; // Store the original number before modification

        // Calculate the sum of digits
        do {
            int digit = num % 10; // Extract the last digit
            sum = sum + digit; // Add the digit to the sum
            num = num / 10; // Remove the last digit from the number
        } while (num > 0);

        // Check if the original number is divisible by the sum of digits
        if (org % sum == 0) {
            System.out.println("Divisible"); // Print if divisible
        } else {
            System.out.println("Not Divisible"); // Print if not divisible
        }
    }
}

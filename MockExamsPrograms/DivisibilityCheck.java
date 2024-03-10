// Program to check divisibility by 5 or 7 and perform additional checks
// Conditions:
// 1. If the number is divisible by 5, check if the sum of its digits is also divisible by the original number.
// 2. If the number is divisible by 7, print the alternate digits of the original number.



class DivisibilityCheck {
    public static void main(String[] args) {
        int number = 70707; // Placeholder number value (should be taken as input from the user)
        int originalNumber = number; // Store the original number for later use
        int sum = 0; // Variable to store the sum of digits

        // Check if the number is divisible by 5
        if (number % 5 == 0) {
            // Calculate the sum of digits
            do {
                int digit = number % 10; // Extract the last digit
                sum += digit; // Add the digit to the sum
                number /= 10; // Move to the next digit by removing the last digit
            } while (number > 0); // Repeat until all digits are processed

            System.out.println("Sum of digits: " + sum);

            // Check if the sum of digits is divisible by the original number
            if (sum % originalNumber == 0) {
                System.out.println("Divisible by 5 and sum of digits is also divisible.");
            } else {
                System.out.println("Divisible by 5 but sum of digits is not divisible.");
            }
        }

        // Check if the original number is divisible by 7
        if (originalNumber % 7 == 0) {
            System.out.println("Alternate digits of the original number:");
            // Print alternate digits of the original number
            do {
                int digit = originalNumber % 10; // Extract the last digit
                System.out.println(digit); // Print the digit
                originalNumber /= 100; // Move to the next alternate digit by removing the last two digits
            } while (originalNumber > 0); // Repeat until all alternate digits are printed
        }
    }
}

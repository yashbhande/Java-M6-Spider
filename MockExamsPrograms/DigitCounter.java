// Online Java Compiler
// Use this editor to write, compile, and run your Java code online

// Class to count the digits in a number
class DigitCounter {
    public static void main(String[] args) { 
        int num = 12345; // Number to count the digits in
        int count = 0; // Variable to store the count of digits
        
        // Loop to iterate through each digit of the number
        do {
            int digit = num % 10; // Extract the last digit of the number
            if (digit > 0) { // Check if the digit is greater than 0 (non-zero)
                count++; // Increment the count if the digit is non-zero
            }
            num = num / 10; // Remove the last digit from the number
        } while (num > 0); // Continue until all digits are processed
        
        // Display the count of digits
        System.out.println(count);
    }
}

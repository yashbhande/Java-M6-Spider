// Online Java Compiler
// Use this editor to write, compile, and run your Java code online

// Class to check if a number is a palindrome
class PalindromeChecker {
    public static void main(String[] args) {
        int num = 45689; // Original number
        
        int reverse = 0; // Variable to store the reverse value
        int org = num; // Store the original number for comparison
        
        // Loop to reverse the number
        do {
            num = num / 10; // Remove the last digit from the original number
            int digit = num % 10; // Extract the last digit
            reverse = reverse * 10 + digit; // Append the last digit to the reverse number
            num = num / 10; // Remove the last digit from the original number
        } while (num > 0); // Continue until all digits are processed
        
        // Display the reversed number
        System.out.println(reverse);
        
        // Check if the reversed number is equal to the original number
        if (reverse == org) {
            System.out.println("Palindrome"); // If palindrome
        } else {
            System.out.println("Not palindrome"); // If not palindrome
        }
    }
}

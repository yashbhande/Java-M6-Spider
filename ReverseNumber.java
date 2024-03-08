// Program to reverse the digits of a given number

public class ReverseNumber {
    public static void main(String[] args) {
        // Given number
        int num = 12345;
        
        // Variable to store the reversed number
        int reversedNumber = 0;
        
        // Loop to reverse the digits of the number
        do {
            // Extract the last digit of the number
            int digit = num % 10;
            
            // Append the extracted digit to the reversed number
            reversedNumber = reversedNumber * 10 + digit;
            
            // Remove the last digit from the number
            num = num / 10;
        } while (num != 0);
        
        // Output the reversed number
        System.out.println("Reversed number: " + reversedNumber);
    }
}

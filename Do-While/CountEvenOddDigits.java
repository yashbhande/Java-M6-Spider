// This class demonstrates how to count the number of even and odd digits in a number.

class CountEvenOddDigits {
    public static void main(String[] args) {
        int number = 3332; // The number whose even and odd digits are to be counted
        int remainder = 0; // Variable to store the remainder when dividing by 10
        int evenCount = 0; // Variable to store the count of even digits
        int oddCount = 0; // Variable to store the count of odd digits
        
        // Loop until the number becomes 0
        do {
            // Calculate the remainder when the number is divided by 10
            remainder = number % 10;
            
            // Check if the remainder is even
            if (remainder % 2 == 0) {
                // Increment the count of even digits
                evenCount++;
            } else {
                // Increment the count of odd digits
                oddCount++;
            }
            
            // Divide the number by 10 to remove the last digit
            number = number / 10;
        } while (number > 0); // Continue the loop until the number becomes 0
        
        // Print the count of even and odd digits
        System.out.println("Number of Even Digits: " + evenCount + "\n" + "Number of Odd Digits: " + oddCount);
        
        // Output:
        // Number of Even Digits: 3
        // Number of Odd Digits: 1
    }
}

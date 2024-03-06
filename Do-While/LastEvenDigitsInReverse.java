
// how to print the even digits of a number in reverse order.

class LastEvenDigitsInReverse {
    public static void main(String[] args) {
        int remainder = 0; // Variable to store the remainder when dividing by 10
        int number = 1234; // The number whose even digits are to be printed in reverse
        
        // Loop until the number becomes 0
        do {
            // Calculate the remainder when the number is divided by 10
            remainder = number % 10;
            // Divide the number by 10 to remove the last digit
            number = number / 10;
            
            // Check if the remainder is even
            if (remainder % 2 == 0) {
                // Print the even digit
                System.out.println(remainder);
            }
        } while (number > 0); // Continue the loop until the number becomes 0
        
        
    }
}
/* Output
    4
    2
*/

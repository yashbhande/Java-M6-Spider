// This demonstrate by printing last digit of number
//E.g Number=1234, Output=4321

class PrintLastDigits {
    public static void main(String[] args) {
        int remainder = 0; // Variable to store the remainder when dividing by 10
        int number = 5299; // The number whose digits are to be printed in reverse
        
        do {
            // Calculate the remainder when the number is divided by 10
            remainder = number % 10;
            // Divide the number by 10 to remove the last digit
            number = number / 10;
            // Print the last digit
            System.out.println(remainder);
        } while (number > 0); // Continue the loop until the number becomes 0
    }
}
/* Output
  9
  9
  2
  5
*/

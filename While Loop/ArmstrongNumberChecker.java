// Program to check if a number is an Armstrong number

class ArmstrongNumberChecker {
    public static void main(String[] args) {

       // Define the number to be checked
       int number = 407;
       int t1 = number; // Temporary variable to calculate the number of digits
       int length = 0; // Variable to store the length of the number
       
       // Calculate the number of digits in the number
       while (t1 != 0) {
           t1 = t1 / 10; // Divide by 10 to move to the next digit
           length = length + 1; // Increment the length for each digit
       }
       
       int t2 = number; // Temporary variable to calculate the Armstrong number
       int rem = 0; // Variable to store the remainder
       int arm = 0; // Variable to store the Armstrong number
       int originalNumber = number; // Store the original number for comparison later

       // Calculate the Armstrong number
       while (t2 != 0) {
           rem = t2 % 10; // Get the rightmost digit using modulus
           int mul = 1; // Initialize multiplication factor to 1
           
           // Raise the rightmost digit to the power of the number of digits
           for (int i = 1; i <= length; i++) {
               mul = mul * rem; // Multiply the digit by itself 'length' times
           }
           arm = arm + mul; // Add the powered digit to the Armstrong number
           t2 = t2 / 10; // Move to the next digit
       }
       
       // Check if the original number is equal to the Armstrong number
       if (originalNumber == arm) {
           System.out.println("Armstrong");
       } else {
           System.out.println("Not armstrong");
       }
    }
}

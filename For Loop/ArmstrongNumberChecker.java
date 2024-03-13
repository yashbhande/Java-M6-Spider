
// ArmstrongNumberChecker class
class ArmstrongNumberChecker {
    public static void main(String[] args) {
        int num = 1634; // Input number to check for Armstrong property
        int num2 = num; // Copy of the input number for digit processing
        int num3 = num; // Copy of the input number for final comparison
        int result = 0; // Variable to store the sum of powers of digits
        
        int count = 0; // Initialize digit count to 0
        
        // Count the number of digits in the input number
        while (num > 0) {
            num /= 10; // Remove the last digit of the number
            count++; // Increment count for each removed digit
        }
        System.out.println("Number of digits: " + count); // Print the number of digits
        
        // Calculate the sum of powers of digits
        while (num2 > 0) {
            int rem = num2 % 10; // Extract the last digit of the number
            int power = 1; // Initialize power to 1
            
            // Compute power of the digit using count
            for (int i = 1; i <= count; i++) {
                power = power * rem; // Multiply power with the digit
            }
            
            result = result + power; // Add the power to the result
            num2 /= 10; // Remove the last digit from the number
        }
        
        System.out.println("Sum of powers of digits: " + result); // Print the sum of powers
        
        // Check if the original number is an Armstrong number
        if (num3 == result) {
            System.out.println("Armstrong"); // Print if the number is Armstrong
        } else {
            System.out.println("Not an Armstrong"); // Print if the number is not Armstrong
        }
    }
}

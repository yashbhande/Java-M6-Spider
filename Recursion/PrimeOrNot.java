// Check if a number is prime or not
class PrimeOrNot {
    static int num = 7;   // Number to check for primality
    static int i = 2;     // Divisor starts from 2
    static boolean flag = true;  // Flag to determine if the number is prime or not
    
    public static void main(String[] args) {
        primeCheck();       //calling method
        System.out.println(flag ? "Prime" : "Not Prime");  // Print the result
    }

    // Method to check if the number is prime
    public static void primeCheck() {
        if (i == num)   // Base case: If divisor equals the number, stop recursion
            return;

        if (num % i == 0) { // If the number is divisible by the divisor
            flag = false;   // Set flag to false (not prime)
            return;
        }

        i++;    // Increment the divisor for the next iteration
        primeCheck();   // Recursive call to continue checking divisibility
    }
}

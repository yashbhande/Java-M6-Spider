//  This class calculates the factorial of a given non-negative integer.

class FactorialCalculator {

  public static void main(String[] args) {
    // Initialize the number to calculate factorial for (change this value if needed)
    int num = 6;

    // Variable to store the factorial result
    int fact = 1;

    // While loop to calculate factorial (runs as long as num is greater than 0)
    while (num > 0) {
      // Multiply the current factorial with the current number
      fact = fact * num;

      // Decrement the number by 1 for the next iteration
      num--;
    }

    // Print the factorial of the number
    System.out.println("The factorial of " + num + " is: " + fact);
  }
}

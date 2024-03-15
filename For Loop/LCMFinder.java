// This class finds the Least Common Multiple (LCM) of two numbers

 //This program finds the Least Common Multiple (LCM) of two numbers

/**
 * The Least Common Multiple (LCM) of two numbers is the smallest positive integer 
 * that is a multiple of both numbers. In simpler terms, it's the smallest number that 
 * can be divided evenly by both the given numbers.

 * Finding the LCM is useful in various scenarios, such as:
 *   - Adding or subtracting fractions with different denominators (LCM helps create 
 *     a common denominator for both fractions).
 *   - Synchronizing events that occur at different intervals (LCM helps determine 
 *     the least amount of time it takes for both events to occur again).

 * This program uses a simple approach to find the LCM. It starts with the larger 
 * of the two numbers and keeps incrementing it. If the incremented number is 
 * divisible by both the original numbers, then it's the LCM. 
 */




public class LCMFinder {

  public static void main(String[] args) {
    // Initialize two numbers
    int number1 = 3;
    int number2 = 25;

    // Initialize a variable to store the LCM, starting from the larger number
    int largest = (number1 > number2) ? number1 : number2;

    // Loop continuously until the LCM is found
    while (true) {
      // Check if the current largest number is divisible by both numbers
      if (largest % number1 == 0 && largest % number2 == 0) {
        // If yes, it's the LCM, print it and break the loop
        System.out.println("Least Common Multiple (LCM) is: " + largest);
        break;
      }

      // If not, increment the largest number and continue looping
      largest++;
    }
  }
}

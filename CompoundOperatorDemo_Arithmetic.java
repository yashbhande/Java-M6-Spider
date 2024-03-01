// Demonstrates basic usage of compound arithmetic operators in Java

public class CompoundOperatorDemo_Arithmetic {

  public static void main(String[] args) {
    int number = 5;

    // Increase number by 3 (same as number = number + 3)
    number += 3;
    System.out.println("Increased: " + number); // Output: Increased: 8

    // Decrease number by 2 (same as number = number - 2)
    number -= 2;
    System.out.println("Decreased: " + number); // Output: Decreased: 6

    // Multiply number by 2 (same as number = number * 2)
    number *= 2;
    System.out.println("Multiplied: " + number); // Output: Multiplied: 12

    // Divide number by 3 (same as number = number / 3)
    number /= 3;
    System.out.println("Divided: " + number); // Output: Divided: 4

    // Add 1 to number (shorthand for number++)
    number++;
    System.out.println("After adding 1 (number++): " + number); // Output: After adding 1 (number++): 5
  }
}

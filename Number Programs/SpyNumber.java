// This program checks whether a given number is a Spy Number or not.
// A Spy Number is a number whose sum of digits equals the product of its digits.
// e.g 123. 1+2+3=6(sum)   1*2*3=6(product)
// if (sum == product)-----> Spy Number

import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter a number to extract its digits:");
        int number = scanner.nextInt(); // Read user input
        

        int sumOfDigits = 0;
        int productOfDigits = 1;
        while(number != 0) {
            int remainder = number % 10;
            sumOfDigits = sumOfDigits + remainder; 
            productOfDigits = productOfDigits * remainder;
            number = number / 10;
        }
        
        System.out.println("Sum of Digits is: " + sumOfDigits);
        System.out.println("Product of Digits is: " + productOfDigits);
        
        if(sumOfDigits == productOfDigits) {
            System.out.println("This is a Spy Number.");
        } else {
            System.out.println("This is not a Spy Number.");
        }
    }
}

// This program checks whether a given number is positive, negative, or zero using if-else statements.
public class NumberCheckIfElse {
    public static void main(String[] args) {
        int number = 10;

        // Check if the number is positive
        if (number > 0) {
            System.out.println("The number is positive.");
        } 
        // If the number is not positive, check if it's negative
        else {
            if (number < 0) {
                System.out.println("The number is negative.");
            } 
            // If the number is neither positive nor negative, it's zero
            else {
                System.out.println("The number is zero.");
            }
        }
    }
}

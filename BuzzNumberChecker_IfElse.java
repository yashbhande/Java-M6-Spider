// Program to check buzz number or not . Check using if-else statement.


public class BuzzNumberChecker_IfElse {

    public static void main(String[] args) {
        int number = 15; // Change this value to check different numbers

        if (number % 7 == 0 || number % 10 == 7) {
            System.out.println(number + " is a Buzz number.");
        } else {
            System.out.println(number + " is not a Buzz number.");
        }
    }
}

/* This program checks if a number is a "Buzz Number" according to the following conditions:
 1) The number is divisible by 7
 2) The last digit of the number is 7
*/

class BuzzNumberChecker_TernaryOP {
    public static void main(String[] args) {

        // Test number
        int number = 10;

        int a=37;
        String result1 = (a % 7 == 0)?("Buzz Number"):
                         (a % 10 == 7)?("Buzz Number"):
                         ("Not an Buzz Number");
                 
        System.out.println(result1);
        
        // Checking if the number is a two-digit number
        String result = (number >= 10 && number <= 99) ? (
                // Checking if the number satisfies the Buzz Number conditions
                (number % 7 == 0 || number % 10 == 7) ? ("Buzz Number") : ("Not a Buzz Number") // Logic for checking Buzz Number: Divisible by 7 or last digit is 7
        ) : ("Not a Correct Number"); // If not a two-digit number, it's not a correct number

        // Output the result
        System.out.println(result); // Output: Not a Correct Number
    }
}

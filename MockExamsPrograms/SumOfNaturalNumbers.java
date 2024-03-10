// Online Java Compiler
// Use this editor to write, compile, and run your Java code online

// Class to calculate the sum of the first n natural numbers
class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int num = 10; // Number of natural numbers to sum
        int sum = 0; // Variable to store the sum
        
        // Loop to calculate the sum of the first n natural numbers
        do {
            sum = num * (num + 1) / 2; // Formula to calculate the sum of first n natural numbers
            System.out.println(sum); // Print the sum
        } while (num > 10); // Loop condition
        
    }
}

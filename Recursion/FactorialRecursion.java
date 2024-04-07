// This program calculates factorial recursively
// factorial of 5 -------------> 5*4*3*2*1= 120


class FactorialRecursion {
    
    static int fact = 1;         // Starting value
    static int i = 5;            // value to multiply with

    public static void main(String[] args) {  
    // Call the factorial method
        fact();          
        System.out.print(fact); // Print the final factorial result
    }

    public static void fact() {
        // Base case: If i becomes 0, stop recursion
        if (i == 0) {
            return;
        }

        fact = fact * i; // Calculate factorial: fact * i
        i--;             // Decrement i for the next iteration
        fact();          // Recursive call to calculate factorial
    }
}

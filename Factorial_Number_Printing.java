
class Factorial_Number_Printing {
    
    public static void main(String[] args) {
       
        int n = 5; // Change this value to calculate factorial of a different number
        int fact = 1; // Initialize factorial variable with 1
        
        // Loop to calculate factorial
        for (int i = 1; i <= n; i++) {
            fact = fact * i; // Multiply factorial with current value of i
              // Example: If n = 5, the loop will execute 5 times.
                // At each iteration, the value of 'i' increases by 1.
                // Example of iterations:
                // Iteration 1: fact = fact * i (1*1=1), i++ (i new value: 2), fact (new value: 1)
                // Iteration 2: fact = fact * i (1*2=2), i++ (i new value: 3), fact (new value: 2)
                // Iteration 3: fact = fact * i (2*3=6), i++ (i new value: 4), fact (new value: 6)
                // Iteration 4: fact = fact * i (6*4=24), i++ (i new value: 5), fact (new value: 24)
                // Iteration 5: fact = fact * i (24*5=120), i++ (i new value: 6), fact (new value: 120)

        }
        
        // Print the factorial result
        System.out.println("Factorial of " + n + " is : " + fact);
    }
}

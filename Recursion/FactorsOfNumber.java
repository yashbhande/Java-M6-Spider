// Factors of Number 
// Num: 12 factors ------> 1,2,3,4,6,12
// Integer that divides the number exactly, leaving no remainder.  


class FactorsOfNumber {
    static int num = 50; // Number to find factor of
    static int i = 1;    // Starting divisor
    
    public static void main(String[] args) {
        factors(); // Call the method to find factors
    }
    
    public static void factors() {
        // Check if 'i' is a factor of 'num' and print it if it is
        if (num % i == 0) {
            System.out.println(i);
        }
        
        i++; // Increment divisor for the next iteration
        
        // Base case: If 'i' exceeds 'num', stop recursion
        if (i > num) {
            return;
        }
        
        factors(); // Recursive call to continue finding factors
    }
}



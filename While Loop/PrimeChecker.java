// Prime numbers are natural numbers that are divisible by only 1 and the number itself.
// Program to check whether a given number is prime or not

public class PrimeChecker {
    public static void main(String[] args) {
 
        int num=13; // Number to check
        int counter=0; // Counter for factors
        int i=2; // Starting divisor
//        int it=0; // Iterator count
        
        // Loop to check factors of the number
        while(i<=num/2)
        {
            if(num%i==0)
            {
                counter++; // Increment counter if num is divisible by i
        
            }
            i++; // Move to the next divisor
 //           it++; // Increment iterator count
        }
 
        // Print the number of loop iterations
   //     System.out.println("Loop Iteration happened: "+it);
        
        // Check if the number is prime or not and print the result
        if(counter==0){
            System.out.println("Prime");
        }
        else
        {
            System.out.println("Not Prime");
        }
    }
}

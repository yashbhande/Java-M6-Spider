
import java.util.Scanner;

// Class demonstrating method with arguments
class ArgumentMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Taking input for A and B
        System.out.print("Enter value for A: ");
        int a = input.nextInt();
        System.out.print("Enter value for B: ");
        int b = input.nextInt();
        
        System.out.println("The sum of " + a + " and " + b + " is " + max(a, b)); //Passing two Arguments to max() method
    }
    
    // Method to calculate the sum of two integers
    public static int max(int x, int z) // takes two integers as input parameters
    {
        return x + z;
    }
}

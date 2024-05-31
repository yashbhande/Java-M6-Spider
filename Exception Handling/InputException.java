// If the user gave input as 0, an ArithmeticException will occur.
// If the user gave String input , an InputMismatchException will occur. 

import java.util.Scanner;

class InputException
{
    static Scanner input = new Scanner(System.in);
    static int num;

    public static void main(String[] args) 
{
        try 
        {
            System.out.print("Enter Number: ");
            num = input.nextInt(); // Read an integer input from the user

            if (num == 0) // If the user entered 0, an ArithmeticException will occur
            {
                System.out.println(num / 0);
            }  
        } // try End
        catch (Exception e) // Handle any exception that occurs during execution
        {
             e.printStackTrace(); // Print the error message and stack trace
        }  // catch End
}
}

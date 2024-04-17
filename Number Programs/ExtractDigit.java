/*
input: 12345
Output:54321
*/

import java.util.Scanner;

public class ExtractDigit {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter digit to extract:");
        int num = myObj.nextInt(); // Read user input
        ExtractNumber(num);
    }
    
    static void ExtractNumber(int digit)
    {
        while(digit!=0)
        {
            int rem=digit%10;
            System.out.println(rem);
            digit=digit/10;
        }
    }
}

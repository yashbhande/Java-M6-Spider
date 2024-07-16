//WAP to read two characters and print the characters with smallest asciii
import java.util.Scanner;
class Program2 
{
    public static void main(String[] args) 
    {
        // 1. create 2 char variables
        char ch1, ch2;
        
        // 2. read data using scanner
        Scanner sc=new Scanner(System.in);
        ch1=sc.next().charAt(0);
        ch2=sc.next().charAt(0);
        
        // 3. logic to find smallest Ascii
        System.out.println(ch1<ch2 ? ch1 : ch2);
    } 
}

// Input: F, R
// Output: F

// Input: r, o
// Output: o

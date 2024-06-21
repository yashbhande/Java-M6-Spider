// take 2 inputs and find largest between 2
import java.util.Scanner;
class Program1
{
    public static void main(String[] args) 
    {
        // 1. create 2 integer variables
        int num1, num2;
        // 2. read data using scanner
        Scanner sc=new Scanner(System.in);
        num1=sc.nextInt();
        num2=sc.nextInt();
        // 3. logic to find largest
        System.out.println(num1>num2 ? num1 : num2);
    }
}

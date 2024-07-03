import java.util.*;

public class OOOOOOOOOODivideNumber {
    
    public static int length(int num)
    {
        int count=0;
        while(num!=0)
        {
            num/=10;
            count++;
        }
        return count;
    }
    
    
    //find 2nd half -> method
    private static int findN2(int num , int length)
    {
        int n2 = 0;
        for(int i = 1 ; i <= length/2 ; i++)
        {
            int d = num % 10;
            n2 = n2 * 10 + d;
            num/=10;
        }
        return reverse(n2); //method called and returned
    }
    
    //to reverse -> method
    public static int reverse(int num)
    {
        int rev=0;
        while(num!=0)
        {
            int d = num % 10;
            rev = rev * 10 + d;
            num /=10 ;
        }
         return rev;
       // return new int[] {reverse(n2) , num};
    }
    
    
    private static int findN1(int num, int len)
    {
        for(int i = 1 ; i<= len/2; i++)
        {
            num /=10;
        }
        return num;
    }    
    
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        //s1 : read +ve integer
        int num = sc.nextInt();
        //s2 : find length of num
        int len = length(num);
        //s
       if(len % 2== 0)
       {
           //s4 : check for symetric
           //s4.1: find n1 & n2
           //s4.1.1: find n2
           int n2 = findN2(num, len);
           //s4.1.2: find n1
     
           int n1 = findN1( num, len);
           //s4.2 : find sum
           int sum = n1+n2 ; 
           //s4.3 : find square
           int square = sum * sum;
           //s4.4: check symetric
           if(num == square)
           {
               System.out.println("Symmetric");
           }
           else
           {
               System.out.println("Non-Symmetric");
           }
       }
       else
       {
           System.out.println("Invalid Number");
       }
    }
    
    
}

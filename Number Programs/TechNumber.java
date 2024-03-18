/*                  Output
Digits: 4
Divisor: 100
First half is :30
Second half is :25
Sum of FH and SH :55
Square of sum is :3025
3025 is an Tech Number
*/


class TechNumber {
    public static void main(String[] args) {
       
       int num=3025;    //Number to check
       int digit=0;     //Number to check digits
       int org=num;     //Duplicate value of num
       int sum=0;       //Sum of firstHalf and secondHalf
       int sqr=0;       //To store square sqr=sum*sum
       
       //Count how many digits
       while(num>0)
       {
           digit++;
           num/=10;
       }
       System.out.println("Digits: "+digit);
       
       //Tech number is always even number so calculate whether the digits are equal to even 
       if(digit%2==0)
       {
           int div=1;   //Divisior
           for(int i=1;i<=digit/2;i++)
           {
               div=div*10; //returns 100
           }
           System.out.println("Divisor: "+div);
           
           //Divide number in half
           int sh=org%div;
           int fh=org/div;
           
           
           System.out.println("First half is :"+fh);
           System.out.println("Second half is :"+sh);
           
           //sum of fh+sh
           sum=(fh+sh);
           System.out.println("Sum of FH and SH :"+ sum);
           
           //square of sum
           sqr=sum*sum;
           System.out.println("Square of sum is :"+ sqr);
           
           
           //compare if sqr == org or not
           if(sqr==org)
           {
               System.out.println(org+" is an Tech Number");
           }
           else 
           {
               System.out.println(org+" is not an Tech Number");
           }
           
       }else
       {
           System.out.println("Non Even Number");
       }
        
    }        
}

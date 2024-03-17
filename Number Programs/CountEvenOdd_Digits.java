//This program demonstrate how to count of Even and Odd Digits.

class CountEvenOdd_Digits {
    public static void main(String[] args) {
       int num=1234567;
       int even=0, odd=0;
       
       while(num!=0)
       {
           int rev=num%10;   //returns last value of num. e.g: 7
           if(rev%2==0)      // if rev%2 then increase even count
           {
               even++;
           }else              
           {
               odd++;
           }
           num/=10;
       }
       System.out.println("Count of Even Digits: "+even);
       System.out.println("Count of Odd Digits: "+odd);
    }
}

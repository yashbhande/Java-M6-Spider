//This program demonstrate how to calculate sum of digits.
//e.g : 5421; 5+4+2+1=12

class SumOfDigits {
    public static void main(String[] args) {
       int num=4541;
       int sum=0;
       
       while(num!=0)
       {
          // int rev=num%10;
           sum=sum+num%10;  //1=0+1  //5=1+4  // 10=5+5  // 14=10+4 
           num/=10;         // remove digits  //454  //45  //4  //0
       }
       System.out.println(sum);
    }
}

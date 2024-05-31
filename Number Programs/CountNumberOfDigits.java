//This program demonstrate how to count number of digits. 

class CountNumberOfDigits {
    public static void main(String[] args) {
       int num=1234567;
       int count=0;

       while(num!=0) //repeat loop until num==0
       {
           count++; //increase count as loop started
           num/=10;  //decrease number last digit , 123456
       }
       System.out.println("Count of Digits : "+count);
    }
}

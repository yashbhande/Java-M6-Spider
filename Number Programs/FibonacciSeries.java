//This program demonstrate how to print fibonaci series
//The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding ones, starting from 0 and 1.
//0 1 1 2 3 5 8 13 21 34

class FibonacciSeries {
    public static void main(String[] args) {
    int a=0, b=1, sum=0;
    
    System.out.print(a+" "+b+" ");
    for(int i=2;i<=10;i++)
    {
        sum=a+b;
        System.out.print(" "+sum);// 1 2 3 5 8 13.......
        a=b;
        b=sum;
    }
    }
}

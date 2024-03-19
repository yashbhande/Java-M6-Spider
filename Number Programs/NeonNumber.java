//A neon number is a number where the sum of digits of square of the number is equal to the number.

//There is a probability that even numbers beyond 1 trillion may contain 0, 1, and 9 as neon numbers.
/*
Number is : 9
sq=9*9=81
Square of number is : 81 
Divide each digit of square and Make Sum of it (8+1=9)
Sum of digits is : 9
Sum of square == original number , hence it is a Neon Number
*/

class NeonNumber {
    public static void main(String[] args) {
        int num=9;
        int sq=num*num;  //81
        int sum=0;
        
        System.out.println("Number is : "+num); 
        System.out.println("Square of number is : "+sq);
        System.out.println("Divide each digit of square and Make Sum of it");
        //divide square digits and make sum of them
        while(sq!=0)  //81!0
        {  
            int rem= sq % 10;  //1 = 81%10;
            sum=sum+rem;       //1 = 0+ 1;
            sq=sq/10;          //8 = 81;
        }
        
        System.out.println("Sum of digits is : "+sum);
        
        //compare square and sum are similar or not
        if(sum==num)
        {
            System.out.println("Sum of square == original number , hence it is a Neon Number");
        }
        else 
        {
            System.out.println("Sum of square != original number , hence it is not a Neon Number");
        }

    }
}

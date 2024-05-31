// a number which is divisible by sum of its digits is known as "Harshad/Niven Number"
//e.g 156-> 1+5+6=12    if (156%12==0) ? ("Harshad") : ("Not harshad"); 

class Harshad_Niven_Number {
    public static void main(String[] args) {
        int num= 156;
        int m=num;  //duplicate variable to compare
        int sum=0;
      
        while(num!=0)
        {
            int rem= num%10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.println("Sum is:" + sum);
        
        if(m%sum==0)
        {
            System.out.println("Harshad Number");
        }
        else
        {
            System.out.println("not ahrshad Number");
        }
    }
}

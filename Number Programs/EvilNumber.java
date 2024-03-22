/*              ---------Approach---------
1.Convert Number into Binary; {rem=n%2;  binary=binary+(rem*b);  n=n/2;  b=b*10; }
2.Count number of '1' in binary number.
3.If count is Even (then its evil num..)
4.If count is not even (then not evil..)
*/

public class EvilNumber
{
	public static void main(String[] args) {
		int n=36;
		int binary=0;   //to store binary number
		int b=1;    //to multipy rem with (rem*b)
		int counter=0;  //to count no.of 1 in binary
		
		System.out.println("Number value is :"+n);
		
		//Logic to convert Digit to Binary Conversion
		while(n>0)
		{
		    int rem=n%2;
		    binary=binary+(rem*b);
		    n=n/2;
		    b=b*10;
		}
		System.out.println("Its binary is: "+binary);
		
		//Count no of '1' in that Binary Number
		while(binary>0)
		{
		    int rem=binary%10;
		    if(rem==1)  //if remender is 1 then increase count
		    {
		        counter++;
		    }
		    binary=binary/10;
		}
		System.out.println(counter+ " times '1' is repeated in binary number");
		
		//If Counter is divisible by 2 then print evil 
		if(counter%2==0)
		{
		    System.out.println("Evil Number");
		}
		else
		{
		    System.out.println("Not evil");
		}
	}
}

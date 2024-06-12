//1D array , find sum and product of numbers in array
import java.util.*;
class SumAndProduct_Array
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size:");
		int size=sc.nextInt();

		System.out.println("Enter array elements:");
		int[] arr=new int [size];
		int sum=0,product=1;
    
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
			product=product*arr[i];
		}
    
		System.out.println("Sum"+sum);
		System.out.println("Product"+product);
	}
}

// Enter array size:4
// Enter array elements:
// 1
// 2
// 3
// 4
// Sum: 10
// Product: 24

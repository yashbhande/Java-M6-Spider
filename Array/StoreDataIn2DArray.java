//This prorgam stores data in 2 D array and Gievs the sum and Product of that array

import java.util.*;
class StoreDataIn2DArray
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array Rows:");
		int rows=sc.nextInt();
		System.out.print("Enter array Cols:");
		int cols=sc.nextInt();


		int[][] arr=new int [rows][cols];
		int sum=0,product=1;

  //To Store the elemnts inside array
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				arr[i][j]=sc.nextInt();
				sum=sum+arr[i][j];
				product=product+arr[i][j];
			}
		}
		System.out.println("Sum: "+sum);
		System.out.println("Product: "+product);

  //To Print Array
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				System.out.println(arr[i][j]+" "); 

			}
			System.out.println();
		}
    
	}
}

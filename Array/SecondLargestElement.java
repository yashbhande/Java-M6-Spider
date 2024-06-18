//Wap find second largest element in the array
//1. Sort Array
//2. Find 2nd Largest Element in array (length-2 index)
// Input: [2, 22, 33, 44, 55]
// Second largest elemnt is : 44

import java.util.*;
class SecondLargestElement
{

static{
	System.out.println("This Program is to Fetch the 2nd max Element in Array.");
}
public static void main(String[] args) 
{
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size");
	int size=sc.nextInt();

	System.out.println("Enter charactes");
	int[] a=new int[size];

	for(int i=0;i<size;i++)
	{
		a[i]=sc.nextInt();
	}

	int temp=0;
	for(int i=0; i<size; i++)
	{
		for(int j=i+1; j<size;j++)
		{
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	int temp1=a[a.length-2]; //(length - 2 Index) to find 2nd highest element in sorted array

	System.out.println(Arrays.toString(a));	//print sorted Array
	System.out.println("Second largest elemnt is : "+temp1); //print 2nd highest elemnt
}
}

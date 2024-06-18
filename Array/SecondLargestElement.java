//Wap find second largest element in the array
//1. Sort Array
//2. Find 2nd Largest Element in array (length-2 index)
// Original Array: [5, 10, 22, -5]
// Sorted Array: [-5, 5, 10, 22]
// 2nd Largest Element: 10

import java.util.*;
class SecondLargestElement
{

static Scanner sc=new Scanner(System.in);
  public static void main(String[] args) 
  {
    System.out.println("How many elements you want to store in Array ???");
    int arraySize=sc.nextInt();
    int a[]= new int[arraySize];
    int pos=0;
    for(int temp:a)
    {
        System.out.println("Enter Element:");
        a[pos++]=sc.nextInt();
    }
	System.out.println("Original Array: "+Arrays.toString(a));	

	int temp=0;
	for(int i=0; i<a.length; i++)
	{
	    for(int j=i+1; j<a.length; j++)
	    {
	        if(a[i]>a[j])
	        {
	            temp=a[i];
	            a[i]=a[j];
	            a[j]=temp;
	        }
	    }
	}
	System.out.println("Sorted Array: "+Arrays.toString(a)); //Print Original Sorted Array
	System.out.println("2nd Largest Element: "+a[a.length-2]);  //Print 2nd Largest Element
  }
}

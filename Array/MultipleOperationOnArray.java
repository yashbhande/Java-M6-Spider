// Multiple operation on Array

// Smallest Element in Array is :23
// Biggest Element in Array is :776
// Duplicate Elements are: 23
// Even Elements are: 88,776,
// Odd Elements are: 55,33,23,23,45
  
import java.util.*;
public class MultipleOperationOnArray
{
	public static void main(String[] args) 
  {
		int a[] ={55,33,88,23,776,23,45};
		findSmallestInArray(a); //method to find smallest element in array
		findBiggestInArray(a);  //method to find biggest element in array
		findDuplicateInArray(a); //method to find Duplicate in array
		findEvenInArray(a);  //method to find Even in array
		findOddInArray(a);  //method to find odd elements
	}

  //method to find Smallest Element
	public static void findSmallestInArray(int []a)
	{
	    int min=a[0];
		for(int i =0; i<a.length; i++)
		{
		    if(a[i]<min)
		    {
		        min=a[i];
		    }
		}
		System.out.println("Smallest Element in Array is :"+min);
	}

  //method to find Biggest Element
	public static void findBiggestInArray(int []a)
	{
	   
	    int max=a[0];
		for(int i =0; i<a.length; i++)
		{
		    if(a[i]>max)
		    {
		        max=a[i];
		    }
		}
		System.out.println("Biggest Element in Array is :"+max);
	}

  //method to find Duplicate Element
	public static void findDuplicateInArray(int []a)
	{
	   System.out.print("Duplicate Elements are: " );
	    for(int i=0; i<a.length; i++)
	    {
	        for(int j=i+1; j<a.length; j++)
	        {
	            if(a[i]== a[j])
	            {
	                System.out.print(a[i]);
	            }
	        }
	    }
	}

  //method to find Even Element
	public static void findEvenInArray(int []a)
	{
	   System.out.print("\nEven Elements are: " );
	    for(int temp:a)
	    {
	        if(temp%2==0)
	        {
	            System.out.print(temp+",");
	        }
	    }
	}

  //method to find Odd Element
  public static void findOddInArray(int []a)
	{
	   System.out.print("\nOdd Elements are: " );
	    for(int temp:a)
	    {
	        if(temp%2!=0)
	        {
	            System.out.print(temp+",");
	        }
	    }
	}
}

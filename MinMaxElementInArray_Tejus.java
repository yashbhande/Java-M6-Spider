
import java.util.*;
public class MinMaxElement_Tejus
{
	public static void main(String[] args) 
  {
		int a[] ={55,33,88,23,776,23,45};
		findSmallestInArray(a); //method to find smallest element in array
		findBiggestInArray(a);
	}
	
	public static void findSmallestInArray(int []a)
	{
	    int min=2147483647;
		for(int i =0; i<a.length; i++)
		{
		    if(a[i]<min)
		    {
		        min=a[i];
		    }
		}
		System.out.println("Smallest Element in Array is :"+min);
	}
	
	public static void findBiggestInArray(int []a)
	{
	    int max=-2147483648;
		for(int i =0; i<a.length; i++)
		{
		    if(a[i]>max)
		    {
		        max=a[i];
		    }
		}
		System.out.println("Biggest Element in Array is :"+max);
	}
  
}

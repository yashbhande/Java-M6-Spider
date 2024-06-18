// a[]={1,2,3,4};
// b[] ={4,-3,2,5,5,-6};
// Output:2 ,4 are the dulicate

import java.util.*;
class DuplicateBetweenTwoArray
{
	public static void main(String[] args)
	{
	    int a[]={1,2,3,4};
	    int b[] ={4,-3,2,5,5,-6};
	    duplicate(a,b); //calling method
	}
	
	public static void duplicate(int [] a, int[] b) //called method
	{
	    for(int i = 0; i < a.length; i++) //to traverse through array
	    {
	        for(int j = 0; j < b.length; j++) //to traverse through array
	        {
	            if (a[i] == b[j])
	            {
	                System.out.println(a[i]);
	            }
	        }
	    }
	}
}

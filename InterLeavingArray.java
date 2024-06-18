// a:[1,2,3]
// b:[4,5,6]
// Output:[1, 4, 2, 5, 3, 6]

import java.util.*;
class InterLeavingArray
{
	public static void main(String[] args)
	{
	    int a[]={1,2,3};
	    int b[] ={4,5,6};
	    int c[]= new int[a.length+ b.length];
	    int pos=0;
	    
	     for (int i = 0; i < a.length; i++) 
	    {
            c[pos++] = a[i];
            c[pos++] = b[i];
      }
	    System.out.println(Arrays.toString(c));
	}
}

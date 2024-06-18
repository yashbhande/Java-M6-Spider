// a:[1,2,3]
// b:[4,5,6]
// Output: [1, 2, 3, 4, 5, 6]
import java.util.*;
class MergedArrayEasy
{
	public static void main(String[] args)
	{
	    int a[]={1,2,3};
	    int b[] ={4,5,6};
	    int c[]= new int[a.length+ b.length]; //new Array to store merged elements
	    int pos=0;  //to itterate the array C index
	    
	    for (int i = 0; i < a.length; i++) 
	    {
          c[pos++] = a[i];//storing Array "a" elemnets in Array "C"
      }
        for (int i = 0; i < b.length; i++) 
	    {
          c[pos++] = b[i];//storing Array "b" elemnets in Array "C"
      }
	    System.out.println(Arrays.toString(c));
	    
	}
}

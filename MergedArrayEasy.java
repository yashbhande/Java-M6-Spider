//Sample 
// a:[1,2,3]
// b:[4,5,6]
// Output: [1, 2, 3, 4, 5, 6]

import java.util.*;
class MergedArrayEasy
{
   public static void main(String[] args) 
    {
        int a[] = {1, 2, 3, 4};
        int b[] = {5, 6, 7,5,4,2,1};
	    
        int merge[]= new int [a.length+b.length]; //giving size to new Array to store the elemnets in new Array
        int pos=0; //using as index for new array to store elemensts on new index
        
        for(int i=0; i<(a.length+b.length); i++) //itterate though all elements of array a & b
        {
           if(i<a.length) merge[pos++]= a[i];	//store array 'a' elements in new array
           if(i<b.length) merge[pos++]= b[i];	//store array 'b' elements in new array
        }  
        System.out.print("Merrged Array: "+Arrays.toString(merge));
    }
}

// a[] = {1,2,3,-4,3,-5,6,8};
//Reversed Numbers are :8 6 -5 3 -4 3 2 1 

import java.util.*;
class Reverse_NumbersIn_Array
{
    public static void main(String[] args) 
    {
        int a[] = {1,2,3,-4,3,-5,6,8};
        System.out.print("Reversed Numbers are :");
        for(int i=a.length-1; i>=0; i--)
        {   
            System.out.print( a[i]+" ");
        }
    }
}


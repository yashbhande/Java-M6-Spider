import java.util.*;

class Fetch_NegativeNumbersFrom_Array 
{
    public static void main(String[] args) 
    {
        int a[] = {1,2,3,-4,3,-5,6,-8};
        System.out.print("Negative Numbers are :");
        for(int i=0; i<a.length; i++)
        {   
            if(a[i]<0)
            {
            System.out.print( a[i]+" ");
            }
        }
    }
}

//Negative Numbers are :-4 -5 -8 

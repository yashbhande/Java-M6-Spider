import java.util.*;
public class Concatinate2Arrays_byVarun
{
	public static void main(String[] args) 
    {
        //Declare 2 Arrays
        int a[] = {1, 2, 3}; 
        int b[] = {4, 5, 6}; 
        
        //Print Original Arrays
        System.out.println("Array 1: " + Arrays.toString(a)); // Printing the first array
        System.out.println("Array 2: " + Arrays.toString(b)); // Printing the second array

        
        int length = a.length + b.length; // Calculating the total length for the concatenated array
        int result[] = new int[length]; // Initializing the result array with the total length

        //Add 1st arrays elements in Result[]
        for(int i =0; i<a.length; i++)
        {
            result[i]=a[i];     //result[1,2,3]
        }
        
        //Add 2nd arrays elemnts in Result[] by continuing along with 1st Array
        for(int i =0; i<b.length; i++)
        {
            result[a.length+i]=b[i]; //result[1,2,3->4,5,6]
        }
        
        System.out.println("Concatenated Array: " + Arrays.toString(result)); // Printing the concatenated array
        //Concatenated Array: [1, 2, 3, 4, 5, 6]
        
    }
}

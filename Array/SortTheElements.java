//WAP to sort the elements in Assending order
import java.util.*;
class SortTheElements
{
	public static void main(String[] args) 
  {
  	  Scanner sc=new Scanner(System.in);
  		System.out.println("Enter the size of Array");
  		int size=sc.nextInt();
  
  		System.out.println("Enter charactes");
  		int[] a=new int[size];
  
  		for(int i=0;i<size;i++)
  		{
  			a[i]=sc.nextInt();
  		}

    	int temp=0;
    
    	for(int i=0; i<size; i++)
    	{
    		for(int j=i+1; j<size;j++)
    		{
    			if(a[i]>a[j])
    			{
    				temp=a[i];
    				a[i]=a[j];
    				a[j]=temp;
    			}
    		}
    	}
	    System.out.println("Asscending Sorted Array: "+Arrays.toString(a));
  }
}


// Enter the size of Array
// 5
// Enter charactes
// 1
// 4
// 0
// 2
// 9
// Asscending Sorted Array: [0, 1, 2, 4, 9]

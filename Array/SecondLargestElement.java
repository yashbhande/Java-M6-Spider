//Wap find second largest element in the array
import java.util.*;
class SecondLargestElement
{

static{
	System.out.println("This Program is to Fetch the 2nd max Element in Array.");
}
public static void main(String[] args) 
{
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size");
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
	int temp1=a[a.length-2];

	System.out.println(Arrays.toString(a));
	System.out.println("Second largest elemnt is : "+temp1);
}
}

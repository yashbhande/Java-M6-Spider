//Wap find second smallest element in the array
import java.util.*;
class SecondSmallestElement
{

static{
	System.out.println("This Program is to Fetch the 2nd Small Element in Array.");
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
	int temp1=a[1];

	System.out.println(Arrays.toString(a));
	System.out.println("Second Smallest elemnt is : "+temp1);
}
}

// This Program is to Fetch the 2nd Small Element in Array.
// Enter size
// 4
// Enter charactes
// 1
// 2
// 6
// 3
// [1, 2, 3, 6]
// Second Smallest elemnt is : 2

import java.util.*;
class findOdd_inArray
{
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6,7,8};

		//Find the count of Odd Elemnts
		int count=0;
		for(int i:arr)
		{
			if(i%2!=0)
			{
				count++;
			}
		}

		int [] evenNumbers = new int[count];

		//index var to store element in OddNumber Array
		int indx=0; //for index sizeing in new Array

		//find odd and store in new Array
		for(int i:arr)
		{
			if(i%2!=0)
			{
				evenNumbers[indx++]=i;
			}
		}
		System.out.println(Arrays.toString(evenNumbers));
	}
	
}


[1, 3, 5, 7]

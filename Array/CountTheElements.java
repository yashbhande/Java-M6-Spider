//Program to find selected element hwo many times its repeated in array 
//So we need to get count of specific repeted element 

import java.util.*;
class CountTheElements {
    public static void main(String[] args) {
        // Initializing an array with integers
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();

		System.out.println("Enter charactes");
		int[] arr=new int[size];

		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
        
        System.out.println("Enter eleement to find: ");
        // Element to find in the array
        int findElements = sc.nextInt();
        
        // Flag to check if the element is found
        boolean flag = true;
        int count=0;
        // Loop through each element in the array
        for (int i = 0; i < arr.length; i++) 
        {
            // Check if the current element is the one we are looking for
            if (findElements == arr[i]) 
            {
                // Print the position of the element (i+1 for 1-based index)
                System.out.println("Element found on Position : " + (i + 1));
                // Set flag to false since element is found
                flag = false;
                // Exit the loop since the element is found
                count++;
                
            }
        }

        System.out.println("Repeted "+ count);

        // If the flag is still true, the element was not found
        if (flag) {
            System.out.println("Elements not found.");
        }
    }
}


// Enter size
// 6
// Enter charactes
// 1
// 2
// 3
// 3
// 3
// 4
// Enter eleement to find:
// 3
// Element found on Position : 3
// Element found on Position : 4
// Element found on Position : 5
// Repeted 3

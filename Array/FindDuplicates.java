import java.util.*;
public class FindDuplicates 
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Enter Array Size:");
        int size=sc.nextInt();
        System.out.println("Enter Array Elements:");
        
        int[] arr = new int[size];
        for(int i=0; i<size; i++)
        {
            arr[i]=sc.nextInt();
        }
        findDuplicates(arr);
    }

    public static void findDuplicates(int[] arr) 
    {
        System.out.println("Duplicate elements are: ");
        
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = i + 1; j < arr.length; j++) 
            {
                if (arr[i] == arr[j]) 
                {
                    System.out.print(arr[i] + " ");
                    break; // Break to avoid printing the same duplicate again
                }
            }//inner for end
        }//outer for end
    }
}

// Enter Array Size:
// 5
// Enter Array Elements:
// 12344
// 1234
// 1234
// 1234509876
// 0987
// Duplicate elements are: 
// 1234 

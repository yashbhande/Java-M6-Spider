import java.util.*;

class StoreEvenOdd_inArray 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int evenCount = 0, oddCount = 0;

        System.out.println("Enter Array Size:");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter Array Elements:");
        for (int i = 0; i < size; i++) 
        {
            arr[i] = sc.nextInt();
        }

        // Count length the even and odd numbers in the array for new Array
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] % 2 == 0) 
            {
                evenCount++;
            } else 
            {
                oddCount++;
            }
        }

        // Declare arrays to hold even and odd numbers
        int[] oddArr = new int[oddCount];
        int[] evenArr = new int[evenCount];

        // Initialize indices for even and odd arrays
        int idx1 = 0, idx2 = 0;

        // Separate even and odd numbers into respective arrays
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] % 2 == 0) 
            {
                evenArr[idx1++] = arr[i];
            } else {
                oddArr[idx2++] = arr[i];
            }
        }

        // Print the arrays containing even and odd numbers
        System.out.println("Even Numbers: " + Arrays.toString(evenArr));
        System.out.println("Odd Numbers: " + Arrays.toString(oddArr));
    }
}



// Enter Array Size:
// 3
// Enter Array Elements:
// 12
// 2
// 3
// Even Numbers: [2]
// Odd Numbers: [1, 3]


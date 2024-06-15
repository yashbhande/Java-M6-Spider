// Array A : [1, 2, 3, 4]
// Array B : [5, 6, 7]
// Inter Leaving Array : [1, 5, 2, 6, 3, 7, 4]

import java.util.*;
class InterLeaving_Array {
    public static void main(String[] args) 
    {
        int a[] = {1, 2, 3, 4};
        int b[] = {5, 6, 7};
    
        System.out.println("Array A : "+Arrays.toString(a));
        System.out.println("Array B : "+Arrays.toString(b));
        
        int c[] = new int[a.length + b.length];

        int pos = 0;// Position tracker for storing elements inside C array
        // Loop through the combined length of both arrays
        for (int i = 0; i < (a.length + b.length); i++) 
        {
            if (i < a.length) // Add element from array a if within its bounds
            {
                c[pos++] = a[i];
            }
            if (i < b.length) // Add element from array b if within its bounds
            {
                c[pos++] = b[i];
            }
        }

        System.out.println("Inter Leaving Array : "+Arrays.toString(c));// Print the interleaved result
    }
}

// Array A : [1, 2, 3, 4]
// Array B : [5, 6, 7]
// Inter Leaving Array : [1, 5, 2, 6, 3, 7, 4]

import java.util.*;
class MaxElement_InArray {
    public static void main(String[] args) {
        int a[]={2,1,2,3,4,5};
        System.out.println("Original Array: "+Arrays.toString(a));
        int max=a[0];
        
        for(int i=0; i<a.length;i++)
        {
            if(a[i]>max)
            max=a[i];
        }
        System.out.println("Max Element of Array is: "+max);
    }
}

// Original Array: [2, 1, 2, 3, 4, 5]
// Minimum Element of Array is: 5

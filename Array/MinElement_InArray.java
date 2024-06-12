import java.util.*;
class MinElement_InArray {
    public static void main(String[] args) {
        int a[]={2,1,2,3,4,5};
        System.out.println("Original Array: "+Arrays.toString(a));
        int min=a[0];
        
        for(int i=0; i<a.length;i++)
        {
            if(a[i]<min)
            min=a[i];
        }
        System.out.println("Minimum Element of Array is: "+min);
    }
}

// Original Array: [2, 1, 2, 3, 4, 5]
// Minimum Element of Array is: 1

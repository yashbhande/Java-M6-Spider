import java.util.*;
class HashSet_Simple_UniqueElements_Array
{
    public static void main(String[] args)
    {
        Set<Integer> st= new HashSet<>();
        int arr[]={1,1,2,3,3,4,5,6,7,8};
        System.out.println("Original Array : "+ Arrays.toString(arr));
        
        for(int i=0;i<arr.length;i++)
        {
            st.add(arr[i]);
        }
        System.out.println("Unique Elements : "+st);
    }
}

/* Output 

Original Array : [1, 1, 2, 3, 3, 4, 5, 6, 7, 8]
Unique Elements : [1, 2, 3, 4, 5, 6, 7, 8]
*/

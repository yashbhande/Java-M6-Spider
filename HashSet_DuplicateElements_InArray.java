import java.util.*;
class HashSet_DuplicateElements_InArray
{
    public static void main(String[] args)
    {
        int arr[]={11,2,2,3,4,5,6,6,5,5,5,2};
        System.out.println("Original String : "+Arrays.toString(arr)+"\n");
        Set<Integer> uniqueNumber = new HashSet<>();
        boolean isDuplicateExist = false;
        
        for(int i=0; i<arr.length; i++)
        {
            if(uniqueNumber.contains(arr[i]))
            {
                isDuplicateExist= true;
                System.out.println("Duplicate Elements :"+ arr[i]);
            }
            else
            {
                uniqueNumber.add(arr[i]);
            }
        }
        
        if(!isDuplicateExist)
        {
            System.out.println(-1);
        }
    }
}

/* Output
 Original String : [11, 2, 2, 3, 4, 5, 6, 6, 5, 5, 5, 2]

Duplicate Elements :2
Duplicate Elements :6
Duplicate Elements :5
Duplicate Elements :5
Duplicate Elements :5
Duplicate Elements :2

  */

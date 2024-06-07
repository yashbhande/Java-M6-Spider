import java.util.*; // Importing the utility package which includes the Arrays class

class Find_ArrayLength_UsingLogic {
    public static void main(String[] args) {
        int a[] = {10,20,3,40,50,60,70}; 
        int length = 0; // To keep Array Length
        System.out.print("Arrey elements are :");
        for (;;) //infinite loop
        {
            try 
            {
                System.out.print(a[length++]+" ");
            } catch (Exception e) 
            {
               // System.out.println(e.getMessage());
                break;
            }
        }

        // Print the length of the array (subtracting 1 because length was incremented one extra time)
        System.out.println();
        System.out.println("Length of Arrays is : " + (length - 1));
    }
}

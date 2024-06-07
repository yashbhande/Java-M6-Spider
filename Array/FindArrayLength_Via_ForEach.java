import java.util.*; // Importing the utility package which includes the Arrays class

class FindArrayLength_Via_ForEach
{
    public static void main(String[] args)
    {
        int arr[]={10,20,30,40,50,60};
        int length=0;
        
        for(int i : arr)
        {
            length++;
        }
        System.out.println("The length of Array is: "+length);
    }
}

//The length of Array is: 6

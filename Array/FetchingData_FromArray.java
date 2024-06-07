import java.util.*;

class FetchingData_FromArray {
    public static void main(String[] args) 
    {
        String names[]={"Yash","Nish","Amrit","Bca"};
        System.out.println("Name on position 2 :"+names[2]);
        
        for(int i=0; i<names.length; i++)
        {
            System.out.println(names[i]);
        }
    }
}

/* Output
Name on position 2 :Amrit
Yash
Nish
Amrit
Bca
*/

import java.util.*;

class StoreData_Into_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];
        System.out.println("Enter Five Names");
        System.out.println();
            
        for(int i=0; i<names.length; i++)
        {   
            System.out.print("Enter a Name : ");
            names[i] = sc.next();
            System.out.println((i+1) +" : "+names[i]);
        }
        System.out.println(Arrays.deepToString(names));
    }
}

/* Output:
Enter Five Names

Enter a Name : yash
1 : yash
Enter a Name : test
2 : test
Enter a Name : judo
3 : judo
Enter a Name : jinny
4 : jinny
Enter a Name : lilly
5 : lilly
[yash, test, judo, jinny, lilly]
*/

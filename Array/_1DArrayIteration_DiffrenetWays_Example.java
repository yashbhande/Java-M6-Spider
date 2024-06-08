import java.util.*;

class _1DArrayIteration_DiffrenetWays_Example {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 10, 30, 10, 40};
        System.out.println(Arrays.toString(arr));
        
        System.out.println("Using which way you would like to fetch this array ?");
        System.out.println("1. For Each Loop");
        System.out.println("2. For Loop");
        System.out.println("3. While Loop");
        System.out.println("4. Do While Loop");
        System.out.print("Choice option: ");
        int choose=sc.nextInt();
        
        switch(choose) {
            case 1:
                {
                    // Using for-each loop
                    for(int temp : arr) 
                    {
                        System.out.println(temp);
                    }
                }
                break;
                
            case 2:
                {
                    // Using for loop
                    for(int i = 0; i < arr.length; i++) 
                    {
                        System.out.println(arr[i]);
                    }
                }
                break;
                
            case 3:
                {
                    // Using while loop
                    int i = 0;
                    while(i < arr.length) 
                    {
                        System.out.println(arr[i]);
                        i++;
                    }
                }
                break;
                
            case 4:
                {
                    // Using do-while loop
                    int i = 0;
                    do 
                    {
                        System.out.println(arr[i]);
                        i++;
                    } while (i < arr.length);
                }
                break;
                
            default: 
                System.out.println("!!! Choose Correct Option");
        }
       
    }
}

/* Output 

[10, 20, 20, 10, 30, 10, 40]
Using which way you would like to fetch this array ?
1. For Each Loop
2. For Loop
3. While Loop
4. Do While Loop
Choice option: 2
10
20
20
10
30
10
40

*/

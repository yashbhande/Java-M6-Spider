import java.util.*;

class _2DArrayIteration_DiffrenetWays_Example {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        int arr[][] = {{10, 20}, {20, 10, 30}, {10, 40}};
        System.out.println(Arrays.deepToString(arr));
        
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
                    for(int temp[] : arr) 
                    {
                        for(int temp1 : temp) 
                        {
                            System.out.println(temp1);
                        }
                        System.out.println();
                    }
                }
                break;
                
            case 2:
                {
                    // Using for loop
                    for(int i = 0; i < arr.length; i++) 
                    {
                        for(int j = 0; j < arr[i].length; j++) 
                        {
                            System.out.println(arr[i][j]);
                        }
                        System.out.println();
                    }
                }
                break;
                
            case 3:
                {
                    // Using while loop
                    int i = 0;
                    while(i < arr.length) 
                    {
                        int j = 0;
                        while(j < arr[i].length) 
                        {
                            System.out.println(arr[i][j]);
                            j++;
                        }
                        i++;
                        System.out.println();
                    }
                }
                break;
                
            case 4:
                {
                    // Using do-while loop
                    int i = 0;
                    do 
                    {
                        int j = 0;
                        do 
                        {
                            System.out.println(arr[i][j]);
                            j++;
                        } while (j < arr[i].length);
                        i++;
                        System.out.println();
                    } while (i < arr.length);
                }
                break;
                
            default: 
                System.out.println("!!! Choose Correct Option");
        }
       
    }
}


import java.util.*;

class _3DArrayIteration_DiffrenetWays_Example {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        int arr[][][] = {{{10, 20}}, {{20, 10, 30}}, {{10, 40}}};
        System.out.println(Arrays.deepToString(arr));
        
        System.out.println("Using which way you would like to fecth this array ?");
        System.out.println("1. For Each Loop");
        System.out.println("2. For Loop");
        System.out.println("3. While Loop");
        System.out.println("4. Do While Loop");
        System.out.print("Choise option :");
        int choose=sc.nextInt();
        
        switch(choose)
        {
            case 1:
                {
                     // Using for-each loop
                    for(int temp[][] : arr) 
                    {
                        for(int temp1[] : temp) 
                        {
                            for(int temp2 : temp1) 
                            {
                                System.out.println(temp2);
                            }
                            System.out.println();
                        }
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
                            for(int k = 0; k < arr[i][j].length; k++) 
                            {
                                System.out.println(arr[i][j][k]);
                            }
                            System.out.println();
                        }
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
                            int k = 0;
                            while(k < arr[i][j].length) 
                            {
                                System.out.println(arr[i][j][k]);
                                k++;
                            }
                            j++;
                            System.out.println();
                        }
                        i++;
                    }
                }
                break;
                
            case 4:
                {
                    // Using do-while loop
                    int x = 0;
                    do 
                    {
                        int y = 0;
                        do 
                        {
                            int z = 0;
                            do 
                            {
                                System.out.println(arr[x][y][z]);
                                z++;
                            } while (z < arr[x][y].length);
                            y++;
                            System.out.println();
                        } while (y < arr[x].length);
                        x++;
                    } while (x < arr.length);
                }
                break;
                
                default: System.out.println("!!! Choose Correct Option");
        }
       
    }
}


/* Output :

[[[10, 20]], [[20, 10, 30]], [[10, 40]]]
Using which way you would like to fecth this array ?
1. For Each Loop
2. For Loop
3. While Loop
4. Do While Loop
Choise option :3
10
20

20
10
30

10
40

*/

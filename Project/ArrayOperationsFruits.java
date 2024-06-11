// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class ArrayOperationsFruits {
    static int arr[];

    // Method to store user input into an array
    public int[] Store(int size) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[size];
        this.arr = arr;
        
        // Loop to get elements from user input and store in array
        System.out.println("Enter " + size + " elements:");
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    // Method to print even numbers in the array
    public void Even(int arr[]) {
        System.out.print("Even Numbers: ");
        for(int even: arr) {
            if(even % 2 == 0)
                System.out.print(even + ", ");
        }
        System.out.println();
    }

    // Method to print odd numbers in the array
    public void Odd(int arr[]) {
        System.out.print("Odd Numbers: ");
        for(int odd: arr) {
            if(odd % 2 != 0)
                System.out.print(odd + ", ");
        }
        System.out.println();
    }

    // Method to print negative numbers in the array
    public void Negative(int arr[]) {
        System.out.print("Negative Numbers: ");
        for(int negative: arr) {
            if(negative < 0)
                System.out.print(negative + ", ");
        }
        System.out.println();
    }

    // Method to find a specific element in the array
    public void FindElement(int arr[], int find) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == find) {
                System.out.println("Element found: " + arr[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found.");
        }
    }

    public static void main(String[] args) {
        ArrayOperationsFruits obj = new ArrayOperationsFruits(); // Creating an object of the ArrayOperationsFruits class
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while(flag) {
            // Display menu options to the user
            System.out.println("1. Store Elements \n2. Find Element \n3. Find Even Numbers \n4. Find Odd Numbers \n5. Find Negative Numbers \n6. Exit");
            System.out.print("Choose Option: ");
            int choose = sc.nextInt();

            switch(choose) {
                case 1: {
                    // Store elements
                    System.out.print("How many elements you wanna store: ");
                    int size = sc.nextInt();
                    int[] arr = obj.Store(size);
                }
                break;

                case 2: {
                    // Find element
                    System.out.print("Number to find: ");
                    int find = sc.nextInt();
                    obj.FindElement(arr, find);
                }
                break;

                case 3: {
                    // Find even numbers
                    obj.Even(arr);
                }
                break;

                case 4: {
                    // Find odd numbers
                    obj.Odd(arr);
                }
                break;

                case 5: {
                    // Find negative numbers
                    obj.Negative(arr);
                }
                break;

                case 6: {
                    // Exit the program
                    System.out.println("Exit");
                    flag = false;
                    System.exit(0);
                }
                break;

                default: {
                    System.out.println("!!! Error: Choose Correct Option.");
                }
                break;
            } // Switch ends here
        }
    }
}


// 1. Store Elements 
// 2. Find Element 
// 3. Find Even Numbers 
// 4. Find Odd Numbers 
// 5. Find Negative Numbers 
// 6. Exit
// Choose Option: 1
// How many elements you wanna store: 5
// Enter 5 elements:
// 1
// 2
// 3
// 4
// -5

// 1. Store Elements 
// 2. Find Element 
// 3. Find Even Numbers 
// 4. Find Odd Numbers 
// 5. Find Negative Numbers 
// 6. Exit
// Choose Option: 2
// Number to find: 3
// Element found: 3

// 1. Store Elements 
// 2. Find Element 
// 3. Find Even Numbers 
// 4. Find Odd Numbers 
// 5. Find Negative Numbers 
// 6. Exit
// Choose Option: 3
// Even Numbers: 2, 4, 

// 1. Store Elements 
// 2. Find Element 
// 3. Find Even Numbers 
// 4. Find Odd Numbers 
// 5. Find Negative Numbers 
// 6. Exit
// Choose Option: 4
// Odd Numbers: 1, 3, -5, 

// 1. Store Elements 
// 2. Find Element 
// 3. Find Even Numbers 
// 4. Find Odd Numbers 
// 5. Find Negative Numbers 
// 6. Exit
// Choose Option: 5
// Negative Numbers: -5, 

// 1. Store Elements 
// 2. Find Element 
// 3. Find Even Numbers 
// 4. Find Odd Numbers 
// 5. Find Negative Numbers 
// 6. Exit
// Choose Option: 6
// Exit


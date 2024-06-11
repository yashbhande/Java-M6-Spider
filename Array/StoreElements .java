import java.util.*; // Importing the java.util package to use Scanner

class StoreElements 
{
    int arr[]; // Array to store elements
    static Scanner sc = new Scanner(System.in); // Scanner object for user input

    // Method to store elements in the array
    public void storeElements(int arr[]) 
  {
        this.arr = arr; // Assigning the passed array to the class's array
        
        // Loop through the array to get elements from user input
        System.out.println("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = sc.nextInt(); // Storing user input in the array
        }
  }

    // Method to display elements of the array
    public void displayElements() 
  {
        // Loop through the array and print each element
        System.out.println("Array elements are:");
        for (int i : arr) 
        {
            System.out.println(i); // Printing each element
        }
  }

    public static void main(String[] args) 
  {
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt(); // Reading the size of the array from user input

        int arr[] = new int[size]; // Creating an array with the given size

        StoreElements obj = new StoreElements(); // Creating an instance of StoreElements
        obj.storeElements(arr); // Storing elements in the array using the storeElements method
        obj.displayElements(); // Displaying the elements of the array using the displayElements method
  }
  
}// Class Close

//Here Array eleemnts are stored and Displayed
// Enter the size of the array: 3
// Enter the array elements:
// 1
// 2
// 3
// Array elements are:
// 1
// 2
// 3

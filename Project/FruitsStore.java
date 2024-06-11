import java.util.*;

class FruitsStore {
    String fruits[]; // Array to store fruits
    static Scanner sc = new Scanner(System.in);

    // Method to store fruits
    public void storeFruits(String[] fruits) {
        this.fruits = fruits; // Assign values in array

        // Loop to get fruits from user input and store in array
        System.out.println("Enter the fruits:");
        for (int i = 0; i < fruits.length; i++) {
            fruits[i] = sc.next();
        }

        System.out.println("Fruits stored successfully!\n");
    }

    // Method to display fruits
    public void displayFruits() {
        if (fruits == null || fruits.length == 0) {
            System.out.println("No fruits available. Please add fruits first.\n");
            return;
        }

        // Loop through the array and print each element
        System.out.println("Available Fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit); // Printing each element
        }
        System.out.println();
    }

    // Method to change fruits in Array
    public void changeFruits(String oldFruit, String newFruit) {
        if (fruits == null || fruits.length == 0) {
            System.out.println("No fruits available to replace. Please add fruits first.\n");
            return;
        }

        // Loop to find and replace specific fruit
        boolean found = false;
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals(oldFruit)) {
                fruits[i] = newFruit; // Replace old fruit with new fruit
                found = true;
            }
        }

        if (found) {
            System.out.println("Fruit replaced successfully!\n");
        } else {
            System.out.println("Fruit not found.\n");
        }
    }

    public static void main(String[] args) {
        FruitsStore obj = new FruitsStore(); // Instance of FruitStore class

        boolean flag = true; // Flag to control while loop and execution of switch block options
        while (flag) {
            // Displaying menu options
            System.out.println("Choose Options:");
            System.out.println("1. Store Fruits");
            System.out.println("2. Display Fruits");
            System.out.println("3. Change Fruits");
            System.out.println("4. Close Shop.");
            System.out.print("Enter your choice: ");
            int choose = sc.nextInt();

            System.out.println();
            switch (choose) {
                case 1: // Option to store elements
                    System.out.print("Enter the number of fruits to store: ");
                    int size = sc.nextInt(); // Read number of elements to add

                    String[] fruits = new String[size]; // Creating array with given size
                    obj.storeFruits(fruits); // Storing elements in this array
                    break;

                case 2: // Option to display fruits
                    obj.displayFruits(); // Display fruits
                    break;

                case 3: // Option to change fruits
                    if (obj.fruits == null || obj.fruits.length == 0) { // Check if fruits are already present
                        System.out.println("Error !!! Add fruits first.\n");
                    } else {
                        System.out.print("Enter the fruit to be replaced: ");
                        String oldFruit = sc.next(); // Enter fruit to be replaced
                        System.out.print("Enter the new fruit: ");
                        String newFruit = sc.next(); // Enter new fruit

                        obj.changeFruits(oldFruit, newFruit); // Pass the values to method
                    }
                    break;

                case 4: // Option to close shop
                    System.out.println("Shop Closed.");
                    flag = false; // Setting flag false to stop execution of While loop
                    System.exit(0); // Exiting the program
                    break;

                default: // Handle invalid input
                    System.out.println("Error !!! Enter correct option.\n");
                    break;
            } // Switch Case Ends Here
        } // While Ends Here
    } // Main Ends Here
} // Class Ends Here


// Choose Options:
// 1. Store Fruits
// 2. Display Fruits
// 3. Change Fruits
// 4. Close Shop.
// Enter your choice: 1

// Enter the number of fruits to store: 3
// Enter the fruits:
// Apple
// Banana
// Cherry
// Fruits stored successfully!

// Choose Options:
// 1. Store Fruits
// 2. Display Fruits
// 3. Change Fruits
// 4. Close Shop.
// Enter your choice: 2

// Available Fruits:
// Apple
// Banana
// Cherry

// Choose Options:
// 1. Store Fruits
// 2. Display Fruits
// 3. Change Fruits
// 4. Close Shop.
// Enter your choice: 3

// Enter the fruit to be replaced: Banana
// Enter the new fruit: Mango
// Fruit replaced successfully!

// Choose Options:
// 1. Store Fruits
// 2. Display Fruits
// 3. Change Fruits
// 4. Close Shop.
// Enter your choice: 2

// Available Fruits:
// Apple
// Mango
// Cherry

// Choose Options:
// 1. Store Fruits
// 2. Display Fruits
// 3. Change Fruits
// 4. Close Shop.
// Enter your choice: 4

// Shop Closed.

        // Using ArrayList to store names because it allows dynamic resizing,
        // which means we can add as many names as the user inputs without 
        // needing to know the number in advance. ArrayList also provides 
        // convenient methods for adding and accessing elements.
import java.util.*; 
class ArrayList_ConvertJavaArray_toList 
{
    public static void main(String[] args) 
  {        
        Scanner sc = new Scanner(System.in); // Initializing Scanner to read input from the user
        ArrayList<String> languages = new ArrayList<>(); // Initializing an ArrayList to store names

        // Asking the user how many names they want to enter
        System.out.println("How many names do you wanna print?");
        int howMany = sc.nextInt(); // Reading the number of names to be entered

        // Loop to read the specified number of names
        for (int i = 0; i < howMany; i++) {
            System.out.println("Enter Name:"); // Prompting the user to enter a name
            String k = sc.next(); // Reading the next input from the user
            languages.add(k); // Adding the input to the ArrayList
        }

        // Printing the list of names entered by the user
        System.out.println(languages);
    }
}

// How many names you wanna print?
// 2
// Enter Name:
// C++
// Enter Name:
// JavaScript
// [C++, JavaScript]

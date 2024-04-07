// This program prints first 100 even numbers recursively
// 2 4 6 8 10 12..................100

class EvenNumbers_1_100 {
    static int number = 1; // Initialize the number variable to start checking from 1

    public static void main(String[] args) {
        evenNumbers(); // Calling method
    }

    
    public static void evenNumbers() {
        // Check if the number is even and print
        if (number % 2 == 0) {
            System.out.print(number + " "); // Print the even number
        }
        
        // Base case: If number reaches 100, stop recursion
        if (number >= 100) {
            return;
        }

        number++; // Increment number for next iteration
        evenNumbers(); // Recursive call 
    }
}

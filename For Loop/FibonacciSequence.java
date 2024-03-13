//0 1 2 3 5 8 13 21 34
// + + + + + +  +  +


// FibonacciSequence
class FibonacciSequence {
    public static void main(String[] args) {
        int previous = 0; // Initialize the first number of the sequence
        int current = 1; // Initialize the second number of the sequence
        
        System.out.print(previous + " "); // Print the first number
        System.out.print(current + " "); // Print the second number
        
        // Loop until the current number exceeds 30
        for (int i = 0; current < 30; i++) {
            int next = previous + current; // Calculate the next number in the sequence
            System.out.print(next + " "); // Print the next number
            previous = current; // Update the first number
            current = next; // Update the second number
        }
    }
}

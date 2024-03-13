//0 1 2 3 5 8 13 21 34
// + + + + + +  +  +

// FibonacciSequence
class FibonacciSequence {
    public static void main(String[] args) {
        int previous = 0; // Initialize the first number of the sequence
        int current = 1; // Initialize the second number of the sequence
        int next; // Variable to store the next number in the sequence
        
        // Loop until the current number exceeds 30
        while (current < 30) {
            next = previous + current; // Calculate the next number in the sequence
            previous = current; // Update the first number
            current = next; // Update the second number
            System.out.println(current); // Print the current number
        }
    }
}

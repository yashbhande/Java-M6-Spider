class MultiplesOfThreeTable {
    public static void main(String[] args) {
      
        // Initialize a variable num to 1 to start counting
        int num = 1;
        
        // Start a do-while loop to iterate through the numbers
        do {
            // Multiply the current value of num by 3 to get the multiples of 3
            System.out.println(num * 3);
            // Increment num by 1 to move to the next number
            num++;
        // Continue the loop while num is less than or equal to 10
        } while(num <= 10);
    }
}

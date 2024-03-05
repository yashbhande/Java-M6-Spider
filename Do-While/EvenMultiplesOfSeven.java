//Print only Even Numbers in the Table of 7

class EvenMultiplesOfSeven {
    public static void main(String[] args) {
        
        int num = 1, a = 0;
      
        do {
            // Multiply the current value of num by 7 to get the multiples of 7
            a = num * 7;
            
            // Check if the result (a) is even
            if (a % 2 == 0) {
                // If it's even, print it
                System.out.println(a); // Output the even multiple of 7
            }
            
            // Increment num by 1 to move to the next number
            num++;
        // Continue the loop while num is less than or equal to 10
        } while (num <= 10); // Looping until we reach 10
    }
}

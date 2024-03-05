//// Print only Odd Numbers in the Table of 7

class OddMultiplesOfSeven {
    public static void main(String[] args) {
        int num = 1, a = 0;
        
        do {
            // Multiply the current value of num by 7 to get the multiples of 7
            a = num * 7;
            
            // Check if the result (a) is odd
            if (a % 2 != 0) {
                // If it's odd, print it
                System.out.println(a); // Output the odd multiple of 7
            }
            
            num++;
        } while (num <= 10);
    }
}

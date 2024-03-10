// Program to print all even multiples of 3 and 5 within the range of 200
// Conditions:
// 1. Print all even multiples of 3 and 5 within the range of 200.
// 2. Use two separate loops for each multiplication table (one for 3 and one for 5).
// 3. Check if the current multiple is even before printing.

class EvenMultiplesOfThreeAndFive {
    public static void main(String[] args) {
      
        // Initialize variables for the first multiplication table (base number 5)
        int currentMultiplierTable5 = 1;  // Represents the current multiplier for the table of 5
        int baseNumberTable5 = 5;         // The base number for the first multiplication table

        // Loop for multiples of 5
        do {
            // Calculate the current multiple for the table of 5
            int currentMultipleTable5 = currentMultiplierTable5 * baseNumberTable5;
          //                            1*5, 2*5, 3*5

            // Check if the current multiple is even
            if (currentMultipleTable5 % 2 == 0) {
                // Print the even multiple of the table of 5
                System.out.println(currentMultipleTable5);
            }

            // Move to the next multiplier in the table of 5
            currentMultiplierTable5++;

        } while (currentMultiplierTable5 <= 200);

        System.out.println(); // Print an empty line for separation

        // Initialize variables for the second multiplication table (base number 3)
        int currentMultiplierTable3 = 1;  // Represents the current multiplier for the table of 3
        int baseNumberTable3 = 3;         // The base number for the second multiplication table

        // Loop for multiples of 3
        do {
            // Calculate the current multiple for the table of 3
            int currentMultipleTable3 = currentMultiplierTable3 * baseNumberTable3;

            // Check if the current multiple is even
            if (currentMultipleTable3 % 2 == 0) {
                // Print the even multiple of the table of 3
                System.out.println(currentMultipleTable3);
            }

            // Move to the next multiplier in the table of 3
            currentMultiplierTable3++;

        } while (currentMultiplierTable3 <= 200);
    }
}

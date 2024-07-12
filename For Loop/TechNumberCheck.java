
//TechNumberCheck
class TechNumberCheck {
    public static void main(String[] args) {
        
         int num = 2025;
        int org = num;
        // Variable to count the number of digits
        int count = 0;

        // Counting the number of digits in the number
        while (num > 0) {
            count++; // 
            num /= 10; // 
        }
      
        // Printing the count of digits
        System.out.println("Number of digits: " + count);

        // Checking if the count of digits is even
        if (count % 2 == 0) {
            // Variable to store the divisor for splitting the number
            int div = 1;

            // Finding the divisor for splitting the number into two halves
            for (int i = 1; i <= count / 2; i++) {
                div = div * 10;
            }
            // Printing the divisor
            System.out.println("Divisor: " + div);

            // Splitting the number into two halves
            int firstHalf = org / div; // Extracting the first half of the number
            int secondHalf = org % div; // Extracting the second half of the number
            int result = firstHalf + secondHalf; // Adding the two halves

            // Printing the result of adding the two halves
            System.out.println("Result after adding two halves: " + result);

            // Checking if the number is a Tech Number
            int sqr = result * result; // Calculating the square of the result
            if (sqr == org) {
                // If the square of the result equals the original number, it is a Tech Number
                System.out.println("Yes, it is a Tech Number");
            } else {
                // If not, it is not a Tech Number
                System.out.println("Not a Tech Number");
            }

        } else {
            // If the count of digits is odd, the number is not a Tech Number
            System.out.println("The number doesn't have an even digit count");
        }
    }
}

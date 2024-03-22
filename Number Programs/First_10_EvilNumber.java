/* ------------------- Approach-------------------

 1. Convert Number into Binary;    {rem=n%2; binary=binary+(rem*b); n=n/2; b=b*10;}
 2. Count number of '1' in binary number.
 3. If count is Even (then it's an evil number)
 4. If count is not even (then not evil)
*/


public class First_10_EvilNumber {
    public static void main(String[] args) {
        int count = 0; // Count of evil numbers found
        int num = 1; // Starting from 1
        
        while (count < 10) { // Loop until we find 10 evil numbers
            int binary = 0; // to store binary number
            int b = 1; // to multiply rem with (rem*b)
            int counter = 0; // to count no. of 1 in binary
            
            // Digit to Binary Conversion
            int n = num; // Number to check
            while (n > 0) {
                int rem = n % 2;
                binary = binary + (rem * b);
                n = n / 2;
                b = b * 10;
            }
            
            // Count no of '1' in that Binary Number
            int tempBinary = binary;
            while (tempBinary > 0) {
                int rem = tempBinary % 10;
                if (rem == 1) {
                    counter++;
                }
                tempBinary = tempBinary / 10;
            }
            
            // If Counter is divisible by 2 then print evil
            if (counter % 2 == 0) {
                System.out.println(num + " is an Evil Number");
                count++;
            }
            
            num++; // Move to the next number
        }
    }
}

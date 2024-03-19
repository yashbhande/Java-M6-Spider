/*
Take Input Number:positive
Iterate Until Single Digit or Known Cycle:run While until number is not a single digit or the sum of squares of its digits continue the iteration process.
  Extract each digit from the number.
  Square each digit.
Sum the squares of the digits.
  If the sum is a single digit, proceed to the next step.
  If the sum is not a single digit, repeat steps 3-4 with the sum as the new number.
If the final sum is 1, the original number is a happy number.
If the final sum is part of a known cycle (e.g., 4, 16, 37, 58, 89, 145, 42, 20), then it's not a happy number.
If the final sum is between 2 and 9 (inclusive), it's not a happy number.
*/
//13 is an happy number

class HappyNumber {
    public static void main(String[] args) {
        int a=231; // Initial number to check
        int sum=0; // Variable to store the sum of squares of digits
        
        // Loop until 'a' becomes a single digit and 'sum' is not greater than 9
        while(a>9 || sum>9)
        {
            // If 'a' becomes 0, update 'a' to 'sum' and reset 'sum' to 0
            if(a==0)
            {
                a=sum;
                sum=0;
            }
            
            // Calculate the sum of squares of digits of 'a'
            while(a>0)
            {
                int rem=a%10; // Extract the last digit of 'a'
                sum=(rem*rem)+sum; // Square the digit and add to 'sum'
                a=a/10; // Remove the last digit from 'a'
            }
        }
        
        // Check if 'sum' or 'a' is equal to 1, if yes, then it's a happy number
        if(sum==1 || a==1)
        {
            System.out.println("Happy Number");
        }
        else
        {
            System.out.println("Not happy number");
        }
    }
}

public class PalindromeNumber {
    public static void main(String[] args) {
        // Create an instance of Solution and check if 121 is a palindrome
        Solution sol = new Solution();
        System.out.println(sol.isPalindrome(121)); // Output: true
    }
}

class Solution {
    /**
     * Checks if the given integer is a palindrome.
     * @param x The integer to check
     * @return true if palindrome, false otherwise
     */
    public boolean isPalindrome(int x) {
        if (x == 0) return true; // 0 is a palindrome

        int temp = x, rev = 0;
        
        // Reverse the number
        while (temp != 0) {
            int rem = temp % 10;
            temp /= 10;
            rev = rev * 10 + rem;
        }
        
        // Return true if original and reversed numbers are equal
        return x == rev;
    }
}

//palindromic number is a number (such as 16461) that remains the same when its digits are reversed.
// 1. Reverse Digit , 2. Compare reversed value with original value


class PalindromeNumber {
    public static void main(String[] args) {
        int num=12621;
        int duplicateNumber=num;

        int reverse=0;
        while(num!=0)
        {
            reverse=reverse*10 + num%10;  // 0+1234%10=4    40+3=43     430+2=432        4320+1=4321
            num/=10;    //1234/10=123   123/10=12   12/10=1     1/10=0
        }
        
        if(duplicateNumber==reverse)
        {
            System.out.println(duplicateNumber+" is palindrome.");
        }
        else{
            System.out.println(duplicateNumber+" is not palindrome.");       
        }
    }
}

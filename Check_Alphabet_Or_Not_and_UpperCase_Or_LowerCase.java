/* This program checks whether a character is an alphabet or not and whether it is in upper case or lower case.
1) Check Alphabet or not.
2) Check Lower or Upper Case
*/


class Check_Alphabet_Or_Not_and_UpperCase_Or_LowerCase {
    public static void main(String[] args) {
        // Test character
        char a = 'A';

        // Checking if the character is an alphabet and its case
        String b = (a >= 65 && a <= 90 || a >= 96 && a <= 122) ? ( // Check if it's an alphabet based on ASCII range
                (a >= 65 && a <= 90) ? ("Is UpperCase") : ("Is lowerCase") // Check if it's upper case or lower case
        ) : ("Not an Alphabet"); // If not in the range of alphabets, then it's not an alphabet

        // Output the result
        System.out.println(b); // Output: Is UpperCase
    }
}


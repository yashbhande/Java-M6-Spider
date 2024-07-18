//Enter a character: x
//Next five characters: y z a b c

//Enter a character: B
//Next five characters: C D E F G

import java.util.Scanner;

public class ContinuousElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char input = scanner.next().charAt(0);

        printNextFiveChars(input);
    }

    public static void printNextFiveChars(char input) {
        System.out.print("Next five characters: ");
        for (int i = 1; i <= 5; i++) {
            char nextChar = (char) (input + i);
            if (Character.isLowerCase(input)) {
                if (nextChar > 'z') {
                    nextChar = (char) (nextChar - 26);
                }
            } else if (Character.isUpperCase(input)) {
                if (nextChar > 'Z') {
                    nextChar = (char) (nextChar - 26);
                }
            }
            System.out.print(nextChar + " ");
        }
        System.out.println();
}
}

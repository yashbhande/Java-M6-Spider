// Define a class named Print_Operation_On_Numbers
class Print_Operation_On_Numbers {

    // Main method declaration.
    public static void main(String[] pon) {

        // Variable declaration and initialization
        int a = 10, b = 20, c = 30;

        // Printing the result of complex arithmetic operation
        System.out.println(++a - --a + ++b - --b + c + a + a + --c + a + --b + --c);
        System.out.println(c + c + c++ + c + b - --b + a - b + c + --b + ++c);

        // Expected output:
        // First line: 11 - 11 + 21 - 19 + 30 + 11 + 11 + 28 + 11 + 18 + 27 = 158
        // Second line: 30 + 30 + 30 + 31 + 20 - 19 + 11 - 19 + 30 + 18 + 32 = 293

    }
}

/*
Output

Compile Time= Success

Run Time= Success
*/

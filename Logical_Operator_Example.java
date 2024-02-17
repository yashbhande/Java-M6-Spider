// Define a class named Logical_Operator_Example
class Logical_Operator_Example {
    // Main method
    public static void main(String[] args) {
        // Print the result of logical operations and provide expected output in comments
        System.out.println(true && true || true && true || true && false); // Expected output: true
        System.out.println(false && false || true && true || false && false); // Expected output: true
        System.out.println(true && false || true && false || true && true); // Expected output: true
        System.out.println(false && false || false && false || true && false); // Expected output: false

        // Define boolean variables
        boolean a = true, b = true, c = true, e = true, f = true, g = true;

        // Print the result of another logical operation
        System.out.println(a && b || c && e || f && g);
    }
}

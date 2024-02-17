// Define a class named Ternary_Two_Operands_Changed
class Ternary_Two_Operands_Changed {
    // Main method
    public static void main(String[] args) {
        
        // Declare and initialize two integer variables
        int a = 10, b = 20;
        
        // Using ternary operator to determine which of the two operands is greatest
        // If a is greater than b, assign "A is Greatest" to c, otherwise assign "B is Greatest" to c
       
      String c = (a > b) ? ("A is Greatest") : ("B is Greatest");
        
        // Print the result, which will be "B is Greatest" as b is greater than a
        System.out.println(c);
    }
}

// Define a class named Ternary_Three_Number_Comparison
class Ternary_Three_Number_Comparison {
    // Main method
    public static void main(String[] args) {
        
        // Declare and initialize three integer variables
        int a = 30, b = 20, c = 30;
        
        // Using nested ternary operator to determine the greatest among three numbers
        // If a is greater than b, then:
        //    If a is also greater than c, then assign "A is Greatest" to d, otherwise assign "B is greatest" to d
        // Otherwise, if b is greater than c, assign "B is greatest" to d, otherwise assign "C is greatest" to d
      
        String d = (a > b) ? ((a > c) ? ("A is Greatest") : ("B is greatest")) : ((b > c) ? ("B is greatest") : ("C is greatest"));
        
        // Print the result, which will be "A is Greatest" as a is greater than both b and c
        System.out.println(d);
    }
}

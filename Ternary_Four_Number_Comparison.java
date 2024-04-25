// Define a class named Ternary_Four_Number_Comparison
class Ternary_Four_Number_Comparison {
    // Main method declaration
    public static void main(String[] args) {
        // Define four variables representing numbers

        int num1 = 10, num2 = 20, num3 = 30, num4 = 40;
        
        // Perform nested ternary operations to find the greatest number
        String result = 
            (num1 > num2) ? // If num1 is greater than num2
                ((num1 > num3) ? // If num1 is also greater than num3
                    ((num1 > num4) ? ("A is greatest") : ("D is greatest")) // If num1 is greater than num4, then A is greatest; otherwise, D is greatest
                    : ((num3 > num4) ? ("C is greatest") : ("D is greatest"))) // If num1 is not greater than num4, then if num3 is greater than num4, then C is greatest; otherwise, D is greatest
                : ((num2 > num3) ? // If num1 is not greater than num2
                    ((num2 > num4) ? ("B is greatest") : ("D is greatest")) // If num2 is also greater than num4, then B is greatest; otherwise, D is greatest
                    : ((num3 > num4) ? ("C is greatest") : ("D is greatest"))); // If num2 is not greater than num4, then if num3 is greater than num4, then C is greatest; otherwise, D is greatest
        
        // Print the result
        System.out.println(result);
    }
}

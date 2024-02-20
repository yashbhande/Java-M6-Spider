// This program evaluates a given temperature and assigns a corresponding label based on predefined temperature ranges.

public class Temperature_Labeler_TernaryOp{
    public static void main(String[] args) {
      
        // Test temperature
        int temp = 3;  
        //In celsious

        // Evaluate the temperature and assign a label
        String result = (temp >= 41 && temp <= 50) ? ("Very Hot") :   // Check if the temperature is between 41 and 50
                        (temp >= 31 && temp <= 40) ? ("Summer") :    // Check if the temperature is between 31 and 40
                        (temp >= 21 && temp <= 30) ? ("Moderate") :  // Check if the temperature is between 21 and 30
                        (temp >= 11 && temp <= 20) ? ("Cold") :      // Check if the temperature is between 11 and 20
                        (temp >= 0 && temp <= 10) ? ("Very Cold") :  // Check if the temperature is between 0 and 10
                        ("Enter Correct Temperature");               // Default message if temperature is outside the specified ranges

        // Output the result
        System.out.println(result); // Output: Very Cold
    }
}

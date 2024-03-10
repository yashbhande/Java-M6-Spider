// Program to check if a given temperature is suitable for house construction
// Conditions:
// 1. The temperature should be above 25 degrees Celsius.
// 2. The temperature should be a multiple of both 5 and 7.

class HouseConstructionTemperature {
    public static void main(String[] args) {
        int temperature = 35; // Placeholder temperature value (should be taken as input from the user)

        // Check if the temperature is suitable for house construction
        if (temperature > 25) {
            // Check if the temperature is a multiple of both 5 and 7
            if (temperature % 5 == 0 && temperature % 7 == 0) {
                // If the temperature meets the criteria, it's suitable for house construction
                // The numbers 35, 70, 105, 140, 175 satisfy this condition
                System.out.println("Suitable temperature for house construction.");
            } else {
                // If the temperature doesn't meet the criteria, it's not suitable for house construction
                System.out.println("Not suitable temperature for house construction.");
            }
        } else {
            // If the temperature is not above 25, it's not suitable for house construction
            System.out.println("Not suitable temperature for house construction.");
        }
    }
}

class EncapsulationCar {
    private String model; // Private variable to store the car model
    private int year; // Private variable to store the manufacturing year
    
    public String getModel() { return model; } // Getter method for retrieving the car model
    public int getYear() { return year; }  // Getter method for retrieving the manufacturing year
    
    public void setYear(int year) { this.year = year; }
    public void setModel(String model) { this.model = model; }
    
    public void displayInfo() // Method to display information about the car
    {
        System.out.println("Car Model: " + model);
        System.out.println("Year of Manufacture: " + year);
    }
}

public class EncapsulationCarExample {
    public static void main(String[] args) {
        EncapsulationCar myCar = new EncapsulationCar(); // Creating an object of EncapsulationCar class
        
        myCar.setModel("Toyota Camry"); // Setting the car model
        myCar.setYear(2020); // Setting the manufacturing year
        
        // Displaying information about the car using getter methods
        System.out.println("Car Model: " + myCar.getModel());
        System.out.println("Year of Manufacture: " + myCar.getYear());

        //myCar.displayInfo(); // -----> Optional (to invoke displayInfo method)
    }
}

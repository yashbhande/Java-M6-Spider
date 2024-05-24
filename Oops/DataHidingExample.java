class Rectangle  // Represents a rectangle and demonstrates data hiding 
{
    private double length;  // Private variable for hiding data
    private double breadth; // Private variable for hiding data
    
    public double getLength()   { return length;  }     // Getter method to extract length data
    public double getBreadth()  { return breadth; }    // Getter method to extract breadth data
    
    public void setLength(double a) { length = a; }     // Setter method to set length data
    public void setBreadth(double b) { breadth = b; }   // Setter method to set breadth data
    
    public double Area() { return length * breadth; }   // Method to calculate and return area
}


public class DataHidingExample  // Main class demonstrating data hiding
{
    public static void main(String[] args)
    {
        Rectangle rect = new Rectangle();  // Creating an object of Rectangle class
        rect.setLength(10);   // Setting length data using setLength
        rect.setBreadth(20);  // Setting breadth data using setBreadth
        
        System.out.println("Length is : " + rect.getLength());    // Extracting length data using getLength
        System.out.println("Breadth is : " + rect.getBreadth());  // Extracting breadth data using getBreadth
        
        System.out.println("Area : " + rect.Area());  // Calculating and printing the area of the rectangle
    }
}

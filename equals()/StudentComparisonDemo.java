// This program demonstrates the usage of the equals() method 
// in Java by comparing two ComparableStudent objects based on their attributes.

// Define the ComparableStudent class
class ComparableStudent 
{
    // Attributes of the ComparableStudent class
    String sname; // Student name
    String place; // Place of origin
    String branch; // Branch of study
    int yop; // Year of passing

    // Constructor to initialize ComparableStudent object
    ComparableStudent(String sname, String place, String branch, int yop) 
    {
        this.sname = sname;
        this.place = place;
        this.branch = branch;
        this.yop = yop;
    }

    // Override the equals() method to compare two ComparableStudent objects
    public boolean equals(Object obj) 
    {
        // Casting the Object to ComparableStudent class
        ComparableStudent obj2 = (ComparableStudent)obj;
        // Comparing attributes for equality
        if ((this.sname.equals(obj2.sname)) &&
            (this.place.equals(obj2.place)) &&
            (this.branch.equals(obj2.branch)) &&
            (this.yop == obj2.yop)) 
          {
            return true; // Return true if all attributes are equal
          } 
        else 
          {
            return false; // Return false otherwise
          }   
    }
}

// Define the StudentComparisonDemo class to demonstrate ComparableStudent class functionality
class StudentComparisonDemo 
{
    public static void main(String[] args) 
    {
        // Create two ComparableStudent objects with similar attributes
        ComparableStudent obj1 = new ComparableStudent("Yash1", "Barshi", "MCA", 2024);
        ComparableStudent obj2 = new ComparableStudent("Yash", "Barshi", "MCA", 2024);

        // Print the result of comparing the two ComparableStudent objects
        System.out.println(obj1.equals(obj2));
    }
}

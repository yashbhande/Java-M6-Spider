// This program demonstrates single inheritance in Java

// Base class representing an Employee
class Employee {
    float salary = 50000; // Non-static variable, requires object creation to use
}

// Derived class inheriting from Employee, representing a Programmer
class Single_Inheritance extends Employee {
    float bonus = 2000; // Non-static variable, requires object creation to use

    public static void main(String[] args) {
        // Create an object of Programmer class
        Single_Inheritance obj = new Single_Inheritance();

        // Access and print the salary and bonus of the Programmer
        System.out.println("Salary: " + obj.salary);  
        System.out.println("Bonus: " + obj.bonus);
    }
}

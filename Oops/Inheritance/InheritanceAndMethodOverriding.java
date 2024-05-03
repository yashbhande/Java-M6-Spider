/******* Output *******
Hello from Cat Class
Hello from Animal Class
Hello from Dog Class
Hello from Main Class
Barking...
Eating....
Mewww...
*/

class Cat // Represents a cat (Parent class)
{
    static { System.out.println("Hello from Cat Class"); } // Static block for Cat class initialization
    void cat() { System.out.println("Mewww..."); } // Method for cat sound
}

class Animal extends Cat // Represents an animal (Child class inheriting from Cat)
{
    static { System.out.println("Hello from Animal Class"); } // Static block for Animal class initialization
    void eat() { System.out.println("Eating...."); } // Method to eat
}

class Dog extends Animal  // Represents a dog (Grandchild class inheriting from Animal)
{
    static { System.out.println("Hello from Dog Class"); } // Static block for Dog class initialization
    void bark() { System.out.println("Barking..."); } // Method to bark
}

public class InheritanceAndMethodOverriding extends Dog // Main class extending Dog class
{
    static { System.out.println("Hello from Main Class"); } // Static block for Main class initialization

    public static void main(String[] args) 
    {
        InheritanceAndMethodOverriding h = new InheritanceAndMethodOverriding(); // Creating an object of InheritanceAndMethodOverriding
        h.bark(); // Calling bark method from Dog class
        h.eat(); // Calling eat method from Animal class
        h.cat(); // Calling cat method from Cat class
    }
}

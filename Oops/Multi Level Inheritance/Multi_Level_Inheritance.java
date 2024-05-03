class Animal // Parent class representing an animal
{
    void eat() { System.out.println("Eating..."); } 
}

class Dog extends Animal // Child class inheriting from Animal
{
    void bark() { System.out.println("Barking...."); } 
}

class Puppy extends Dog // Grandchild class inheriting from Dog
{
    void sleeping() { System.out.println("Sleeping..."); } 

public class Multi_Level_Inheritance extends Puppy // Main class inheriting from Puppy
{
    public static void main(String[] args)
    {
        Multi_Level_Inheritance obj = new Multi_Level_Inheritance(); // Creating an object of Multi_Level_Inheritance
        
        obj.sleeping(); // Calling sleeping method of Puppy
        obj.bark(); // Calling bark method of Dog
        obj.eat(); // Calling eat method of Animal
    }
}

class Dog extends Animal        //Sub Class --------> Parent is Animal, Cat
{
    static {
        System.out.println("Hello from Dog Class");
    }
    void bark()
    {
        System.out.println("Barking...");
    }
}



class Cat       // Parent Class
{
    static {
        System.out.println("Hello from CAt Class");
    }
    void cat()
    {
        System.out.println("Mewww...");
    }
}


class Animal extends Cat        //Sub Class --------> Parent is Cat
{
    static {
        System.out.println("Hello from Animal Class");
    }
    void eat()
    {
        System.out.println("Eating....");
    }
}



public class  InheritanceAndMethodOverriding extends Dog    // --------> Parent is Dog, Animal, Cat
{
    static {
        System.out.println("Hello from Main Class");
    }
    public static void main(String[] args)
    {
        // Dog d=new Dog();
        // d.bark();
        
        InheritanceAndMethodOverriding h=new InheritanceAndMethodOverriding();
        h.bark();
        h.eat();
        h.cat();
    }
}

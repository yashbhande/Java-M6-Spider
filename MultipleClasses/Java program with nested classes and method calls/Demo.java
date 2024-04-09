/*
short hints for what the program will do:

It will generate 4 class files: Demo.class, OuterDemo.class, OuterDemo$InnerDemo.class, and Demo1.class.
It will execute the Demo class.
After executing Demo, it will call the main method of OuterDemo.
After executing OuterDemo, it will call the m1() method of the InnerDemo class within OuterDemo.
After executing the m1() method, it will call the main method of the InnerDemo class within OuterDemo.
Finally, it will call the main method of the Demo1 class.
*/



public class Demo {
    public static void main(String[] args) {
        System.out.println("This is Class main");
        
        // Calling the main method of OuterDemo class
        OuterDemo.main(args);
        
        // Calling the static method m1() of InnerDemo class
        OuterDemo.InnerDemo.m1();
        
        // Calling the main method of InnerDemo class
        OuterDemo.InnerDemo.main(args);
        
        // Calling the main method of Demo1 class
        Demo1.main(args);
    }
}

class OuterDemo {
    public static void main(String[] args) {
        System.out.println("OuterDemo");
    }
    
    // InnerDemo class declaration inside OuterDemo class
    static class InnerDemo {
        // Main method of InnerDemo class
        public static void main(String[] args) {
            System.out.println("InnerDemo");
        }
        
        // Static method m1() of InnerDemo class
        public static void m1() {
            System.out.println("Hello from m1");
        }
    }
}

class Demo1 {
    public static void main(String[] args) {
        System.out.println("Outer Demo1");
    }
}

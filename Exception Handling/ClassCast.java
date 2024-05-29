class Parent {
    static int b = 20;
}

class Child extends Parent {
    static int a = 10;
}

class ClassCast 
{
    public static void main(String[] args) 
  {
        
        try
        {
            Parent obj2 = new Parent(); // Creating an instance of Parent
            Child obj = (Child) obj2;   // Attempting to cast Parent to Child (will cause ClassCastException)
        } 
        catch (Exception e) 
        {
            System.out.println("Error handled"); // Handling the ClassCastException
        }
        
    }
}

//In this program we get error because trying to access non-static value without declearing object 
//So we get NullPointerError , to solve this error we create Object of that Class in Catch Block

public class HandleNullPointerError {
    // Non-static variable
    int number = 10;

    public static void main(String[] args) {
      
        // Create a HandleNullPointerError reference but do not initialize it
        HandleNullPointerError demo = null;
        
        try {
            System.out.println(demo.number);  //will get NullPointer error if not handled.
        } catch (Exception e) {
            // Handle the exception by initializing the demo object
            demo = new HandleNullPointerError();
        }

        // Print the value of the non-static variable 'number' after handling the exception
        System.out.println(demo.number);
    }
}

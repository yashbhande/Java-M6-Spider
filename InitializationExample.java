class InitializationExample {
    static HelperClass helperVar;

    static 
    {
        try 
        {
            System.out.println("Static block start");

            // Uncomment the following line to trigger an ArithmeticException
            // int result = 10 / 0;

            helperVar = new HelperClass();
            System.out.println(helperVar);

            // This line will cause an ArithmeticException
            System.out.println(10 / 0);
        } 
        catch (Exception e) 
          {
            System.out.println("Exception caught in static block");
          }

        InitializationExample mainObjVar = new InitializationExample();
        mainObjVar.main(new String[]{});
        mainObjVar.printMessage();
    } //Static block close

    public void printMessage() 
    {
        System.out.println("Instance method called");
    }

    public static void main(String[] args) 
    {
        System.out.println("Main method start");
        System.out.println(helperVar);
    }
} //InitializationExample Close

class HelperClass 
{
    public HelperClass() 
    {
        System.out.println("HelperClass constructor called");
    }
}

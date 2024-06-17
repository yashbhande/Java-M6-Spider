class OwnLengthMethod
{
    static String a = "Hello"; // Static string variable initialized to "Hello"
    
    public static void main(String[] args) 
    {
        int length = userLength(); // Call method to get length and store it inside length
        System.out.println(length); // Print the length
    }
    public static int userLength()   //user defined method to find the length
  {
        int count = 0;
        // Loop through string until exception is caught
        for (int i = 0; ; i++) 
        {
            try 
              {
                a.charAt(i); // Access character at index i
                count++;     // Increment count if no exception
              } catch (StringIndexOutOfBoundsException e) 
              {
                break; // Exit loop on exception
              }
        }
        return count; // Return the length of the string
    }
}

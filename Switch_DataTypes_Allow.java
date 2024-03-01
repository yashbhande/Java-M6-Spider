// To check the which data types allowed within the switch statement.
 


class Switch_DataTypes_Allow {
  public static void main(String[] args) {

    // ------------ Allowed data types: --------------

    // Declare a byte variable and assign a value within its valid range (-128 to 127)
    byte byteValue = 127;
    switch (byteValue) {
      // If the value matches the case statement (127 in this case)
      case 127:
        System.out.println("Byte is allowed");
        break;
      // If the value doesn't match any case, this default case executes
      default:
        System.out.println("Not Valid");
    }

    // Similar logic applies to the following statements for int, short, char, and String

    int integerValue = 10;
    switch (integerValue) {
      case 10:
        System.out.println("Integer is allowed");
        break;
      default:
        System.out.println("Not Valid");
    }

    short shortValue = 120;
    switch (shortValue) {
      case 120:
        System.out.println("Short is allowed");
        break;
      default:
        System.out.println("Not Valid");
    }

    char characterValue = 'a';
    switch (characterValue) {
      case 'a':
        System.out.println("Char is allowed");
        break;
      default:
        System.out.println("Not Valid");
    }

    String stringValue = "Yash";
    switch (stringValue) {
      case "Yash":
        System.out.println("String is allowed");
        break;
      default:
        System.out.println("Not Valid");
    }


    // ------------ Unsupported data types: --------------

    // Declare variables with unsupported data types and comment out the switch statements
    // as they are not allowed in Java

    float floatValue = 22.22f;
    // Commented out as float is not allowed in switch
    /* switch (floatValue) {
      case 22.22f:
        System.out.println("Float is allowed");
        break;
      default:
        System.out.println("Not Valid");
    } */

    long longValue = 201l;
    // Commented out as long is not allowed in switch
    /* switch (longValue) {
      case 201l:
        System.out.println("Long is allowed");
        break;
      default:
        System.out.println("Not Valid");
    } */

    double doubleValue = 33.3d;
    // Commented out as double is not allowed in switch
    /* switch (doubleValue) {
      case 33.3d:
        System.out.println("Double is allowed");
        break;
      default:
        System.out.println("Not Valid");
    } */

    boolean booleanValue = true;
    // Commented out as boolean is not allowed in switch
    /* switch (booleanValue) {
      case true:
        System.out.println("Boolean is allowed");
        break;
      default:
        System.out.println("Not Valid");
    } */

    // Print a list of supported and unsupported data types for clarity
    System.out.println();
    System.out.println("Supported Data Types: Byte, Int, Short, Char, String");
    System.out.println("Unsupported Data Types: Float, Long, Double, Boolean");
  }
}

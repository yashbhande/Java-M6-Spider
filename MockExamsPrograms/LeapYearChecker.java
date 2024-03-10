// year%4==0 && year%100!=0 || year%400==0

// Class to check if a year is a leap year or not
class LeapYearChecker {
    public static void main(String[] args) {
      
        int year = 2024; // Year to be checked
        
        // Checking if the year is a leap year or not
        String result = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? ("Leap Year") : ("Not a Leap Year");
        
        // Printing the result
        System.out.println(result);
    }
}

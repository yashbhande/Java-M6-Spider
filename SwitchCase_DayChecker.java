public class DayChecker {

  public static void main(String[] args) {
    int dayNumber = 3; // Change this value to check different days

    switch (dayNumber) {
      case 1:
        System.out.println("The day is Monday.");
        break;
      case 2:
        System.out.println("The day is Tuesday.");
        break;
      case 3:
        System.out.println("The day is Wednesday.");
        break;
      case 4:
        System.out.println("The day is Thursday.");
        break;
      case 5:
        System.out.println("The day is Friday.");
        break;
      case 6:
        System.out.println("The day is Saturday.");
        break;
      case 7:
        System.out.println("The day is Sunday.");
        break;
      default:
        System.out.println("Invalid day number. Please enter a number between 1 and 7.");
    }
  }
}

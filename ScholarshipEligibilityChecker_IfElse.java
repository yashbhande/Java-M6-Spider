public class ScholarshipEligibilityChecker_IfElse {

  public static void main(String[] args) {
    int schoolMarks = 85; // 
    int scholarshipMarks = 92; 
    
    if (schoolMarks >= 80) {
      System.out.println("Congratulations! You are eligible to sit in the scholarship exam.");
      if (scholarshipMarks >= 90) {
        double scholarshipPercentage = 0.2; // 20% scholarship
        System.out.println("You have earned a " + (scholarshipPercentage * 100) + "% scholarship on fees!");
      } else {
        System.out.println("While you are eligible, your scholarship exam marks are not high enough for a scholarship.");
      }
    } else {
      System.out.println("You are not eligible to sit in the scholarship exam as your school marks are below 80.");
    }
  }
}

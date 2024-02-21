// This program generates a marksheet including college name, affiliation, student information,
// subject details, total marks, percentage, and grade.

public class Mark_Sheet_Creation_Project{
    public static void main(String[] args) {

        // Variables
        // College information
        String school = "KJEI Trinity Academy of Engineering";
        String affiliated = "Pune University";

        // Student information
        String name = "Yash Bhande";
        String roll = "B204", sec = "B", exam = "Semester";

        // Subject details
        String sub1 = "Java", sub2 = "Html", sub3 = "Python", sub4 = "C", sub5 = "Css";
        int fullmarks = 100; // Full marks for each subject

        // Marks obtained by the student in each subject
	// If any subject marks will be less than 35 , can be used to display Failed - for checking condition in Ternary Operator
        int subb1 = 80, subb2 = 70, subb3 = 88, subb4 = 80, subb5 = 32;

        // Total marks obtained by the student
        int totalmark = subb1 + subb2 + subb3 + subb4 + subb5;

        // Percentage calculation
        double per = (totalmark*100)/500; // Assuming 5 subjects

        // Ternary operator for calculating Grades
			// If any subject marks are below passing (35), then overall failed
        String grade = (subb1<35 || subb2<35 || subb3<35 || subb4<35 || subb5<35 )?("Failed"):
			(per > 80 && per <= 100) ? ("A") :
                    	(per > 60 && per <= 80) ? ("B") :
                        (per > 40 && per <= 60) ? ("C") :
                        (per > 35 && per <= 40) ? ("D") :
			("Failed");

        // Printing the marksheet
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("                                             " + school);
        System.out.println("                                                      " + affiliated);
        System.out.println("");
        System.out.println("");
        System.out.println("Name:" + name + "                                                                          Date:21/02/2024");
        System.out.println("Roll No:" + roll + "                                          Section:" + sec + "                           Exam:" + exam);
        System.out.println("");
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.println("Subject                                               Full Marks                          Marks Obtained");
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.println("1) " + sub1 + "                                                " + fullmarks + "                                " + subb1);
        System.out.println("2) " + sub2 + "                                                " + fullmarks + "                                " + subb2);
        System.out.println("3) " + sub3 + "                                              " + fullmarks + "                                " + subb3);
        System.out.println("4) " + sub4 + "                                                   " + fullmarks + "                                " + subb4);
        System.out.println("5) " + sub5 + "                                                 " + fullmarks + "                                " + subb5);
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.println("Total Subjects: 5" + "                              Total Full Marks: 500" + "                      Marks Obtained:" + totalmark);
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.println("Percentage:" + per + "                                                                           Grade:" + grade);
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.println("Remarks: Good" + "                                                                             Signature: Yash");
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.println("");
    }
}

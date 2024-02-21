//Create an Markshit Including College name,Affiliated, Student Info, Subjects, Total Marks, Percentage, Grade.

class MarkSheet_Project{
public static void main(String[] args){


//Variables

String school="KJEI Trinity Academy of Engineering";
String affiliated="Pune University";
String name="Yash Bhande";
String roll="B204", sec="B", exam="Semester";
String sub1="Java",sub2="Html",sub3="Python",sub4="C",sub5="Css";
int fullmarks=100;
int subb1=80,subb2=70,subb3=88,subb4=80,subb5=90;
int totalmark=subb1+subb2+subb3+subb4+subb5;
double per=totalmark/5;


//Ternary operator for calculating Grades
String grade=(per>80 && per<=100)?("A"):
	     (per>60 && per<=80)?("B"):
	     (per>40 && per<=60)?("C"):
	     (per>35 && per<=40)?("D"):
	     ("Failed");

System.out.println("-----------------------------------------------------------------------------------------------------------------");
System.out.println("");

System.out.println("                                             "+school);
System.out.println("                                                      "+affiliated);
System.out.println("");
System.out.println("");

System.out.println("Name:"+name+"                                                                          Date:21/02/2024");
System.out.println("Roll No:"+roll+"                                          Section:"+sec+"                           Exam:"+exam);

System.out.println("");
System.out.println("-----------------------------------------------------------------------------------------------------------------");


System.out.println("Subject                                               Full Marks                          Marks Obtained");
System.out.println("-----------------------------------------------------------------------------------------------------------------");

System.out.println("1) "+ sub1 +"                                                "+fullmarks +"                                "+subb1);
System.out.println("2) "+ sub2 +"                                                "+fullmarks +"                                "+subb2);
System.out.println("3) "+ sub3 +"                                              "+fullmarks +"                                "+subb3);
System.out.println("4) "+ sub4 +"                                                   "+fullmarks +"                                "+subb4);
System.out.println("5) "+ sub5 +"                                                 "+fullmarks +"                                "+subb5);


System.out.println("-----------------------------------------------------------------------------------------------------------------");

System.out.println("Total Subjects: 5"+"                              Total Full Marks: 500"+"                      Marks Obtained:"+totalmark);

System.out.println("-----------------------------------------------------------------------------------------------------------------");
System.out.println("Percentage:"+per+"                                                                           Grade:"+grade);

System.out.println("-----------------------------------------------------------------------------------------------------------------");
System.out.println("Remarks: Good"+"                                                                             Signature: Yash");
System.out.println("-----------------------------------------------------------------------------------------------------------------");


System.out.println("");







}}

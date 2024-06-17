//[PIUSH, YASH, RIYA, KARTHIK]

import java.util.*;
class Student
{
    String name;
    int rollNumber;
    int mark;
    
    Student(String name, int rollNumber, int marks)
    {
        this.name=name;
        this.rollNumber=rollNumber;
        this.mark=mark;
    }
    
    public String getName()
    {
        return name;
    }
}

public class ListExample
{
    public static void main(String [] args)
    {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Piush",31,80));
        students.add(new Student("Yash",38,80));
        students.add(new Student("Riya",39,80));
        students.add(new Student("Karthik",49,80));
        
        List<String> names= new ArrayList<>();
        for(Student student:students)
        {
            names.add(student.getName().toUpperCase());
        }
        System.out.println(names);
    }
}

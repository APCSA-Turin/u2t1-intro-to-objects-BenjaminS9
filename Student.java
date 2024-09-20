//Student class definition
public class Student {
    // instance variables
    private String name;
    private int gradeYear;
    private double gpa;
 
    // constructor
    public Student(String studentName, int currentSchoolGrade, double currentGrades) {
        name = studentName;
        gradeYear = currentSchoolGrade;
        gpa = currentGrades;
    }
 
    // method that predicts how many years it takes for the student to graduate
    public void graduation() {
        if (gradeYear == 12) {
            System.out.println(name + " will graduate this year");
        } else {
            System.out.println(name + " will graduate in " + (12 - gradeYear) + " years");
        }
    }
 
    // method that prints Student name, year, and grades
    public void printStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Currently in " + gradeYear + ("th grade"));
        System.out.println("GPA: " + gpa);
    }
 }

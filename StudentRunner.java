public class StudentRunner {
    public static void main(String[] args) {
        Student student1 = new Student("Alexander", 10, 3.98);
        student1.printStudentInfo();
        student1.graduation();

        Student student2 = new Student("Cleopatra", 12, 3.01);
        student2.printStudentInfo();
        student2.graduation();
    }
}

public class Student extends Person implements Printable {

    private int studentId;

    public Student(String name, int age, String role, int studentId) {
        super(name, age, role);
        this.studentId = studentId;
    }


    @Override
    public void introduce() {

        System.out.println("Hello! My name is " + getName());

        System.out.println("I am " + age + " years old.");

        System.out.println("I am a " + role + ".");

        System.out.println("My student ID is: " + studentId);
    }

    public void printingData(String name){
        System.out.println("Hello! My name is " + name);
    }

    public void printingData(String name, int age){
        System.out.println("Hello! My name is " + name);
        System.out.println("I am a " + age + " years old.");
    }

    public void printingData(String name, float age){
        System.out.println("Hello! My name is " + name);
        System.out.println("I am a " + age + " years old.");
    }

    @Override
    public void printDetails() {
        System.out.println("========== Student Details ==========");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + age);
        System.out.println("Role: " + role);
        System.out.println("Student ID: " + studentId);
        System.out.println("=====================================");
    }

    @Override
    public void printId() {
        System.out.println("StudentID: " + studentId);
    }

    @Override
    public void printName() {
        System.out.println("studentName: " + getName());
    }

    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }


}

public class Main {

    public static void main(String[] args) {

        // 1: Creating a Student Object

        System.out.println("-> Creating a Student Object\n");

        // 2: Create a Student using constructor
        Student student1 = new Student("Ramy Ahmed", 16, "Student", 12345);

        System.out.println("Created student: " + student1.getName());
        System.out.println();


        System.out.println("Calling introduce()\n");

        student1.introduce();
        System.out.println();

        //3: Calling Final Method

        System.out.println("Calling showRole()\n");


        student1.showRole();
        System.out.println();

        //4: Calling Interface Default Method

        System.out.println("Calling printSchoolName()\n");

        student1.printSchoolName();
        System.out.println();

        //5: Calling Interface Implementation

        System.out.println("Calling printDetails()\n");

        student1.printDetails();
        System.out.println();

//        //7: Polymorphism with Abstract Class
//
//        System.out.println("Polymorphism - Person Reference\n");
//
//        // POLYMORPHISM: A Person reference can hold a Student object
//        // This works because Student IS-A Person
//        Person person = new Student("Atef Magdy", 17, "Student", 67890);
//
//        System.out.println("Created Person reference pointing to Student object");
//        System.out.println("Calling introduce() through Person reference:");
//        person.introduce();
//        System.out.println();
//
//        //8: Polymorphism with Interface
//
//        System.out.println("Polymorphism - Printable Reference\n");
//
//        // POLYMORPHISM: A Printable reference can hold a Student object
//        // This works because Student implements Printable
//        Printable printable = new Student("Micheal Tharwat", 15, "Student", 11111);
//
//        System.out.println("Created Printable reference pointing to Student object");
//        System.out.println("Calling interface methods:");
//        printable.printSchoolName(); // Inherited default method
//        printable.printDetails(); // Implemented method
//        System.out.println();

        System.out.println("Working with Multiple Students\n");

        //Implementing more than one object inside an array from class Student using constructor
        Student[] students = {
                new Student("Khaled Mohamed", 16, "Student", 22222),
                new Student("Mahmoud Samy", 17, "Student", 33333),
                new Student("Rania Gohar", 15, "Student", 44444)
        };

        for (int i = 0; i < students.length; i++) {
            System.out.println("Student #" + (i + 1) + ":");
            students[i].introduce();
            System.out.println("---");
        }
        System.out.println();

        student1.printingData("Khaled");
        student1.printingData("Mahmoud Samy", 18);
        student1.printingData("Mahmoud Samy", 18.5f);

        Admin admin1 = new Admin();
        admin1.printName();
        student1.printName();
        student1.getStudentId();

        admin1.printDetails();
        student1.printDetails();

        student1.printingData("Ahmed", 28.5f);

    }
}

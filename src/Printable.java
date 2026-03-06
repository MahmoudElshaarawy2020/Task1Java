public interface Printable {


    String SCHOOL_NAME = "Cairo Secondary School";

    default void printSchoolName() {
        System.out.println("School: " + SCHOOL_NAME);
    }

    void printDetails();



    //using git bash
    void printId();

    void printName();
}

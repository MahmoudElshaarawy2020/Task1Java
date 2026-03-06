public interface Printable {


    String SCHOOL_NAME = "Cairo Secondary School";

    default void printSchoolName() {
        System.out.println("School: " + SCHOOL_NAME);
    }

    void printDetails();

    void printId();

    void printName();
}

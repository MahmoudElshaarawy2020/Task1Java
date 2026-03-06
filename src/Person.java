
public abstract class Person {
    

    private String name;

    protected int age;

    private String nationalId;
    

    public String role;
    

    public Person() {
        this.name = "Unknown";
        this.age = 0;
        this.role = "Not Assigned";
    }

    public Person(String name, int age, String role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }
    
    public void printDetails(){
        System.out.println("Name: " + name);
    }

    public abstract void introduce();
    
    

    public final void showRole() {
        System.out.println("Role: " + role);
    }

    public String getName() {
        return name;
    }

}
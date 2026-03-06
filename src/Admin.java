public class Admin extends Person implements Printable{
    @Override
    public void printDetails() {
        System.out.println("Admin name:");
    }

    @Override
    public void printId() {
        System.out.println("AdminId");
    }

    @Override
    public void printName() {
        System.out.println("AdminName");
    }

    @Override
    public void introduce() {

    }
}

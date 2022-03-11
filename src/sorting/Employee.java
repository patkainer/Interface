package sorting;

public class Employee {
    private String lastname;
    private String firstname;
    private String department;
    private double baseSallery;

    public Employee(String lastname, String firstname, String department, double baseSallery) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.department = department;
        this.baseSallery = baseSallery;
    }

    public double getBaseSallery() {
        return baseSallery;
    }
}

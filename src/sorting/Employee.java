package sorting;

public class Employee implements Comparable<Employee> {
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

    @Override
    public String toString() {
        return "Employee{" +
                "lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", department='" + department + '\'' +
                ", baseSallery=" + baseSallery +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        // -1 => kleiner
        // 0 => ident
        // +1 => größer

        if (lastname.compareTo(o.lastname)== 0){
            return firstname.compareTo(o.firstname);
        }
        else{
            return  lastname.compareTo(o.lastname);
        }
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setBaseSallery(double baseSallery) {
        this.baseSallery = baseSallery;
    }
}

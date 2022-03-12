package campus02.kainer.Ueblatt03032022;

import java.util.Objects;

public abstract class Employee {

    private String lastname;
    private String firstname;
    private String department;
    double baseSalary;

    public abstract double getFullSalary();

    public Employee(String lastname, String firstname, String department, double baseSalary) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.department = department;
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", department='" + department + '\'' +
                ", baseSalary=" + baseSalary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.baseSalary, baseSalary) == 0 && Objects.equals(lastname, employee.lastname) && Objects.equals(firstname, employee.firstname) && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastname, firstname, department, baseSalary);
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

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}

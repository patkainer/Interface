package campus02.kainer.Ueblatt03032022;

public class FixComissionEmployee extends Employee{

    private double additionalCommision;

    public FixComissionEmployee(String lastname, String firstname, String department, double baseSalary, double additionalCommision) {
        super(lastname, firstname, department, baseSalary);
        this.additionalCommision = additionalCommision;
    }

    @Override
    public double getFullSalary() {
        return getFullSalary()+additionalCommision ;
    }
}

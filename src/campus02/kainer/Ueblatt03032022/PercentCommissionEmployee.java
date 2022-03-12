package campus02.kainer.Ueblatt03032022;

public class PercentCommissionEmployee extends Employee{

    private double percentCommision;

    public PercentCommissionEmployee(String lastname, String firstname, String department, double baseSalary, double percentCommision) {
        super(lastname, firstname, department, baseSalary);
        this.percentCommision = percentCommision;
    }

    @Override
    public double getFullSalary() {
        return getBaseSalary()+getBaseSalary()+percentCommision;
    }
}

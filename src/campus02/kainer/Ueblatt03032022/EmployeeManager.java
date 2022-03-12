package campus02.kainer.Ueblatt03032022;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeManager {

    ArrayList<Employee> ee = new ArrayList<>();

    public double calcTotalSalary()
    {
        return 0;
    }

    public void addEmployee(Employee employee)
    {
        ee.add(employee);
    }

    public HashMap<String,Double> getBaseSalaryByDepartment(ArrayList<Employee> employees)
    {
        HashMap<String,Double> hashMap = new HashMap<>();
        for (Employee employee : ee) {
            if (hashMap.containsKey(employee.getDepartment()))
            {
                hashMap.put(employee.getDepartment(),employee.getBaseSalary()+hashMap.get(employee.getDepartment()));
            }else{
                hashMap.put(employee.getDepartment(),employee.getBaseSalary());
            }
        }
        return hashMap;
    }
}

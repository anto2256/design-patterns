import ChainOdResponsibility.Employee;
import ChainOdResponsibility.InternationalEmployee;
import ChainOdResponsibility.LocalEmployee;
import ChainOdResponsibility.NationalEmployee;
import ChainOdResponsibility.Package;
import Observer.Staff;
import State.StateOfStaff;
import State.Waiting;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Employee internationalEmployee = new InternationalEmployee("Anton");
        Employee nationalEmployee = new NationalEmployee("Fernando");
        Employee localEmployee = new LocalEmployee("Ricardo");

        Staff observer = new Staff("Boss");

        List<Employee> employees = new ArrayList<>();
        employees.add(internationalEmployee);
        employees.add(nationalEmployee);
        employees.add(localEmployee);


        StateOfStaff waitingForCustomer = new Waiting();

        internationalEmployee.setNextEmployee(nationalEmployee);
        nationalEmployee.setNextEmployee(localEmployee);

        for (int i = 0; i < employees.size(); i++) {
            Employee temp = employees.get(i);
            temp.setObserver(observer);
            waitingForCustomer.setState(temp);
        }

        nationalEmployee.prepareOrPassToNext(new Package("Package for Plovdiv", Employee.LOCAL));
        nationalEmployee.prepareOrPassToNext(new Package("Package for Sofia", Employee.NATIONAL));
        internationalEmployee.prepareOrPassToNext(new Package("Package for Bangladesh", Employee.INTERNATIONAL));
        localEmployee.prepareOrPassToNext(new Package("Package for Plovdiv", Employee.LOCAL));
        internationalEmployee.prepareOrPassToNext(new Package("Package for Plovdiv", Employee.LOCAL));
    }
}
package State;

import ChainOdResponsibility.Employee;

public class PackagePrep implements StateOfStaff {
    private String name = "PREPARING_THE_PACKAGE";

    @Override
    public void setState(Employee employee) {
        employee.setState(this);
    }

    @Override
    public String getStateName() {
        return this.name;
    }
}

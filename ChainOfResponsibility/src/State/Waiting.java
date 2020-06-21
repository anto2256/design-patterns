package State;

import ChainOdResponsibility.Employee;

public class Waiting implements StateOfStaff {
    private String name = "WAITING_FOR_CUSTOMER";

    @Override
    public void setState(Employee employee) {
        employee.setState(this);
    }

    @Override
    public String getStateName() {
        return this.name;
    }
}


package State;

import ChainOdResponsibility.Employee;

public interface StateOfStaff {


    void setState(Employee employee);

    String getStateName();
}

package Observer;

import ChainOdResponsibility.Employee;
import State.StateOfStaff;
import State.Waiting;

public class Staff {

    private String name;

    public Staff(String name) {
        this.name = name;
    }

    public void changeState(Employee employee) {
        StateOfStaff state = employee.getState();

        if (state.getStateName() == "PREPARING_THE_PACKAGE") {
            System.out.println(this.getName() + " is going to carry that package to the warehouse");

            Waiting waitingState = new Waiting();
            employee.setState(waitingState);
        } else {
            System.out.println(this.getName() + " is watching " + employee.getName() + " who is waiting for next customer");
        }
    }

    public String getName() {
        return name;
    }


}

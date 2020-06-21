package ChainOdResponsibility;

import Observer.Staff;
import State.StateOfStaff;

public abstract class Employee {

    public static final int LOCAL = 1;
    public static final int NATIONAL = 2;
    public static final int INTERNATIONAL = 3;

    private String name;
    private Staff observer;
    private StateOfStaff state;
    private int qualification;
    private Employee nextEmployee;

    public Employee(String name) {
        this.name = name;
    }

    abstract void preparePackage(Package newPackage);

    public void notifyObserver() {
        observer.changeState(this);
    }

    public void prepareOrPassToNext(Package newPackage) {
        String stateName = this.state.getStateName();

        if (this.qualification == newPackage.getEmployeeQualification() && stateName.equals("WAITING_FOR_CUSTOMER")) {
            this.preparePackage(newPackage);
        } else {
            this.nextEmployee.prepareOrPassToNext(newPackage);
        }
    }

    public String getName() {
        return name;
    }


    public void setObserver(Staff observer) {
        this.observer = observer;
    }

    public StateOfStaff getState() {
        return state;
    }

    public void setState(StateOfStaff state) {
        this.state = state;
        this.notifyObserver();
    }


    public void setQualification(int qualification) {
        this.qualification = qualification;
    }


    public void setNextEmployee(Employee nextEmployee) {
        this.nextEmployee = nextEmployee;
    }
}

package ChainOdResponsibility;

import State.PackagePrep;

public class NationalEmployee extends Employee {
    public NationalEmployee(String name) {
        super(name);
        this.setQualification(Employee.NATIONAL);
    }

    @Override
    void preparePackage(Package newPackage) {
        System.out.println(newPackage.getName() + " is being prepared by: " + this.getName());
        this.setState(new PackagePrep());
    }
}
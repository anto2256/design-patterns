package ChainOdResponsibility;

import State.PackagePrep;


public class LocalEmployee extends Employee {
    public LocalEmployee(String name) {
        super(name);
        this.setQualification(Employee.LOCAL);
    }

    @Override
    void preparePackage(Package newPackage) {
        System.out.println(newPackage.getName() + " is being prepared by: " + this.getName());
        this.setState(new PackagePrep());
    }
}

package ChainOdResponsibility;

import State.PackagePrep;

public class InternationalEmployee extends Employee {
    public InternationalEmployee(String name) {
        super(name);
        this.setQualification(Employee.INTERNATIONAL);
    }

    @Override
    void preparePackage(Package newPackage) {
        System.out.println(newPackage.getName() + " is being prepared by: " + this.getName());
        this.setState(new PackagePrep());
    }
}

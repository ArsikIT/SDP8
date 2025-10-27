package ConcreteElements;

import Interfaces.UniversityMember;
import Interfaces.Visitor;

public class Administrator implements UniversityMember {
    private String name;  // admin name
    private double salary;  // his/her salary

    public Administrator(String name, double salary) {  // constructor for initializing the admin name and salary
        this.name = name;
        this.salary = salary;
    }

    // getters
    public String getName() { return name; }
    public double getSalary() { return salary; }

    @Override
    public void accept(Visitor visitor) {  // the "accept" method accepts a Visitor
        visitor.visit(this);        // and calls the "visit" method for the Student object

    }
}

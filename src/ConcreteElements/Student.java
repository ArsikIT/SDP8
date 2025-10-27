package ConcreteElements;

import Interfaces.UniversityMember;
import Interfaces.Visitor;

public class Student implements UniversityMember {
    private String name;  // student name
    private double gpa;  // his/her GPA
    private double scholarship;  // his her scholarship

    public Student(String name, double gpa, double scholarship) {  // constructor for initializing the student name and GPA
        this.name = name;
        this.gpa = gpa;
        this.scholarship = scholarship;
    }

    //  getters
    public String getName() { return name; }
    public double getGpa() { return gpa; }
    public double getScholarship() { return scholarship; }

    @Override
    public void accept(Visitor visitor) {  // the "accept" method accepts a Visitor
        visitor.visit(this);       // and calls the "visit" method for the Student object


    }
}

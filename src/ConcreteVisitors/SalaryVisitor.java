package ConcreteVisitors;

import ConcreteElements.Administrator;
import ConcreteElements.Student;
import ConcreteElements.Teacher;
import Interfaces.Visitor;

public class SalaryVisitor implements Visitor {  // the Visitor who is responsible for displaying the salary

    @Override
    public void visit(Student student) {  // student has no salary
        System.out.println("Student " + student.getName() + " receives a scholarship of " + student.getScholarship() + "₸.");
    }

    @Override
    public void visit(Teacher teacher) {
        System.out.println("Teacher " + teacher.getName() + " earns " + teacher.getSalary() + "₸.");

    }

    @Override
    public void visit(Administrator admin) {
        System.out.println("Admin " + admin.getName() + " earns " + admin.getSalary() + "₸.");

    }
}

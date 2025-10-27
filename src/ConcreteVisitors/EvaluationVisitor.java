package ConcreteVisitors;

import ConcreteElements.Administrator;
import ConcreteElements.Student;
import ConcreteElements.Teacher;
import Interfaces.Visitor;

public class EvaluationVisitor implements Visitor {  // a specific Visitor who evaluates the members of the university


    @Override
    public void visit(Student student) {  // students grade: output the name and his/her GPA
        System.out.println("Evaluating " + student.getName() + ": GPA = " + student.getGpa());
    }

    @Override
    public void visit(Teacher teacher) {  // teachers grade: output the name and his/her salary
        System.out.println("Evaluating Teacher " + teacher.getName() + ": Excellent teaching performance.");

    }

    @Override
    public void visit(Administrator admin) {  // admins grade: output the name and his/her salary
        System.out.println("Evaluating Admin " + admin.getName() + ": Efficient management.");

    }
}

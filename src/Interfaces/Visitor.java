package Interfaces;

import ConcreteElements.Administrator;
import ConcreteElements.Student;
import ConcreteElements.Teacher;

public interface Visitor {
    void visit(Student student);
    void visit(Teacher teacher);
    void visit(Administrator admin);
}

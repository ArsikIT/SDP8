import ConcreteElements.Administrator;
import ConcreteElements.Student;
import ConcreteElements.Teacher;
import ConcreteVisitors.EvaluationVisitor;
import ConcreteVisitors.SalaryVisitor;
import Interfaces.UniversityMember;
import Interfaces.Visitor;

public class Main {
    public static void main(String[] args) {
        UniversityMember[] members = {  // creating an array of university participants (student, teacher, administrator)
                new Student("Arslan Zheksenbaev", 3.9, 53000),
                new Teacher("Askar Khaimuldin", 450000),
                new Administrator("Emir Ziken", 550000)
        };

        // creating two users: one counts the payouts, the other evaluates the results
        Visitor salaryVisitor = new SalaryVisitor();
        Visitor evaluationVisitor = new EvaluationVisitor();

        // Salary and Scholarship Report
        System.out.println("=== Salary Report ===");
        for (UniversityMember m : members) {
            m.accept(salaryVisitor);  // each object accepts a SalaryVisitor visitor
        }

        // Performance Assessment Report
        System.out.println("\n=== Performance Evaluation ===");
        for (UniversityMember m : members) {
            m.accept(evaluationVisitor);  // each object accepts an EvaluationVisitor visitor
        }

    }
}
package aula11;
import java.util.List;
import java.util.ArrayList;

public class GradebookTester  {
    public static void main(String[] args) {
        Gradebook gradebook = new Gradebook();

        try {
            gradebook.load("alunos.txt");
        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }

        gradebook.printAllStudents();
        System.out.println("\n--------------------------------------------------\n");

        Student newStudent = new Student("NEYMAR JÚNIOR", new ArrayList<>(List.of(10.0, 15.0, 19.0)));
        gradebook.addStudent(newStudent);

        Student newStudent2 = new Student("JOÃO VARELA", new ArrayList<>(List.of(20.0, 19.0, 19.8)));
        gradebook.addStudent(newStudent2);


        gradebook.printAllStudents();
        System.out.println("\n--------------------------------------------------\n");

        // Remove a student from the collection
        gradebook.removeStudent("NEYMAR JÚNIOR");

        
        gradebook.printAllStudents();
        System.out.println("\n--------------------------------------------------\n");

        // Retrieve a student from the collection
        Student student = gradebook.getStudent("John Doe");
        System.out.println("Student retrieved: " + student);
        System.out.println("Student retrieved: " + newStudent2);

        System.out.println("\n--------------------------------------------------\n");

        // Calculate the average grade for a specific student
        double averageGrade = gradebook.calculateAverageGrade("John Doe");
        double averageGrade2 = gradebook.calculateAverageGrade("Isabella Perez");
        System.out.println("Average grade for John Doe: " + averageGrade);
        System.out.println("Average grade for Isabella Perez: " + averageGrade2);
        
        
    }
}


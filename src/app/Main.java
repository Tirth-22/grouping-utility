package app;

import java.util.List;
import java.util.Set;
import model.Domain;
import model.Student;
//import model.University;
import service.StudentService;

public class Main {
    public static void main(String[] args) {

       List<Student> students = List.of(
            new Student("Tirth","DEPSTAR",Set.of("Java","Spring Boot"),Domain.Java),
            new Student("Harshit","DEPSTAR",Set.of("Python","numpy"),Domain.aiml),
            new Student("Nikunj","CSPIT",Set.of("Python"),Domain.Python),
            new Student("Prince","DEPSTAR",Set.of("AWS"),Domain.Cloud),
            new Student("Kavy","DEPSTAR",Set.of("C"),Domain.Operating_System),
       );
    }
}

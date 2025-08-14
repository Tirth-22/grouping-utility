package app;

import java.util.*;
import java.util.stream.Collectors;
import model.Domain;
import model.Student;

public class Main {
    public static void main(String[] args) {

        List<Student> students = List.of(
                new Student("Tirth", "DEPSTAR", Set.of("Java", "Spring Boot"), Domain.Java),
                new Student("Harshit", "DEPSTAR", Set.of("Python", "numpy"), Domain.aiml),
                new Student("Nikunj", "CSPIT", Set.of("Python"), Domain.Python),
                new Student("Prince", "DEPSTAR", Set.of("AWS"), Domain.Cloud),
                new Student("Kavy", "DEPSTAR", Set.of("C"), Domain.Operating_System),
                new Student("Raxeet", "CSPIT", Set.of("AWS"), Domain.Cloud),
                new Student("Krish", "DEPSTAR", Set.of("Python"), Domain.aiml)
        );

        Map<String, Map<Domain, List<String>>> groupedData =
                students.stream()
                        .collect(Collectors.groupingBy(Student::university,
                                Collectors.groupingBy(Student::domain,
                                        Collectors.mapping(Student::name, Collectors.toList())
                                )
                        ));

        groupedData.forEach((university, domainMap) -> {
            System.out.println(university + ":");
            domainMap.forEach((domain, names) -> {
                System.out.println("   " + domainName(domain) + " -> " + String.join(", ", names));
            });
        });
    }

    // For better domain names
    private static String domainName(Domain d) {
        return switch (d) {
            case Java -> "Java";
            case Python -> "Python";
            case Cloud -> "Cloud";
            case Operating_System -> "OS";
            case aiml -> "AI/ML";
            default -> "Other";
        };
    }
}

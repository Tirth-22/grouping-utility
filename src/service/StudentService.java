package service;

import java.util.*;
import java.util.stream.Collectors;
import model.Domain;
import model.Student;

public class StudentService {
        public Map<String, List<Student>> groupByUniversity(List<Student> students){
                return students.stream().collect(Collectors.groupingBy(Student::university));
        }

        public Map<Domain ,List<Student>> groupByDomain(List<Student> students){
                return students.stream().collect(Collectors.groupingBy(Student::domain));
        }

        public Map<String, Long> countByUniversity(List<Student> students) {
                return students.stream().collect(Collectors.groupingBy(Student::university, Collectors.counting()));
        }
}

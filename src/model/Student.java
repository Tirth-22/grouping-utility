package model;

public class Student {
    private String name;
    private Domain languageDomain;
    private University university;

    public Student(String name, Domain languageDomain, University university) {
        this.name = name;
        this.languageDomain = languageDomain;
        this.university = university;
    }

    public String getName() {
        return name;
    }

    public Domain getLanguageDomain() {
        return languageDomain;
    }

    public University getUniversity() {
        return university;
    }

    @Override
    public String toString() {
        return name;
    }
}

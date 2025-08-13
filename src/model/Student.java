package model;

import java.util.Set;

public record Student(String name, String university, Set<String> skills, Domain domain) {}

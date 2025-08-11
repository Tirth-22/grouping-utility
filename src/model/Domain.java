package model;

public enum Domain{
    PYTHON("Data Science"),
    JAVA("Backend"),
    WEB_DEVELOPMENT("Frontend"),
    AI_ML("Data Science");

    private final String mainDomain;

    Domain(String mainDomain) {
        this.mainDomain = mainDomain;
    }

    public String getMainDomain() {
        return mainDomain;
    }
}
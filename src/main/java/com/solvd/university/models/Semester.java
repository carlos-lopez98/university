package main.java.com.solvd.university.models;

public class Semester {

    private int semesterId;
    private String semesterSession;

    public Semester(int semesterId, String semesterSession) {
        this.semesterId = semesterId;
        this.semesterSession = semesterSession;
    }

    public int getSemesterId() {
        return semesterId;
    }

    public void setSemesterId(int semesterId) {
        this.semesterId = semesterId;
    }

    public String getSemesterSession() {
        return semesterSession;
    }

    public void setSemesterSession(String semesterSession) {
        this.semesterSession = semesterSession;
    }
}

package main.java.com.solvd.university.models;

import java.time.ZonedDateTime;

public class Student {

    private String name;
    private String dateOfBirth;
    private String address;
    private int entryExamScore;

    public Student(String name, String dateOfBirth, int entryExamScore) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.entryExamScore = entryExamScore;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getEntryExamScore() {
        return entryExamScore;
    }
    public void setEntryExamScore(int entryExamScore) {
        this.entryExamScore = entryExamScore;
    }
}

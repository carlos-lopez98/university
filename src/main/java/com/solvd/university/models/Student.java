package main.java.com.solvd.university.models;

import java.time.ZonedDateTime;

public class Student {

    private String name;
    private ZonedDateTime dateOfBirth;
    private String address;
    private int entryExamScore;




    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ZonedDateTime getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(ZonedDateTime dateOfBirth) {
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

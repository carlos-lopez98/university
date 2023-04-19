package com.solvd.university.models.persons;


public class Student {

    private int entryExamScore;

    public Student(String name, String dateOfBirth, int entryExamScore) {
        this.entryExamScore = entryExamScore;
    }

    public int getEntryExamScore() {
        return entryExamScore;
    }

    public void setEntryExamScore(int entryExamScore) {
        this.entryExamScore = entryExamScore;
    }
}

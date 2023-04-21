package com.solvd.university.models.persons;


import com.solvd.university.models.EntryExamScore;

public class Student {

    private EntryExamScore entryExamScore;
    private int studentId;

    public Student(String name, String dateOfBirth, int mathScore, int readingScore, int writingScore ) {

        this.entryExamScore = new EntryExamScore(mathScore, readingScore, writingScore);
    }

    public EntryExamScore getEntryExamScore() {
        return entryExamScore;
    }

    public void setEntryExamScore(EntryExamScore entryExamScore) {
        this.entryExamScore = entryExamScore;
    }
}

package com.solvd.university.models.persons;


import com.solvd.university.models.EntryExamScore;
import com.solvd.university.models.universities.University;

public final class Student extends Person implements Speak{

    private EntryExamScore entryExamScore;
    private int studentId;


    public Student(String firstName, String lastName, University uniAssigned,  int mathScore, int readingScore, int writingScore) {
        super(firstName, lastName, uniAssigned);
        this.entryExamScore = new EntryExamScore(mathScore, readingScore, writingScore);
    }

    public EntryExamScore getEntryExamScore() {
        return entryExamScore;
    }

    public void setEntryExamScore(EntryExamScore entryExamScore) {
        this.entryExamScore = entryExamScore;
    }

    @Override
    public void speak() {
        System.out.println("Hello I'm a University Student");
    }
}

package com.solvd.university.models.persons;

import com.solvd.university.models.universities.University;

public final class Student extends Person implements Speak {

    private int studentId;
    private int mathScore;
    private int readingScore;
    private int writingScore;

    public Student(String firstName, String lastName, University uniAssigned) {
        super(firstName, lastName, uniAssigned);
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public int getReadingScore() {
        return readingScore;
    }

    public void setReadingScore(int readingScore) {
        this.readingScore = readingScore;
    }

    public int getWritingScore() {
        return writingScore;
    }

    public void setWritingScore(int writingScore) {
        this.writingScore = writingScore;
    }

    @Override
    public void speak() {
        System.out.println("Hello I'm a University Student");
    }
}

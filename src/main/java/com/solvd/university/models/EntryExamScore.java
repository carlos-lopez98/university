package com.solvd.university.models;

public class EntryExamScore {

    private int mathScore;
    private int readingScore;
    private int writingScore;

    EntryExamScore(int mathScore, int readingScore, int writingScore){
        this.mathScore = mathScore;
        this.readingScore = readingScore;
        this.writingScore = writingScore;
    }

    //Calculates Score for entry
    public int calculateEntryExamScore(){
        return (mathScore + readingScore + writingScore)/ 3;
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
}

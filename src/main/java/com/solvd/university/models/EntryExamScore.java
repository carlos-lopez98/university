package com.solvd.university.models;

public  class EntryExamScore {
    //Calculates Score for entry
    public static int calculateEntryExamScore(int mathScore,int readingScore, int writingScore) {
        return (mathScore + readingScore + writingScore) / 3;
    }
}

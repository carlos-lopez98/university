package com.solvd.university.models;

public class Pricing {
    private int universityFees;
    private int dormFees;
    private int courseFees;

    public Pricing(int universityFees, int dormFees, int courseFees) {
        this.universityFees = universityFees;
        this.dormFees = dormFees;
        this.courseFees = courseFees;
    }

    public int getUniversityFees() {
        return universityFees;
    }
    public void setUniversityFees(int universityFees) {
        this.universityFees = universityFees;
    }
    public int getDormFees() {
        return dormFees;
    }
    public void setDormFees(int dormFees) {
        this.dormFees = dormFees;
    }
    public int getCourseFees() {
        return courseFees;
    }
    public void setCourseFees(int courseFees) {
        this.courseFees = courseFees;
    }
}

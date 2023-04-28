package com.solvd.university.models.persons;

import com.solvd.university.models.universities.University;

import java.util.ArrayList;

public final class Staff extends Person implements Speak {

    private String dateHired;
    private String staffJob;
    private int staffID;

    public Staff(String firstName, String lastName, University uniAssigned) {
        super(firstName, lastName, uniAssigned);
    }

    public String getDateHired() {
        return dateHired;
    }

    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }

    public String getStaffJob() {
        return staffJob;
    }

    public void setStaffJob(String staffJob) {
        this.staffJob = staffJob;
    }

    public int getStaffID() {
        return staffID;
    }

    public void setStaffID(int staffID) {
        this.staffID = staffID;
    }

    @Override
    public void speak() {
        System.out.println("Hello I'm a University Staff");
    }
}

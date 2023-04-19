package com.solvd.university.models.persons;

import com.solvd.university.models.universities.University;

public class Staff extends Person{

    private String dateHired;
    private String staffJob;
    private int staffID;

    Staff(String firstName, String lastName, University uniAssigned, String staffJob) {
        super(firstName, lastName, uniAssigned);

        this.staffJob = staffJob;

        if(!uniAssigned.getPersonnel().isEmpty()){
            this.staffID = uniAssigned.getPersonnel().size();
        }
    }


    public String getDateHired() {
        return dateHired;
    }

    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }
}

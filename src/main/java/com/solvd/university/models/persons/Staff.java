package com.solvd.university.models.persons;

import com.solvd.university.models.universities.University;

public final class Staff extends Person implements Speak{

    private String dateHired;
    private String staffJob;
    private int staffID;

    public Staff(String firstName, String lastName, University uniAssigned, String staffJob) {
        super(firstName, lastName, uniAssigned);

        this.staffJob = staffJob;

      /*  if(!uniAssigned.getPersonnel().isEmpty()){
            this.staffID = uniAssigned.getPersonnel().size();
        }*/
    }


    public String getDateHired() {
        return dateHired;
    }

    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }


    @Override
    public void speak() {
        System.out.println("Hello I'm a University Staff");
    }
}

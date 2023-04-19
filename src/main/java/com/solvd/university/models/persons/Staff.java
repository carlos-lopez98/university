package com.solvd.university.models.persons;

public class Staff {

    private String stafferName;
    private int stafferId;
    private String dateOfBirth;
    private String dateHired;

    public Staff(String stafferName) {
        this.stafferName = stafferName;
    }

    public String getStafferName() {
        return stafferName;
    }

    public void setStafferName(String stafferName) {
        this.stafferName = stafferName;
    }

    public int getStafferId() {
        return stafferId;
    }

    public void setStafferId(int stafferId) {
        this.stafferId = stafferId;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateHired() {
        return dateHired;
    }

    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }
}

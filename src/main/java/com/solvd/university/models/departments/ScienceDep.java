package com.solvd.university.models.departments;

public class ScienceDep extends Department{

    public ScienceDep() {
        super.setDepartmentName("Science Department");
    }

    @Override
    public void seeDepartmentTutoringHours() {
        System.out.println("Hours: M-F 10AM - 12PM");
    }
}

package com.solvd.university.models.departments;

public class ScienceDep extends Department implements Budget{

    public ScienceDep() {
        super.setDepartmentName("Science Department");
    }

    @Override
    public void seeDepartmentTutoringHours() {
        System.out.println("Hours: M-F 10AM - 12PM");
    }

    @Override
    public void showBudget() {
        System.out.println("This Semester's Budget for the Science Department is $200,000");
    }
}

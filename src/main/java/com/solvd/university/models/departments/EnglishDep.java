package com.solvd.university.models.departments;

public class EnglishDep extends Department implements Budget{



    public EnglishDep() {
        super.setDepartmentName("English Department");
    }

    @Override
    public void seeDepartmentTutoringHours() {
        System.out.println("Hours: M-F 9AM - 11AM");
    }

    @Override
    public void showBudget() {
        System.out.println("This Semester's Budget for the English Department is $100,000");
    }
}

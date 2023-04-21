package com.solvd.university.models.departments;

public class EnglishDep extends Department{



    public EnglishDep() {
        super.setDepartmentName("English Department");
    }

    @Override
    public void seeDepartmentTutoringHours() {
        System.out.println("Hours: M-F 9AM - 11AM");
    }
}

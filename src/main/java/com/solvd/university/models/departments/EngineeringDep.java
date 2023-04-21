package com.solvd.university.models.departments;

public class EngineeringDep extends Department{


    public EngineeringDep() {
        super.setDepartmentName("Engineering Department");
    }

    @Override
    public void seeDepartmentTutoringHours() {
        System.out.println("Hours: M-F 5PM - 7PM");
    }
}

package com.solvd.university.models.departments;

public class EngineeringDep extends Department implements Budget{


    public EngineeringDep() {
        super.setDepartmentName("Engineering Department");
    }

    @Override
    public void seeDepartmentTutoringHours() {
        System.out.println("Hours: M-F 5PM - 7PM");
    }

    @Override
    public void showBudget() {
        System.out.println("This semester's budget for the Engineering department is $350,000");
    }
}

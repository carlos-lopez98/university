package com.solvd.university.models.departments;

import java.util.List;

public class ScienceDep extends Department implements Budget {

    private final List<String> mandatoryPracticalFieldTrips;

    public ScienceDep(String departmentTeamName, List<String> mandatoryPracticalFieldTrips) {
        this.mandatoryPracticalFieldTrips = mandatoryPracticalFieldTrips;
        super.setDepartmentTeamName(departmentTeamName);
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

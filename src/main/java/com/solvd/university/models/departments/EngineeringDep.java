package com.solvd.university.models.departments;

import java.util.List;

public class EngineeringDep extends Department implements Budget{

    public final List<String> buildingToolsAvailable;

    public EngineeringDep(String departmentTeamName, List<String> buildingToolsAvailable) {
        this.buildingToolsAvailable = buildingToolsAvailable;
        super.setDepartmentName(departmentTeamName);
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

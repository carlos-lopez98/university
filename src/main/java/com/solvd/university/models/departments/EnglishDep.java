package com.solvd.university.models.departments;

import java.util.List;

public class EnglishDep extends Department implements Budget{

    private final List<String> booksInLibrary;

    public EnglishDep(String departmentTeamName, List<String> booksInLibrary) {
        this.booksInLibrary = booksInLibrary;
        super.setDepartmentTeamName(departmentTeamName);
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

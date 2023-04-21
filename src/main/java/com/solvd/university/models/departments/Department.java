package com.solvd.university.models.departments;

public abstract class Department {

    private String departmentName;

    //Abstract Method
    public abstract void seeDepartmentTutoringHours();

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

}

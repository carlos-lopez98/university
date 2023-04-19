package com.solvd.university.models.universities;

import com.solvd.university.models.courses.Course;
import com.solvd.university.models.departments.Department;
import com.solvd.university.models.persons.Staff;
import com.solvd.university.models.persons.Student;

import java.util.List;

public class PublicUniversity extends University {

    private int tuitionCost;
    private int dormCost;
    private boolean inState;


    public PublicUniversity(String universityName,
                            List<Course> courses,
                            List<Department> departments,
                            List<Student> students,
                            List<Staff> personnel,
                            boolean inState) {
     super(universityName, courses, departments, students, personnel);
        this.inState = inState;

        if (!this.inState) {
            this.tuitionCost = 13000;
            this.dormCost = 25000;
        } else {
            this.tuitionCost = 6000;
            this.dormCost = 12500;
        }
    }

    public int getTuitionCost() {
        return tuitionCost;
    }

    public int getDormCost() {
        return dormCost;
    }

    public boolean isInState() {
        return inState;
    }
}

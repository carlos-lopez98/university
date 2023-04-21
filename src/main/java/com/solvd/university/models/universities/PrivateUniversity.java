package com.solvd.university.models.universities;

import com.solvd.university.models.courses.Course;
import com.solvd.university.models.departments.Department;
import com.solvd.university.models.persons.Person;
import com.solvd.university.models.persons.Staff;
import com.solvd.university.models.persons.Student;

import java.util.List;

public class PrivateUniversity extends University{

    private int tuitionCost;
    private int dormCost;
    private boolean inState;


    public PrivateUniversity(String universityName, List<Course> courses, List<Department> departments, List<Student> students, List<Staff> personnel, boolean inState) {
      super(universityName, courses, departments, students, personnel);

        this.inState = inState;

        if (!this.inState) {
            this.tuitionCost = 16000;
            this.dormCost = 25000;
        } else {
            this.tuitionCost = 9000;
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

        @Override
        public void displayCoursesOffered() {

            System.out.println(this.getUniversityName() + "Offers the below courses");

            for (Course course : this.getCourses()) {
                System.out.println(course.getCourseName());
            }
        }
}

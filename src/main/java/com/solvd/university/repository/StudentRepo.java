package com.solvd.university.repository;

import com.solvd.university.models.persons.Student;

import java.util.List;

public class StudentRepo {
    private List<Student> students;


    public StudentRepo(List<Student> students){
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }
    public void setStudents(List<Student> students) {
        this.students = students;
    }
}

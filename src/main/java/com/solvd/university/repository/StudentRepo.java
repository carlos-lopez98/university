package main.java.com.solvd.university.repository;

import main.java.com.solvd.university.models.Student;

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
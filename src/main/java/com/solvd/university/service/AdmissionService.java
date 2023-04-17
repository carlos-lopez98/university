package main.java.com.solvd.university.service;

import main.java.com.solvd.university.repository.StudentRepo;

public class AdmissionService {

    private StudentRepo studentRepo;

    public AdmissionService(StudentRepo studentRepo){
        this.studentRepo = studentRepo;
    }

    public StudentRepo getStudents() {
        return students;
    }

    public void setStudents(StudentRepo students) {
        this.students = students;
    }
}

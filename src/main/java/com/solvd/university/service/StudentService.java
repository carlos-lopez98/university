package main.java.com.solvd.university.service;

import main.java.com.solvd.university.repository.StudentRepo;

public class StudentService {


    private StudentRepo studentRepo;


    public StudentService(StudentRepo studentRepo){
        this.studentRepo = studentRepo;
    }

    public StudentRepo getStudentRepo() {
        return studentRepo;
    }
    public void setStudentRepo(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }
}

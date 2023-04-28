package com.solvd.university.database;

import com.solvd.university.models.persons.Student;
import com.solvd.university.models.universities.University;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class StudentDatabase {

    private List<Student> students;

    public StudentDatabase(UniversityDatabase database){
        int counter = 0;
        for(University university: database.getUniversityList()){
            students.addAll(database.getUniversityList().get(counter).getStudents());
        }
    }
}

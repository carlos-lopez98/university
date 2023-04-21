package com.solvd.university;

import com.solvd.university.models.courses.Course;
import com.solvd.university.models.persons.Student;
import com.solvd.university.models.universities.PrivateUniversity;
import com.solvd.university.models.universities.University;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        List<Course> privateUniCourses = new ArrayList<>();


        Student studentOne = new Student("Carlos", "05/11/1998", 78,92,95);
        Student studentTwo = new Student("John Doe", "11/19/1999", 85, 67, 92);



        Scanner scanner = new Scanner(System.in);

        System.out.println("********Hello, Welcome to our University system********");
        System.out.println("");


    }


}

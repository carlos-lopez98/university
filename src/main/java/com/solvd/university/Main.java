package com.solvd.university;

import com.solvd.university.models.clubs.Club;
import com.solvd.university.models.clubs.RoboticsClub;
import com.solvd.university.models.clubs.SoccerClub;
import com.solvd.university.models.courses.Calculus;
import com.solvd.university.models.courses.Chemistry;
import com.solvd.university.models.courses.Course;
import com.solvd.university.models.courses.Literature;
import com.solvd.university.models.departments.Department;
import com.solvd.university.models.departments.EngineeringDep;
import com.solvd.university.models.departments.EnglishDep;
import com.solvd.university.models.departments.ScienceDep;
import com.solvd.university.models.persons.Person;
import com.solvd.university.models.persons.Staff;
import com.solvd.university.models.persons.Student;
import com.solvd.university.models.universities.PrivateUniversity;
import com.solvd.university.models.universities.University;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Student studentOne = new Student("Carlos", "Lopez",null,78,92,95);
        Student studentTwo = new Student("John", "Doe", null, 85, 67, 92);

        Department engineeringDep = new EngineeringDep();
        Department englishDep = new EnglishDep();
        Department scienceDep = new ScienceDep();

        Club roboticsClub = new RoboticsClub();
        Club soccerClub = new SoccerClub();

        Course chemistryCourse = new Chemistry();
        Course calculusCourse = new Calculus();
        Course literatureCourse = new Literature();

        List<Course> privateUniOneCourses = new ArrayList<>();
        privateUniOneCourses.add(chemistryCourse);
        privateUniOneCourses.add(calculusCourse);
        privateUniOneCourses.add(literatureCourse);

        List<Department> privateUniOneDeps = new ArrayList<>();
        privateUniOneDeps.add(engineeringDep);
        privateUniOneDeps.add(englishDep);
        privateUniOneDeps.add(scienceDep);

        List<Club> privateUniOneClubs = new ArrayList<>();
        privateUniOneClubs.add(roboticsClub);

        Staff staffJanitor = new Staff("Mike", "Jill", null, "Janitor");
        Staff staffAdministrator = new Staff("Guy", "Grey", null, "Admin");

        List<Staff> privateUniOneStaff = new ArrayList<>();
        privateUniOneStaff.add(staffJanitor);
        privateUniOneStaff.add(staffAdministrator);


        University privateUniversityOne = new PrivateUniversity("Stanford", privateUniOneCourses, privateUniOneDeps,
                new ArrayList<>(),privateUniOneStaff, true);

        System.out.println("********Hello, Welcome to our University system********");
        System.out.println("*******************************************************");
        System.out.println("");
        System.out.println("For " + studentOne.getFirstName() + " based off his Entry Exam Score");
        System.out.println("Which is the average of three scores: Math, Reading and Writing");
        System.out.println("Earned Score " + studentOne.getEntryExamScore().calculateEntryExamScore() + "% average");
        System.out.println("With this score you qualify for " + privateUniversityOne.getUniversityName());
    }
}

package com.solvd.university;

import com.solvd.university.database.UniversityDatabase;
import com.solvd.university.models.clubs.Club;
import com.solvd.university.models.clubs.RoboticsClub;
import com.solvd.university.models.clubs.SoccerClub;
import com.solvd.university.models.courses.Calculus;
import com.solvd.university.models.courses.Chemistry;
import com.solvd.university.models.courses.Course;
import com.solvd.university.models.courses.Literature;
import com.solvd.university.models.departments.Department;
import com.solvd.university.models.departments.EnglishDep;
import com.solvd.university.models.departments.ScienceDep;
import com.solvd.university.models.persons.Staff;
import com.solvd.university.models.persons.Student;
import com.solvd.university.models.universities.PrivateUniversity;
import com.solvd.university.models.universities.University;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);
    private static UniversityDatabase universityDatabase = new UniversityDatabase();

    public static void main(String[] args) {

        logger.info("********Hello, Welcome to our University system********");
        logger.info("*******************************************************");
        logger.info("Our Current System has the below Universities Available for Review");
        printUniversitiesInSystem();




    };


    private static void printUniversitiesInSystem() {
        int counter = 1;
        for (University university : universityDatabase.getUniversityList()) {
            logger.info(counter + ": " + university.getUniversityName());
            counter++;
        }
    }
}

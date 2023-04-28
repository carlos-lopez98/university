package com.solvd.university;

import com.solvd.university.database.UniversityDatabase;
import com.solvd.university.models.EntryExamScore;
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
import com.solvd.university.models.universities.PublicUniversity;
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

        Student newAdmissionStudentOne = new Student("John", "Luke", null);
        Student newAdmissionStudentTwo = new Student("Mary", "Adams", null);

        logger.info("Hi " + newAdmissionStudentOne.getFirstName() + "Please input your reading, writing and math scores");
        logger.info("To see what schools you qaulify for");

        newAdmissionStudentOne.setMathScore(98);
        newAdmissionStudentOne.setReadingScore(98);
        newAdmissionStudentOne.setWritingScore(90);

        logger.info("Your calculated entry score is " + EntryExamScore.calculateEntryExamScore(newAdmissionStudentOne));
        System.out.println("Your qualifying schools are: ");
        printQualifiedSchools(newAdmissionStudentOne);

    };


    private static void printUniversitiesInSystem() {
        int counter = 1;
        for (University university : universityDatabase.getUniversityList()) {
            logger.info(counter + ": " + university.getUniversityName());
            counter++;
        }
    }

    private static void printQualifiedSchools(Student student){

        int counter = 1;
        for (University university : universityDatabase.getUniversityList()) {
            if(university.getClass() == PrivateUniversity.class){
                university = new PrivateUniversity(university.getUniversityName(), university.getCourses(),
                        university.getDepartments(), ((PrivateUniversity) university).isInState());
                if(((PrivateUniversity) university).getEntryExamScoreNeeded() > EntryExamScore.calculateEntryExamScore(student)){
                    logger.info(counter + ": " + university.getUniversityName());
                    counter++;
                }
            }else if(university.getClass() == PublicUniversity.class){
                university = new PublicUniversity(university.getUniversityName(), university.getCourses(),
                        university.getDepartments(), ((PublicUniversity) university).isInState());
                if(((PublicUniversity) university).getEntryExamScoreRequirement() > EntryExamScore.calculateEntryExamScore(student)){
                    logger.info(counter + ": " + university.getUniversityName());
                    counter++;
                }
            }
        }
    }
}

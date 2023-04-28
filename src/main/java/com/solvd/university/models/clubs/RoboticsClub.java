package com.solvd.university.models.clubs;

import com.solvd.university.models.persons.Student;

import java.util.List;

public class RoboticsClub extends Club implements Activity{

    private String clubRobot;

    public RoboticsClub(String clubName, String clubRobot, String meetingTimes) {
     super(clubName, meetingTimes);
     this.clubRobot = clubRobot;
    }

    //Abstract Override
    @Override
    public void displayActivity() {
        System.out.println("We will be creating an underwater robot this semester");
    }

    @Override
    public void doActivity() {
        System.out.println("Robotics Club is now in session");
    }
}

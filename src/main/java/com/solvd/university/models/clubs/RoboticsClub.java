package com.solvd.university.models.clubs;

import com.solvd.university.models.persons.Student;

import java.util.List;

public class RoboticsClub extends Club implements Activity{

    private String clubRobot;

    public RoboticsClub() {
        super.setClubName("RoboticsClub");
        super.setMeetingTimes("M @ 1200 Hours, Tues @ 1200 Hours, Fri @ 1900 Hours");
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

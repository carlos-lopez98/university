package com.solvd.university.models.clubs;

import com.solvd.university.models.persons.Student;

import java.util.List;

public class RoboticsClub extends Club implements Activity{

    private String clubRobotName;

    public RoboticsClub(String clubName, String meetingTimes) {
     super(clubName, meetingTimes);
    }

    public String getClubRobotName() {
        return clubRobotName;
    }

    public void setClubRobotName(String clubRobotName) {
        this.clubRobotName = clubRobotName;
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

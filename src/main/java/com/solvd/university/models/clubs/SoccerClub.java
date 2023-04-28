package com.solvd.university.models.clubs;

import com.solvd.university.models.persons.Student;

import java.util.List;

public class SoccerClub extends Club implements Activity{

    private String teamName;

    public SoccerClub(String clubName, String teamName, String meetingTimes) {
        super(clubName, meetingTimes);

        this.teamName = teamName;
    }

    //Abstract Override
    @Override
    public void displayActivity() {
        System.out.println("We will be playing in teams of 7 per team, and we will participate in local leagues");
    }

    @Override
    public void doActivity() {
        System.out.println("Soccer Club is now in session");
    }
}

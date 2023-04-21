package com.solvd.university.models.clubs;

import com.solvd.university.models.persons.Student;

import java.util.List;

public class SoccerClub extends Club {

    public SoccerClub() {
        super.setClubName("SoccerClub");
        super.setMeetingTimes("Tues @ 1600 Hours, Sat @ 1600 Hours, Sun @ 1200 Hours");
    }

    //Abstract Override
    @Override
    public void displayActivity() {
        System.out.println("We will be playing in teams of 7 per team, and we will participate in local leagues");
    }

}

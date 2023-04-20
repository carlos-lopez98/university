package com.solvd.university.models.clubs;

import com.solvd.university.models.persons.Student;

import java.util.List;

public class SoccerClub extends Club {

    private List<Student> members;
    private String meetingTimes;

    public SoccerClub(String clubName) {
        super(clubName);
        this.meetingTimes = "Tues @ 1600 Hours, Sat @ 1600 Hours, Sun @ 1200 Hours";
    }

    public List<Student> getMembers() {
        return members;
    }

    public void setMembers(List<Student> members) {
        this.members = members;
    }

    public String getMeetingTimes() {
        return meetingTimes;
    }

    public void setMeetingTimes(String meetingTimes) {
        this.meetingTimes = meetingTimes;
    }
}

package com.solvd.university.models.clubs;

import com.solvd.university.models.persons.Student;

import java.util.List;

public class RoboticsClub extends Club{

    private List<Student> members;
    private String meetingTimes;

    public RoboticsClub(String clubName) {
        super(clubName);

        this.meetingTimes = "M @ 1200 Hours, Tues @ 1200 Hours, Fri @ 1900 Hours";
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

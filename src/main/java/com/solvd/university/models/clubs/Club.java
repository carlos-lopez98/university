package com.solvd.university.models.clubs;

import com.solvd.university.models.persons.Student;

import java.util.List;

public abstract class Club {

    private String clubName;
    private List<Student> members;

    //Abstract Method
    public abstract void displayActivity();

    public Club(String clubName) {
        this.clubName = clubName;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public List<Student> getMembers() {
        return members;
    }

    public void setMembers(List<Student> members) {
        this.members = members;
    }
}

package com.solvd.university.models;

public class Club {

    private String clubName;
    private int clubId;
    private int meetingDate;

    public Club(String clubName, int clubId, int meetingDate) {
        this.clubName = clubName;
        this.clubId = clubId;
        this.meetingDate = meetingDate;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public int getClubId() {
        return clubId;
    }

    public void setClubId(int clubId) {
        this.clubId = clubId;
    }

    public int getMeetingDate() {
        return meetingDate;
    }

    public void setMeetingDate(int meetingDate) {
        this.meetingDate = meetingDate;
    }
}

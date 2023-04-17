package main.java.com.solvd.university.models;

public class University {

    private int universityId;
    private String universityName;


    public University(String universityName){
        this.universityName = universityName;
    }


    public int getUniversityId() {
        return universityId;
    }

    public void setUniversityId(int universityId) {
        this.universityId = universityId;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }
}

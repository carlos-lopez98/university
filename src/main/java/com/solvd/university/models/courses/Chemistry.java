package com.solvd.university.models.courses;

public class Chemistry extends Course implements Enroll{

    public Chemistry() {
        super.setCourseName("Chemistry");
    }

    @Override
    public void booksNeeded() {
        System.out.println("Chemistry by Steven Zumdahl");
    }

    @Override
    public void addClassToSchedule() {
        System.out.println("Chemistry has been added to your schedule");
    }
}

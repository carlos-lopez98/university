package com.solvd.university.models.courses;

public class Literature extends Course implements Enroll{

    private String essaysNeeded;

    @Override
    public void booksNeeded() {
        System.out.println("College Language and Literature by Renee H. Shea");
    }

    public Literature() {
        super.setCourseName("Literature");
    }

    @Override
    public void addClassToSchedule() {
        System.out.println("Literature has been added to your schedule");
    }
}

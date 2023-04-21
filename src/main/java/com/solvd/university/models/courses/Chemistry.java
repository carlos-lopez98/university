package com.solvd.university.models.courses;

public class Chemistry extends Course{

    public Chemistry() {
        super.setCourseName("Chemistry");
    }

    @Override
    public void booksNeeded() {
        System.out.println("Chemistry by Steven Zumdahl");
    }
}

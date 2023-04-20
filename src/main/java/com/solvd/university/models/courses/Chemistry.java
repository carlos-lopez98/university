package com.solvd.university.models.courses;

public class Chemistry extends Course{

    public Chemistry(String courseName) {
        super(courseName);
    }

    @Override
    public void booksNeeded() {
        System.out.println("Chemistry by Steven Zumdahl");
    }
}

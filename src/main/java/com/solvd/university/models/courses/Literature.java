package com.solvd.university.models.courses;

public class Literature extends Course{


    @Override
    public void booksNeeded() {
        System.out.println("College Language and Literature by Renee H. Shea");
    }

    public Literature(String courseName) {
        super.setCourseName("Literature");
    }
}

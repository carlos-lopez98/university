package com.solvd.university.models.courses;

public class Calculus extends Course{

    @Override
    public void booksNeeded() {
        System.out.println("Calculus Volume 1 by Morris Kline");
    }

    public Calculus(String courseName) {
       super.setCourseName("Calculus");
    }
}

package com.solvd.university.models.courses;

public class Calculus extends Course implements Enroll{

    private String groupsAssigned;

    @Override
    public void booksNeeded() {
        System.out.println("Calculus Volume 1 by Morris Kline");
    }

    public Calculus() {
       super.setCourseName("Calculus");
    }

    @Override
    public void addClassToSchedule() {
        System.out.println("Calculus has been added to your schedule");
    }
}

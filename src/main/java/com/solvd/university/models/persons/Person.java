package com.solvd.university.models.persons;

import com.solvd.university.models.universities.University;

public abstract class Person {

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String address;

    private University uniAssigned;

    Person(String firstName, String lastName, University uniAssigned){
        this.firstName = firstName;
        this.lastName = lastName;
        this.uniAssigned = uniAssigned;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

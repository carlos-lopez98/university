package com.solvd.university;

import com.solvd.university.models.universities.University;
import com.sun.source.tree.ArrayAccessTree;

import java.util.ArrayList;
import java.util.List;

public final class Generate {

    private final List<String> PublicUniversityNames = new ArrayList<>(){
        {
            add("Cal State Long Beach");
            add("Cal State San Diego");
            add("Cal State San Francisco");
            add("Cal State Fresno");
            add("CalTech");
        }
    };
    private final List<String> PrivateUniversityNames = new ArrayList<>(){
        {
            add("Stanford University");
            add("UCLA");
            add("University of the Pacific");
            add("USC");
            add("Santa Clara University");
        }
    };



    public static University generateUni(){

    }
}
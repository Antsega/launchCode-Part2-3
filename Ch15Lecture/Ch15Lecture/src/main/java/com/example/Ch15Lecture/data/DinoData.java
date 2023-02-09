package com.example.Ch15Lecture.data;

import java.util.ArrayList;
import com.example.Ch15Lecture.models.Dinosaur;

public class DinoData {
    // here we have our list of that we will use to store all of our dinos
    //      that we want to add to the application
    public static ArrayList<Dinosaur> allDinos = new ArrayList<>() ;

    public static ArrayList<Dinosaur> getAllDinos() {
        return allDinos;
    }
}

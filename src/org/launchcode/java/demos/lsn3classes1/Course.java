package org.launchcode.java.demos.lsn3classes1;


import java.util.ArrayList;

public class Course {
    private int numCredits;
    private String courseName;
    private ArrayList<String> studentNames;

    public Course ( int numCredits, String courseName, ArrayList<String> studentNames){
        this.numCredits = numCredits;
        this.courseName = courseName;
        this.studentNames = studentNames;
    }

    public void setStudentNames(ArrayList<String> studentNames) {
        this.studentNames = studentNames;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setNumCredits(int numCredits) {
        this.numCredits = numCredits;
    }

    public String getCourseName(String courseName){
        return this.courseName;
    }

    public int getNumCredits(int numCredits){
        return this.numCredits;
    }
    public ArrayList<String> getStudentNames(ArrayList<String> studentNames){
        return this.studentNames;
    }
}

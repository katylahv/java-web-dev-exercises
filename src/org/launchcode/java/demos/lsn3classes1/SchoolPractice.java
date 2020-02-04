package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class SchoolPractice {
    public static void main(String[] args) {

        Student katy = new Student("Katherine Ross", 19942, 1, 4.0);
        Student jenny = new Student("Jennifer Ross", 1942, 1, 4.0);
        Student howie = new Student("Howard Ross", 9942, 1, 4.0);
        ArrayList<String> roster = new ArrayList<String>();
        roster.add(katy.getName());
        roster.add(jenny.getName());
        roster.add(howie.getName());
        Course socialStudies = new Course(3,"History",roster);
        System.out.println(socialStudies.getStudentNames(roster));

    }
}

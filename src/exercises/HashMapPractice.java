package exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<String, Integer> studentMap = new HashMap<>();
        String studentName;
        Scanner input = new Scanner(System.in);
        System.out.println("Student Info: (Press ENTER to finish)");
        do {
            // prompt for student name
            System.out.println("Student's name: ");
            studentName = input.nextLine();
             // continue if valid name
            if (!studentName.equals("")){
                // prompt for student id
                System.out.println("Student's ID#");
                int studentID = input.nextInt();
                studentMap.put(studentName, studentID);

                input.nextLine();
            }
        } while (!studentName.equals(""));

        // print roster
        System.out.println("Current Roster:");
        for (Map.Entry<String, Integer> student : studentMap.entrySet()) {
            System.out.println(student.getKey() + " ID Number: " + student.getValue() + ".");
        }
        System.out.println("\nRoster complete.");
    }
}

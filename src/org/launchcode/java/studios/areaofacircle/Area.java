package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a radius: ");
        double radius = input.nextDouble();
//
            System.out.print("The area of a circle of radius " + radius + " is: " + Circle.getArea(radius));
        //}
    }
}

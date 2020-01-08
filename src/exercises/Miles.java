package exercises;

import java.util.Scanner;

public class Miles {
    public Miles(){
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        double miles = input.nextDouble();
        System.out.println("How much Gas have you used?");
        double gas = input.nextDouble();
        double mpg = miles / gas;
        System.out.println("Your miles per gallon are " + mpg);
    }
}

package exercises;
import java.util.Scanner;
public class RectangleArea {
    public RectangleArea(){
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of your rectangle?");
        double length = input.nextDouble();
        System.out.println("What is the width of your rectangle?");
        double width = input.nextDouble();
        double area = length * width;
        System.out.println("The are of your rectangle with length of " + length + " and width of " + width +" is " + area +".");
    }
}

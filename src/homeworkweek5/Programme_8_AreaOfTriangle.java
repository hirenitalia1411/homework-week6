package homeworkweek5;

    /**
     *  Write a program to calculate the area of a triangle.
     */

import java.util.Scanner;

public class Programme_8_AreaOfTriangle {

    // creating method which accepts two arguments and returns NULL
    public static void area(int h, int b){

        int area = (b * h) / 2; // logic to calculate the area of triangle
        System.out.println("The area of the triangle with base length " + b + " and height " + h + " is " + area);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // creation of scanner object
        System.out.println("Please enter a height of the triangle : ");
        int height = sc.nextInt(); // entered height is stored in height variable
        System.out.println("Please enter a base length of the triangle : ");
        int baseLength = sc.nextInt(); // entered base length is stored into baseLength variable
        area(height, baseLength); // calling a area method by passing two arguments
    }
}

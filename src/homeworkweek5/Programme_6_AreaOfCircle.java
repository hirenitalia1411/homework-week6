package homeworkweek5;

    /**
     *  Write a program to enter any radius value of the circle and find out the area.
     *  (Formula of Area A=PI*r*r).
     */

import java.util.Scanner;

public class Programme_6_AreaOfCircle {

    static final float PI = 3.141592F; // declared PI as constant by using final as its value is fixed

    // creation of static method which returns nothing but accepts arguments
    public static void areaOfCircle(int r){
        float area = PI * r * r;
        System.out.println("Are of the Circle for the radius " + r +" = " + area);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // creation of scanner object
        System.out.println("Please enter the radius of circle as a positive whole number : ");
        int radius = sc.nextInt(); // user entered radius is stored into the radius variable
        areaOfCircle(radius); // calling the function by passing the argument
        sc.close(); // closing the scanner object and clearing the memory
    }
}

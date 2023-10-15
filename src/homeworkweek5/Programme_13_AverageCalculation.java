package homeworkweek5;

    /**
     *          Write a Java program that takes three numbers as input to calculate and
     *          print the average of the numbers.
     */

import java.util.Scanner;

public class Programme_13_AverageCalculation {

    // creating a method, which accepts 3 arguments and returns NULL
    public static void average(int a, int b, int c){
        float averageResult = (float) (a + b + c) / 3; // done the type casting to get the accurate result
        System.out.println("Average of " + a + ", " + b + ", and " + c + " is " + averageResult);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // scanner object is created to take the numbers from users
        System.out.print("Enter 1st Number positive whole number: ");
        int firstNumber = sc.nextInt(); // 1st number is stored in to firstNumber variable
        System.out.print("Enter 2nd Number positive whole number: ");
        int secondNumber = sc.nextInt(); // 2nd number is stored in to secondNumber variable
        System.out.print("Enter 3rd Number positive whole number: ");
        int thirdNumber = sc.nextInt(); // 3rd number is stored in to thirdNumber variable

        //calling a function by passing 3 numbers as an arguments
        average(firstNumber, secondNumber, thirdNumber);
    }
}

package homeworkweek5;

    /**
     *  Write a program for a calculator with addition, subtraction, multiplication and division
     *  methods all with parameters and use string concatenation methods.
     *  (Note: Two static and Two instance methods.)
     */

import java.util.Scanner;

public class Programme_5_Calculator {

    static int firstNumber; // declaring and initialising static variable
    static int secondNumber; // declaring and initialising static variable

    public static void main(String[] args) {
        Programme_5_Calculator obj = new Programme_5_Calculator(); // creation of new object
        // creation of scanner object to take the input from user
        Scanner sc = new Scanner(System.in); // creation of scanner object
        System.out.println("Please Enter 1st Integer Number : ");
        firstNumber = sc.nextInt(); // users 1st integer number is stored in firstNumber variable
        System.out.println("Please Enter 2nd Integer Number, which is Less than 1st Number & non-zero : ");
        secondNumber = sc.nextInt(); // users 2nd integer number is stored in secondNumber variable
        obj.addition(); // calling instance addition method by object as main method is static
        obj.subtraction(); // calling instance subtraction method by object as main method is static
        multiplication(); // calling static multiplication method directly as main method is static
        division(); // calling static division method directly as main method is static
        sc.close(); // closing the scanner object and clearing the memory
    }

    public void addition(){
        int additionResult = firstNumber + secondNumber;
        System.out.println("Addition of " + firstNumber + " and " + secondNumber + " = " + additionResult);
    }

    public void subtraction(){
        int subtractionResult = firstNumber - secondNumber;
        System.out.println("Subtraction of " + firstNumber + " and " + secondNumber + " = " + subtractionResult);
    }

    public static void multiplication(){
        int multiplicationResult = firstNumber * secondNumber;
        System.out.println("Multiplication of " + firstNumber + " and " + secondNumber + " = " + multiplicationResult);
    }

    public static void division(){
        int divisionResult = firstNumber / secondNumber;
        /**
         * can use below statement as well for accurate result but need to do type casting
         * float divisionResult = (float)firstNumber / (float)secondNumber;
         */
        System.out.println("Division of " + firstNumber + " and " + secondNumber + " = " + divisionResult);
    }
}

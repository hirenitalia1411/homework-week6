package homeworkweek5;

    /**
     *      Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
     *          Test Data:
     *              Input first number: 125
     *              Input second number: 24
     *          Expected Output :
     *              125 + 24 = 149
     *              125 - 24 = 101
     *              125 x 24 = 3000
     *              125 / 24 = 5
     *              125 mod 24 = 5
     */

import java.util.Scanner;

public class Programme_18_Calculations {

    public static void addition(int a, int b){
        int sum = a + b;
        System.out.println(a + " + " + b + " = " + sum);
    }

    public static void subtraction(int a, int b){
        int sub = a - b;
        System.out.println(a + " - " + b + " = " + sub);
    }

    public static void multiplication(int a, int b){
        int mul = a * b;
        System.out.println(a + " X " + b + " = " + mul);
    }

    public static void division(int a, int b){
        int div = a / b;
        System.out.println(a + " / " + b + " = " + div);
    }

    public static void modulus(int a, int b){
        int mod = a % b;
        System.out.println(a + " mod " + b + " = " + mod);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // creating scanner object to take the input from user
        System.out.print("Input first number: ");
        int firstNumber = sc.nextInt(); // first number is taken from the user and stored
        System.out.print("Input second number: ");
        int secondNumber = sc.nextInt();  // second number is taken from the user and stored

        addition(firstNumber, secondNumber); // calling addition method
        subtraction(firstNumber, secondNumber); // calling subtraction method
        multiplication(firstNumber, secondNumber); // calling multiplication method
        division(firstNumber, secondNumber); // calling division method
        modulus(firstNumber, secondNumber); // calling modulus method
    }
}

package homeworkweek5;

    /**
     *       Write a Java program to add two binary numbers.
     *          Input Data:
     *               Input first binary number: 10
     *               Input second binary number: 11
     *          Expected Output:
     *               Sum of two binary numbers: 101
     */

import java.util.Scanner;

public class Programme_16_AddBinary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // creation on scanner object to accept the inputs from user
        System.out.print("Input first binary number: ");
        String firstNumber = sc.next(); // user entered first number is stored into variable as a string
        System.out.print("Input second binary number: ");
        String secondNumber = sc.next(); // user entered second number is stored into variable as a string

        addBinary(firstNumber, secondNumber); // calling a method to add binary numbers

        sc.close(); // closing the scanner object
    }

    // creation of method, which accepts two variable and returns NULL
    public static void addBinary(String fs, String ss){
        /**
         * convert the string(first argument) into radix 2 (binary: second argument), then convert the result into integer
         * which is stored into int type variable as num1 and num2 as mentioned below
         */
        int num1 = Integer.parseInt(fs, 2); // convert the string into radix 2, and stored into int type variable
        int num2 = Integer.parseInt(ss, 2); // convert the string into radix 2, and stored into int type variable
        int sum = num1 + num2; // addition of two integers
        String result = Integer.toBinaryString(sum); // convert the resultant integer into binary
        System.out.print("Sum of binary numbers: " +result); // print the resultant binary number
    }
}

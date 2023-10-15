package homeworkweek5;

    /**
     *      Write a Java program to add two binary numbers.
     *          Input Data:
     *              Input first binary number: 10
     *              Input second binary number: 11
     *          Expected Output:
     *              Sum of two binary numbers: 101
     */

import java.util.Scanner;

public class Programme_17_DecimalToBinary {

    // creating a method, which accepts one argument and returns NULL
    public static void conversion (int number){
        // calling toBinaryString method from pre-defined Integer class for the conversion
        String binaryNumber = Integer.toBinaryString(number);
        System.out.print("Binary number is: " +binaryNumber); // printing binary number
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // creation of scanner object to take the input from user
        System.out.print("Input a Decimal Number : ");
        int decimalNumber = sc.nextInt(); // user entered data is stored into a int type variable

        conversion(decimalNumber); // calling a method, which converts decimal to binary number
        sc.close(); // closing the scanner object
    }
}

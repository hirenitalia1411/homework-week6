package homeworkweek5;

    /**
     *      Write a Java program that takes a number as an input and prints its multiplication table up to 10.
     *      Test Data: Input a number: 8
     *      Expected Output :
     *          8 x 1 = 8
     *          8 x 2 = 16
     *          8 x 3 = 24
     *           ...
     *          8 x 10 = 80
     */

import java.util.Scanner;

public class Programme_10_MultiplicationTable {

    // creation of method which print the table of user entered number
    public static void printTable(byte number){
        System.out.println(number + " X 1 = " + number);
        System.out.println(number + " X 2 = " + number*2);
        System.out.println(number + " X 3 = " + number*3);
        System.out.println(number + " X 4 = " + number*4);
        System.out.println(number + " X 5 = " + number*5);
        System.out.println(number + " X 6 = " + number*6);
        System.out.println(number + " X 7 = " + number*7);
        System.out.println(number + " X 8 = " + number*8);
        System.out.println(number + " X 9 = " + number*9);
        System.out.println(number + " X 10 = " + number*10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // creation of scanner object
        System.out.print("Input a number: "); // message for the user
        byte tableOf = sc.nextByte(); // entered number is stored in to byte variable as accepted as a byte by nextByte
        printTable(tableOf); // calling a printTable method by passing one value
        sc.close(); // closing a scanner object
    }
}

package homeworkweek5;

    /**
     *      Write a Java program to swap two variables.
     */

import java.util.Scanner;

public class Programme_15_Swap {

    //creating a method, which swap two numbers
    public void swapVariable(int a, int b){
        System.out.println("Output Before Swapping: a = " + a + " and b = " + b);
        int temp; // declaring temporary variable
        temp = a; // moving value of a into temp
        a = b; // moving value of b into a
        b = temp; //moving value of temp (nothing but a's value) into b
        System.out.println("Output After Swapping: a = " + a + " and b = " + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // creation of scanner object
        System.out.print("Enter 1st Variable Value: ");
        int firstValue = sc.nextInt(); // user entered first value is stored into firstValue variable
        System.out.print("Enter 2nd Variable Value: ");
        int secondValue = sc.nextInt(); // user entered second value is stored into secondValue variable

        Programme_15_Swap obj = new Programme_15_Swap(); // creation of object to call methods as it is instance method
        obj.swapVariable(firstValue, secondValue); // calling a method by object
    }
}

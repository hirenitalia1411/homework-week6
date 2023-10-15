package homeworkweek5;

    /**
     *  Write a program to convert the upper case to lower case.
     */

import java.util.Scanner;

public class Programme_9_UcToLc {

    // creating a static function, which accepts one argument and returns NULL
    public static void conversion(String upperCaseString){
        /**
         *  case conversion is possible by .toLowerCase() or .toUpperCase() functions,
         *  which are pre-defined under String class
         */
        String lowerCaseString = upperCaseString.toLowerCase();
        System.out.println("\n" + "The entered Uppercase string is as below" + "\n" + upperCaseString);
        System.out.println("\n" + "The converted Lowercase string is as below" + "\n" + lowerCaseString);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // creation of scanner object
        System.out.println("Please enter a string with all letter in Uppercase : ");
        String inputString = sc.nextLine(); // input string is stored into inputString variable
        conversion(inputString); // calling conversion method by passing inputString as an argument
        sc.close(); // closing the scanner object
    }
}

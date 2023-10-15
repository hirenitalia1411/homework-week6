package homeworkweek5;
    /**
     *   Write a program to insert any temperature value in degree Fahrenheit and convert to degree Celsius
     *   ((F − 32) × 5/9 = 0°C).
     */

import java.util.Scanner;

public class Programme_7_ConvertTemp {

    public static void fahrenToCels(int fahren){
        float cels = ((fahren - 32) * ((float)5  / (float)9));
        /**
         * always output will be zero, because 5 and 9 are integers, and division value is 0,
         * which is multiply with any number makes output 0
         * so need to do type casting for 5 and 9 to get the accurate result
         */
        System.out.println("The equivalent degree celsius valur for " + fahren + " fahrenheit is " + cels);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // creation of scanner object
        System.out.println("Please enter the temperature in fahrenheit : ");
        int fahren = sc.nextInt(); // entered value is stored into fahren variable
        fahrenToCels(fahren);  // calling method where actual conversion fundamentals is written by passing the fahren value
    }
}

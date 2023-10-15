package homeworkweek5;

    /**     Write a Java programme using the following steps.
    *        2.1 Declare two static variables
    *        2.2 Declare one static method
    *        2.3 Call both static variables into the static method inside the print statement.
    *        2.4 Declare the Main method.
    *        2.5 Call the static method into the Main method and Run the programme.
    */

// creation of class
public class Programme_2 {
    static int a = 10; // declaring and initialising static variable1
    static int b = 20; // declaring and initialising static variable2

    //creation of static method
    public static void prgm2(){
        /**
         * calling static variables into a static method is by direct or by classname method
         */
        System.out.println("First Static variable = " + a );
        System.out.println("Second Static Variable = " + Programme_2.b );
    }

    // creation of main method
    public static void main(String[] args) {
        prgm2(); // calling static method in to static main method by direct calling
    }
}

package homeworkweek5;
        /**     Write a Java programme using the following steps.
            *   1.1 Declare two instance variables.
            *   1.2 Declare one instance method.
            *   1.3 Call both instance variables into the instance method inside the print statement.
            *   1.4 Declare the Main method.
            *   1.5 Call the above instance method into the Main method and Run the programme.
        */

// creation of class
public class Programme_1 {
    int var1 = 10; // declaring and initialising instance variable1
    int var2 = 20; // declaring and initialising instance variable2

    // creation of instance method
    public void prgm1(){
        /**
         * calling instance variables into a instance method is by direct or by classname method
         */
        System.out.println("First Instance Variable = " + var1);
        System.out.println("Second Instance Variable = " + var2);
    }

    // creation of main method
    public static void main(String[] args) {
        Programme_1 obj = new Programme_1(); // creation of object to call instance method into static method
        obj.prgm1(); // calling instance class by defined object
    }
}
package homeworkweek5;

    /**     Write a Java programme using the following steps.
     *      4.1 Declare two instance and two static variables.
     *      4.2 Declare one instance method.
     *      4.3 Declare one static method.
     *      4.4 Call all four instance and static variables into both instance and static methods inside the
     *          print statement.
     *      4.5 Declare the Main method.
     *      4.6 Call both instance and static methods into the Main method and run the programme.
     */
public class Programme_4 {

    int a = 10; // declaring and initialising instance variable
    String name = "Hiren"; // declaring and initialising instance variable
    static int b = 30; // declaring and initialising static variable
    static float c = 125.5F; // declaring and initialising static variable

    // creation of instance method
    public void m1(){
        /**
         *  calling instance and static variables directly as the method is instance method
         *  another method to call all 4 variables is by using classname
         */
        System.out.println("1st instance variable in instance method = " + a);
        System.out.println("2nd instance variable in instance method = " + name);
        System.out.println("1st static variable in instance method = " + b);
        System.out.println("2nd static variable in instance method = " + c);
    }

    // creation of static method
    public static void m2() {
        /**
         *  calling instance variables by object as the method is static method
         *  calling static variables directly as the method is static method
         */
        Programme_4 obj = new Programme_4();
        System.out.println("1st instance variable in static method = " + obj.a);
        System.out.println("2nd instance variable in static method = " + obj.name);
        System.out.println("1st static variable in static method = " + b);
        System.out.println("2nd static variable in static method = " + c);
    }

    // creation of main method
    public static void main(String[] args) {
        Programme_4 obj = new Programme_4(); // creation of object to call instance method in static main method
        obj.m1(); // calling instance method by object as main is the static
        m2(); // calling static method directly as main method is static
    }

}

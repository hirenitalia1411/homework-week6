package homeworkweek5;

    /**     Write a Java programme using the following steps.
    *        3.1 Declare one instance and one static variable.
    *        3.2 Declare one instance method.
    *        3.3 Declare one static method.
    *        3.4 Call both instance and static variables into both instance and static methods inside the
    *            print statement.
    *        3.5 Declare the Main method.
    *        3.6 Call both instance and static methods into the Main method and run the programme.
    */

    // creation of class
public class Programme_3 {
    int a = 20; // declaring and initialising instance variable1
    static int b = 20; // declaring and initialising static variable1

    // creation of instance method
    public void m1(){
        //printing instance variable by direct because of the instance method
        System.out.println("Calling instance variable in instance class = " + a);
        //printing static variable by direct as variable is static
        System.out.println("Calling static variable in instance class = " + b);
    }

    // creation of static method
    public static void m2(){
        Programme_3 obj = new Programme_3(); // creation of object
        // printing instance variable by object because the method is static
        System.out.println("Calling instance variable in static class = " + obj.a);
        // printing static variable by direct as method id static
        System.out.println("Calling static variable in static class = " + b);
    }

    //creation of main method
    public static void main(String[] args) {
        Programme_3 obj = new Programme_3(); // creation of object
        obj.m1(); // calling instance method by object as the main method is static
        m2(); // calling static method by direct as main method is static
    }
}

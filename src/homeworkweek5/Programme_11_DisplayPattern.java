package homeworkweek5;

    /**
     *       Write a Java program to display the following pattern.
     *          Sample Pattern :
     *              J   a v  v a
     *              J  a a v v a a
     *              J J aaaaa  V V  aaaaa
     *              J J a  a  V a    a
     */

public class Programme_11_DisplayPattern {

    // creation of instance method, which print the given patterns
    public void printPattern(){
        System.out.println("J   a v  v a");
        System.out.println("J  a a v v a a");
        System.out.println("J J aaaaa  V V  aaaaa");
        System.out.println("J J a  a  V a    a");
    }

    public static void main(String[] args) {
        // creation of object for calling instance method in static method
        Programme_11_DisplayPattern obj = new Programme_11_DisplayPattern();
        obj.printPattern(); // calling instance method by object as main is the static method
    }
}

package homeworkweek5;

    /**
     *        Write a Java program to compute the specified expressions and print the output.
     *          Test Data:  ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
     *          Expected Output : 2.138888888888889
     */

public class Programme_12_PrintExpression {

    // creation of static method, which print the result of given expression
    public static void printExpression(){
        double result = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
        System.out.println(result);
    }

    public static void main(String[] args) {
        // no need to create an object for calling static method
        printExpression(); // calling static method directly as main is the static method
    }
}

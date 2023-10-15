package homeworkweek5;

    /**
     *    Write a Java program to print the area and perimeter of a rectangle.
     *          Test Data: Width = 5.6 Height = 8.5
     *          Expected Output:
     *                  Area is 5.6 * 8.5 = 47.60
     *                  Perimeter is 2 * (5.6 + 8.5) = 28.20
     */

public class Programme_14_Rectangle {

    static float width = 5.6F; // declaring and initialising width variable
    static float height = 8.5F; // declaring and initialising height variable

    // method to calculate Area
    public static void calculateArea (){
        System.out.println("Area is " + width + " * " + height + " = " + width*height);
    }

    // method to calculate Perimeter
    public static void calculatePerimeter(){
        System.out.println("Perimeter is 2 * (" + width + " + " + height + ") = " + 2*(width+height));
    }

    public static void main(String[] args) {
        calculateArea(); // calling a function directly as it is declared as static
        calculatePerimeter(); // calling a function directly as it is declared as static
    }
}

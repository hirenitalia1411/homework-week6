package homeworkweek5;

    /**
     *      Write a Java Program to print a slip for petrol filling station.
     */
public class Programme_20_PrintSlip {

    public static void printing(){
        System.out.println("\"+------------------------+\"");
        System.out.println("\"|                        |\"");
        System.out.println("\"|      CORNER STORE      |\"");
        System.out.println("\"|                        |\"");
        System.out.println("\"| 2015-03-29   04:38PM   |\"");
        System.out.println("\"|                        |\"");
        System.out.println("\"| Gallons:        10.870 |\"");
        System.out.println("\"| Price/gallon: $  2.089 |\"");
        System.out.println("\"|                        |\"");
        System.out.println("\"| Fuel total: $   22.71  |\"");
        System.out.println("\"|                        |\"");
        System.out.println("\"+------------------------+\"");
    }

    public static void main(String[] args) {
        printing(); // calling a static function to generate a slip
    }
}

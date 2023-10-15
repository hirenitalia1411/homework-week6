package homeworkweek5;

    /**
     *     Write a Java program to convert a given string into lowercase.
     *          Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
     *          Output: the quick brown fox jumps over the lazy dog.
     */
public class Programme_19_StringToLowercase {

    // creating a method, where conversion takes place
    public static void convertToLowercase() {
        String s1 = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG."; // given string
        String result = s1.toLowerCase(); // actual conversion from Uppercase to Lowercase
        System.out.println(result); // print final output
    }
    public static void main(String[] args) {
        convertToLowercase(); // calling a method for conversion
    }
}

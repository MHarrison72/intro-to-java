package dataTypes;

/*
    https://docs.oracle.com/javase/tutorial/java/data/strings.html
 */
public class Strings {

    public static void main(String[] args) {
        /*
            This is called a 'string literal'
            A series of characters in your code that is enclosed in double quotes

            String objects are immutable, which means that once created, their values cannot be changed.
         */
        String string = "Some string message";

        System.out.println("Value of 'string' : " + string);

        // We can also create a String Object this way
        String stringObject = new String("Some string message");

        /*
            The only real difference between the 2 is how they are allocated in memory
            When seeing if 2 things are equivalent, we have 2 options
            1) Using the == operator
                - when comparing primitives, the == will compare values
                - however, when one of the elements being compared is an Object
                  then == will check the memory address of the 2 elements
            2) Using the .equals method
                - This verifies that the value of the things are equivalent
         */

        if (string == "Some string message") {
            System.out.println("String literals share a memory address due to String pooling.");
        }

        if (string.equals(stringObject)) {
            System.out.println("The value of the Literal and the Object are equivalent.");
        }

        // We use the ! to state NOT
        if (string != stringObject) {
            System.out.println("The Literal and the Object do not share the same memory address");
        }

        if (!string.equals(stringObject)) {
            System.out.println("This will never print out because value of the Literal and Object are equivalent.");
        }
    }
}
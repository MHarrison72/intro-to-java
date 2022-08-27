package dataTypes;

/*
    https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
    https://docs.oracle.com/javase/tutorial/java/data/numbers.html
 */
public class Integers {

    public static void main(String[] args) {
        /*
            These are examples of integer numbers
            Which have a minimum value of (-2,147,483,648) and a maximum value of (2,147,483,647)

            The only differences between the primitive 'int' and the Object 'Integer' are
            1) you can instantiate the Object version by parsing a string value
            2) you can convert the integerWrapper into other numeric primitive forms
                - integerWrapper.byteValue() for example
            3) the wrapper class has a built-in compareTo method
                - integerWrapper.compareTo()
         */
        int integer = 10;
        Integer integerWrapper = Integer.parseInt("10");

        compareIntegers(integer, integerWrapper);

        System.out.println();
        System.out.println("Value of 'integer' : " + integer);
        System.out.println("Value of 'integerWrapper' : " + integerWrapper);
        System.out.println();
        System.out.println("Result of 'integer' plus 10 : " + (integer + 10));
        System.out.println("Result of 'integerWrapper' plus 52 : " + (integer + 52));
        System.out.println();
        System.out.println("Result of 'integer' divided by 2 : " + (integer / 2));
        System.out.println("Result of 'integerWrapper' divided 3 : " + (integer / 3));
        System.out.println();
        System.out.println("Result of 'integer' modulo 2 : " + (integer % 2));
        System.out.println("Result of 'integerWrapper' modulo 3 : " + (integer % 3));
    }

    private static void compareIntegers(int integer, Integer integerWrapper) {
        System.out.println();

        if (integer == integerWrapper) {
            System.out.println("The value of 'integer' and 'integerWrapper' are the same.");
        }

        if (integerWrapper.compareTo(10) == 0) {
            System.out.println("The value of 'integerWrapper' and the compared int are the same.");
        }

        if (integerWrapper.compareTo(5) > 0) {
            System.out.println("The value of 'integerWrapper' is greater than the compared value.");
        }

        if (integerWrapper.compareTo(15) < 0) {
            System.out.println("The value of 'integerWrapper' is less than the compared value.");
        }
    }
}

package dataTypes;

/*
    https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
    https://docs.oracle.com/javase/tutorial/java/data/numbers.html
 */
public class Doubles {

    public static void main(String[] args) {
        /*
            These are examples of decimal numbers
            In Java, they are considered 'floating point numbers'
            They have a large range of acceptable values

            The differences between the primitive and Object versions are similar to Integers

            When doing math with doubles, you can occasionally get invalid decimal values
            That's why we have the BigDecimal class for monetary calculations
         */
        double dub = 50.25;
        Double dubWrapper = Double.parseDouble("50.25");

        compareDoubles(dub, dubWrapper);

        System.out.println();
        System.out.println("Value of 'dub' : " + dub);
        System.out.println("Value of 'dubWrapper' : " + dubWrapper);
        System.out.println();
        System.out.println("Result of 'dub' plus 10.0 : " + (dub + 10.0));
        System.out.println("Result of 'dubWrapper' plus 52.0 : " + (dubWrapper + 52.0));
        System.out.println();
        System.out.println("Result of 'dub' divided by 2.0 : " + (dub / 2.0));
        System.out.println("Result of 'dubWrapper' divided 3.0 : " + (dubWrapper / 3.0));
        System.out.println();
        System.out.println("Result of 'dub' modulo 2.0 : " + (dub % 2.0));
        System.out.println("Result of 'dubWrapper' modulo 3.0 : " + (dubWrapper % 3.0));
        System.out.println();
        System.out.println("Example floating point error : " + 27.8625/1000.0);
    }

    private static void compareDoubles(double dub, Double dubWrapper) {
        System.out.println();

        if (dub == dubWrapper) {
            System.out.println("The value of 'dub' and 'dubWrapper' are the same.");
        }

        if (dubWrapper.compareTo(50.25) == 0) {
            System.out.println("The value of 'dubWrapper' and the compared double are the same.");
        }

        if (dubWrapper.compareTo(5.00) > 0) {
            System.out.println("The value of 'dubWrapper' is greater than the compared value.");
        }

        if (dubWrapper.compareTo(500.00) < 0) {
            System.out.println("The value of 'dubWrapper' is less than the compared value.");
        }
    }
}

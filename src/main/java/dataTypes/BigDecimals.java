package dataTypes;

import java.math.BigDecimal;

/*
    https://docs.oracle.com/javase/8/docs/api/java/math/BigDecimal.html
 */
public class BigDecimals {

    public static void main(String[] args) {
        /*
            These are examples of BigDecimal numbers
            Unlike int and double, there is no primitive version of this class
         */
        BigDecimal bigDecimal = new BigDecimal(100.00);
        BigDecimal bigDecimalFromString = new BigDecimal("100.00");

        compareBigDecimals(bigDecimal, bigDecimalFromString);

        /*
            BigDecimals can be used to represent very small or very large numbers
         */
        BigDecimal verySmall = new BigDecimal("-1.23E-12");
        BigDecimal veryLarge = new BigDecimal("-1.23E12");

        formatBigDecimalAsString(verySmall, veryLarge);

        /*
            TODO add math and rounding examples
         */
    }

    private static void compareBigDecimals(BigDecimal bigDecimal, BigDecimal bigDecimalFromString) {
        System.out.println();

        if (bigDecimal != bigDecimalFromString) {
            System.out.println("The memory address of 'bigDecimal' and 'bigDecimalFromString' are not the same");
        }

        if (bigDecimal.equals(bigDecimalFromString)) {
            System.out.println("The value of 'bigDecimal' and 'bigDecimalFromString' are the same.");
        }

        if (bigDecimal.compareTo(BigDecimal.valueOf(100.00)) == 0) {
            System.out.println("The value of 'bigDecimal' and the compared BigDecimal are the same.");
        }

        if (bigDecimal.compareTo(BigDecimal.valueOf(5.00)) > 0) {
            System.out.println("The value of 'bigDecimal' is greater than the compared value.");
        }

        if (bigDecimal.compareTo(BigDecimal.valueOf(500.00)) < 0) {
            System.out.println("The value of 'bigDecimal' is less than the compared value.");
        }
    }

    private static void formatBigDecimalAsString(BigDecimal verySmall, BigDecimal veryLarge) {
        System.out.println();
        System.out.println("Value of 'verySmall' : " + verySmall);
        System.out.println("Value of 'verySmall' - plainString : " + verySmall.toPlainString());
        System.out.println("Value of 'verySmall' - engineeringString : " + verySmall.toEngineeringString());
        System.out.println();
        System.out.println("Value of 'veryLarge' : " + veryLarge);
        System.out.println("Value of 'veryLarge' - plainString : " + veryLarge.toPlainString());
        System.out.println("Value of 'veryLarge' - engineeringString : " + veryLarge.toEngineeringString());
    }
}

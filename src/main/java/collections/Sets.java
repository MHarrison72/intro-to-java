package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Sets {

    public static void main(String[] args) {
        /*
            Sets only contain unique values, unlike Lists/Arrays which can contain duplicates

            Just like with Lists, we must also specify the type of data that will be stored in the Set
            We do this by placing the type of element in-between the <> symbols
         */
        Set<String> stringSet = new HashSet<>();
        stringSet.add("value");
        stringSet.add("anotherValue");
        stringSet.add("value");

        System.out.println();
        System.out.println("Value of 'stringSet' : " + stringSet);

        System.out.println();
        // We can also remove elements from the Set
        if (stringSet.remove("value")) {
            System.out.println("Removed 'value' from 'stringSet'.");
        }
        System.out.println();
        System.out.println("Value of 'stringSet' : " + stringSet);

        System.out.println();
        // Contains also works the same way as Lists
        if (stringSet.contains("anotherValue")) {
            System.out.println("The 'stringSet' contains 'anotherValue'.");
        }

        Set<String> otherSet = new HashSet<>(Arrays.asList("value", "anotherValue"));
        System.out.println();
        System.out.println("Values in 'otherSet' : " + otherSet);
        if (!stringSet.containsAll(otherSet)) {
            System.out.println("The 'stringSet' doesn't contain all the values in 'otherSet'.");
        }
        if (otherSet.containsAll(stringSet)) {
            System.out.println("The 'otherSet' contains all the values in 'stringSet'.");
        }

        // We can also remove all the elements at once
        stringSet.clear();
        System.out.println();
        System.out.println("The 'stringSet' is now empty : " + stringSet);
    }
}

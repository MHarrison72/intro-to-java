package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists {

    public static void main(String[] args) {
        /*
            As we saw in the Characters.java class,
            we can use Arrays to hold multiple of the same type of thing

            One of the problems with Arrays, is that you need to know the size up front
            With a List, it will dynamically allocate more memory as you add elements

            We must also specify what type of data will be stored in the List
            We do this by placing the type of element in-between the <> symbols
         */
        List<String> stringList = new ArrayList<>();
        stringList.add("addedFirst");
        stringList.add(0, "forcedThisElementToZeroPosition");
        stringList.add("someOtherInfo");

        /*
            When we attempted to print all the values in a char array
            we saw that the memory address of the array was displayed instead

            We do not have this same issue when using Collections
         */
        System.out.println();
        System.out.println("Value of 'stringList' : " + stringList);

        /*
            We can also easily remove an element from the list
            Similar to adding, we can also remove by value or specific element position
         */
        System.out.println();
        if (stringList.remove("addedFirst")) {
            System.out.println("Removed 'addedFirst' from 'stringList'.");
        }
        String firstPosition = stringList.remove(0);
        if (firstPosition != null) {
            System.out.println("Removed '" + firstPosition + "' from 'stringList'.");
        }
        System.out.println("Remaining values in 'stringList' : " + stringList);

        // Another benefit of Collections is being able to tell if a value exists in the Collection
        System.out.println();
        if (stringList.contains("someOtherInfo")) {
            System.out.println("The 'stringList' contains the value 'someOtherInfo'.");
        }

        // Or to see if all the values in Collection B exist in Collection A
        List<String> otherList = new ArrayList<>(Arrays.asList("someOtherInfo", "notInStringList"));
        System.out.println();
        System.out.println("Values in 'otherList' : " + otherList);
        if (!stringList.containsAll(otherList)) {
            System.out.println("The 'stringList' doesn't contain all the values in 'otherList'.");
        }
        if (otherList.containsAll(stringList)) {
            System.out.println("The 'otherList' contains all the values in 'stringList'.");
        }

        // We can also remove all the elements at once
        stringList.clear();
        System.out.println();
        System.out.println("The 'stringList' is now empty : " + stringList);
    }
}
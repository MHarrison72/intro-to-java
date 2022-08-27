package loops;

import java.util.*;

public class ForLoops {

    public static void main(String[] args) {
        /*
            Now that we have covered the different data-types
            And the collections that we can store them in
            We need to be able to iterate over these collections
            This will allow us to analyze or modify data to meet our needs

            The most common loop style is a For Loop
         */
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.println("The value of 'i' is : " + i);
        }

        System.out.println();
        List<String> stringList = Arrays.asList("one", "two", "three", "four", "five");
        for (String value : stringList) {
            System.out.println("This value exists in 'stringList' : " + value);
        }

        /*
            This is another way of looping over data
            The only reasons to use one form over the other, in my opinion, are
                - personal preference
                - readability
            One of the most important things when writing code
            is to try and keep things organized in a way that
            you will easily pick back up if you haven't looked at it in months
         */
        System.out.println();
        stringList.forEach(value -> System.out.println("This value exists in 'stringList' : " + value));

        /*
            With the first few examples,
            you can see that order is maintained while performing the loop

            In this example, you will notice that the values
            don't always show up in the order one would expect

            That is because there is no order maintained in a HashSet
         */
        System.out.println();
        Set<String> stringSet = new HashSet<>(stringList);
        for (String value : stringSet) {
            System.out.println("This value exists in 'stringSet' : " + value);
        }

        System.out.println();
        Map<String, String> stringStringMap = new HashMap<>();
        stringStringMap.put("hello", "world");
        stringStringMap.put("one", "two");
        stringStringMap.put("happy", "birthday");
        /*
            Since a map is a key-value pair there are a few different ways to iterate over the data
                - Can loop over the set of keys, and then get the value based on the key
                - Can loop over the values, with no way to easily find the corresponding key
                - Can loop over the entrySet, which is a list of objects that contain the key and value
         */
        for (String key : stringStringMap.keySet()) {
            System.out.println("Iterating over the 'stringStringMap' keySet : key="
                    + key + " value=" + stringStringMap.get(key));
        }

        System.out.println();
        for (String value : stringStringMap.values()) {
            System.out.println("Iterating over the 'stringStringMap' values :  value=" + value);
        }

        System.out.println();
        for (Map.Entry<String, String> entry : stringStringMap.entrySet()) {
            System.out.println("Iterating over the 'stringStringMap' entrySet : key="
                    + entry.getKey() + " value=" + entry.getValue());
        }
    }
}
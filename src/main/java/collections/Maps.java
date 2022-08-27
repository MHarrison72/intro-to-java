package collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {
        /*
            While Sets and Lists only store individual values
            A Map let you store a key-value pair
            And in similar fashion to Lists/Sets,
            we must also specify the type of data that will be stored
            in the key and in the value <keyType,valueType>
         */
        Map<String, String> stringStringMap = new HashMap<>();

        stringStringMap.put("hello", "world");
        stringStringMap.put("10", "bananas");

        System.out.println();
        System.out.println("Value of 'stringStringMap' : " + stringStringMap);

        // We can also remove elements from the Map
        System.out.println();
        String key = stringStringMap.remove("10");
        System.out.println("Removed key '" + key + "' from 'stringStringMap'.");
        System.out.println("Value of 'stringStringMap' : " + stringStringMap);

        // There is also contains functionality
        System.out.println();
        if (stringStringMap.containsKey("hello")) {
            System.out.println("The 'stringStringMap' contains key 'hello'");
        }
        if (stringStringMap.containsValue("world")) {
            System.out.println("The 'stringStringMap' contains value 'world'");
        }

        // We can also remove all the elements at once
        stringStringMap.clear();
        System.out.println();
        System.out.println("The 'stringStringMap' is now empty : " + stringStringMap);
    }
}
package dataTypes;

/*
    https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
 */
public class Characters {

    public static void main(String[] args) {
        /*
            This is called a 'character literal'
            It can only contain the value of 1 character in single quotes
            This is considered a 'primitive type' in Java
            The char data type is a single 16-bit Unicode character.
            It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535 inclusive).
            https://en.wikipedia.org/wiki/List_of_Unicode_characters
         */
        char character = 'A';

        System.out.println("Value of 'character' : " + character);

        /*
            This is an array of characters
            The array notation is specified by the square brackets []

            Here we also see the 'new' keyword
            This means that we are creating an Object in memory
            When creating an array, we must specify the size we want the array to be
            When we are accessing elements in an array, the first element is in the 0th position
            The last element is in the (size-1) position
         */
        char[] characterArray = new char[5];
        characterArray[0] = 'A';
        characterArray[1] = 'B';
        characterArray[2] = 'C';
        characterArray[3] = 'D';
        characterArray[4] = 'E';
        // Can also create an array of characters without specifying the size
        // characterArray = new char[]{'A','B','C','D','E'};

        System.out.println("Value of 'characterArray' : " + characterArray);
        /*
            Notice how this didn't print out the value one might expect
            Instead, it printed the memory address of the 'characterArray' object
            If we want to display the list of characters in the array, we must do it one at a time
         */
        System.out.println("Value of first entry in 'characterArray' : " + characterArray[0]);
        System.out.println("Value of second entry in 'characterArray' : " + characterArray[1]);
        System.out.println("Value of third entry in 'characterArray' : " + characterArray[2]);
        System.out.println("Value of fourth entry in 'characterArray' : " + characterArray[3]);
        System.out.println("Value of fifth entry in 'characterArray' : " + characterArray[4]);
    }
}
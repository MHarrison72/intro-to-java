package loops;

/*
    https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html
 */
public class WhileLoops {

    public static void main(String[] args) {

        int count = 10;
        
        while (count > 0) {
            System.out.println("Count is currently " + count);
            count--;
        }

        System.out.println();

        do {
            System.out.println("Count is currently " + count);
            count++;
        } while (count < 10);
    }
}
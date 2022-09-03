package loops;

/*
    https://docs.oracle.com/javase/tutorial/java/nutsandbolts/branch.html
 */
public class BreakAndContinueStatements {

    public static void main(String[] args) {

        int[] intArray = {1,2,3,4,5,6,7,8,9};

        for (int i : intArray) {
            if (i == 6) {
                /*
                    break statements will terminate the execution of a loop
                 */
                break;
            } else if (i == 5) {
                /*
                    continue statements will skip the remaining code in the loop

                    the loop will continue its iteration over its values
                 */
                continue;
            }
            System.out.println("Current value in array : " + i);
        }

        System.out.println("Loop Execution Over");
    }
}
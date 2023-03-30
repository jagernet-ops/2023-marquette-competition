// Do NOT include a package statement at the top of your solution.

import java.util.Scanner;

public class PracticeProblem {

    /*
    * It is unnecessary to edit the "main" method of each problem's provided code skeleton.
    * The main method is written for you in order to help you conform to input and output formatting requirements.
    */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int numCases = kb.nextInt();
        for (int iCase = 0; iCase < numCases; iCase++) {
            int x = kb.nextInt();
            boolean xIsNegative = isNegative(x);
            if (xIsNegative) {
                System.out.println("Negative");
            } else {
                System.out.println("Non-Negative");
            }
        }
    }

    public static boolean isNegative(int x) {
        boolean result = false;

        /*
        * TODO: Write code that changes result to true if "x" is less than zero.
        */ 

        return result;
    }
}
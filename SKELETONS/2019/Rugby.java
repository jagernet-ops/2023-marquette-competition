import java.util.*;

public class Rugby {

    /*It is unnecessary to edit the "main" method of each problem's provided code skeleton.
        * The main method is written for you in order to help you conform to input and output formatting requirements.
        */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        for(;cases > 0; cases--) {
            System.out.println(countCombos(in.nextInt()));
        }
    }

    /**  
        *  TODO: Write a function that counts all combinations of points
                a team can score to reach a given total 'score'.

        @param score --> The total score for all points to add up to.
        @return the number of combinations possible. *
    */
    public static int countCombos(int score) {

        // Hint: one way to solve this problem is to write a "generateCombos" method to return
        // all the combinations, then count them:
        return generateCombos(score).size();
    }
}   
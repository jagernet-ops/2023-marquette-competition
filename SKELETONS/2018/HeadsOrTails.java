import java.util.*;

public class HeadsOrTails {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int cases = keyboard.nextInt();
        keyboard.nextLine();
        for (; cases > 0; cases--) {
            String aliceResults = keyboard.nextLine();
            String bobResults = keyboard.nextLine();
            System.out.println(getWinner(aliceResults.toCharArray(), bobResults.toCharArray()));
        }
        keyboard.close();
    }

    public static String getWinner(char[] aliceFlipResults, char[] bobFlipResults) {
        // both "aliceFlipResults" and "bobFlipResults" will only contain 'H' and 'T' characters, and each array has 8 elements

        String winner = "Alice";

        // TODO: change "winner" to be the name of the player with the most heads ("Alice", "Bob", or "Chaz")

        return winner;
    }
}
   
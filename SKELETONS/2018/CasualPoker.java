import java.util.*;

public class CasualPoker {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        for (int cases = keyboard.nextInt(); cases > 0; cases--) {
            int[][] hands = new int[2][5];
            for (int iHand = 0; iHand < 2; iHand++)
                for (int iCard = 0; iCard < 5; iCard++)
                    hands[iHand][iCard] = keyboard.nextInt();

            int result = comparePokerHands(hands[0], hands[1]);
            if (result == 1)
                System.out.println("First");
            else if (result == 2)
                System.out.println("Second");
            else if (result == 0)
                System.out.println("Tie");
            else
                System.out.println("Error - output was " + result);
        }
        keyboard.close();
    }

    public static int comparePokerHands(int[] hand1, int[] hand2) {
        int winner = 0;

        // TODO: set "winner" to 1 if hand1 beats hand2, set "winner" to 2 if hand2 beats hand1, or set "winner" to 0 if the two hands tie

        return winner;
    }
}
import java.util.*;

public class MorningCoffee {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        for (int cases = keyboard.nextInt(); cases > 0; cases--) {
            int amount = keyboard.nextInt();

            int[] results = produceAmount(amount);
            String[] numCoins = new String[results.length];
            for (int i = 0; i < results.length; i++)
                numCoins[i] = Integer.toString(results[i]);
            System.out.println(String.join(" ", numCoins));
        }
        keyboard.close();
    }

    public static int[] produceAmount(int amount) {
        int numOfQuarters = 0;
        int numOfDimes = 0;
        int numOfNickels = 0;
        int numOfPennies = 0;

        /*
        * TODO: For each of the coins (quarter, dime, nickel, penny), set the corresponding "numOf" variable to
        * how many coins it takes to make "amount" out of *just* that coin.
        * 
        * If "amount" can't be made out of *just* that coin, set the corresponding "numOf" variable to -1.
        *
        * For example:
        * If "amount" is 175, we should set:
        * numOfQuarters = 7;
        * numOfDimes = -1;
        * numOfNickels = 35;
        * numOfPennies = 175;
        */
        
        return new int[] { numOfQuarters, numOfDimes, numOfNickels, numOfPennies };
    }

    public static boolean isDivisibleBy(int x, int y) {
        /*
        * Feel free to use this function in your solution!
        * 
        * Returns true if x is "divisible by" y, and false otherwise.
        * 
        * For example, isDivisibleBy(10, 5) returns true, because 10 / 5 is 2.
        * isDivisibleBy(10, 3) returns false, because 10 / 3 has a remainder.
        */

        return x % y == 0;
    }
}
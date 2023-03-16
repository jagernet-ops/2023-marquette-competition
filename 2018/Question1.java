import java.util.*;

public class Question1 {

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
        int[] rtn = new int[] {25, 10, 5, 1};

        for (int i = 0; i < 4; i++) {
            if(amount % rtn[i] == 0) {
                rtn[i] = amount / rtn[i];
            }else {
                rtn[i] = -1;
            }
        }
        
        return rtn;
    }
}
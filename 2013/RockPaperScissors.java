import java.util.ArrayList;
import java.util.Scanner;

public class RockPaperScissors {
    private static ArrayList<String>  list = new ArrayList<String>();
    
    /**
     * 
     * @param in
     * @return 1 if Letterman wins, -1 if Regis wins, 0 if tie
     */
    public static int checkWin(String in) {
        char l = in.charAt(0);
        char r = in.charAt(1);

        if(l == r) {
            return 0;
        }

        if(l == 'R') {
            if(r == 'S') {
                return 1;
            }

            if(r == 'P') {
                return -1;
            }
        }

        if(l == 'P') {
            if(r == 'S') {
                return -1;
            }

            if(r == 'R') {
                return 1;
            }
        }

        if(l == 'S') {
            if(r == 'R') {
                return -1;
            }

            if(r == 'P') {
                return 1;
            }
        }
        return 0; //unreachable
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String prev = "";
        String curr;
        int score = 0;
        while (true) {
           curr = keyboard.nextLine().toUpperCase();
           if(curr.equals("END")) {
            if(prev.equals("END")) {
                break;
            }else {
                if(score > 0){
                    list.add("Letterman wins");
                }else if (score < 0) {
                    list.add("Regis wins");
                }else {
                    list.add("Tie");
                }
                score = 0;
            }
           }
           score += checkWin(curr);

           prev = curr;

        }
        keyboard.close();

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Contest #" +(i+1) + ": " + list.get(i));
        }
    }
}

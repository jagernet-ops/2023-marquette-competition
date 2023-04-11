import java.util.ArrayList;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class RockPaperScissors 
{
    public static void main(String[] args)
    {
        int contest = 1;

        ArrayList<String> order = new ArrayList<String>();
        order.add("R");
        order.add("S");
        order.add("P");

        Scanner sc = new Scanner(System.in);

        int scoreL = 0;
        int scoreR = 0;

        while (true)
        {
            String input = sc.nextLine();

            if (input.equals("End"))
            {
                if (scoreL + scoreR == 0)
                {
                    break;
                }

                System.out.print("Contest #" + contest + ": ");
                if (scoreL > scoreR)
                {
                    System.out.println("Letterman wins");
                }
                else if (scoreR > scoreL)
                {
                    System.out.println("Regis wins");
                }
                else 
                {
                    System.out.println("Tie");
                }
                scoreL = 0;
                scoreR = 0;
                contest += 1;
            }
            else
            {
                int sL = order.indexOf(Character.toString(input.charAt(0)));
                int sR = order.indexOf(Character.toString(input.charAt(1)));

                if ((sL + 1) % 3 == sR)
                {
                    scoreL += 1;
                }
                else if ((sR + 1) % 3 == sL)
                {
                    scoreR += 1;
                }
                else
                { // score has the same difference but end doesn't trigger close
                    scoreR += 1;
                    scoreL += 1;
                }
            }
        }
    }
}

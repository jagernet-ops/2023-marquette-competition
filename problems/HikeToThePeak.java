package problems;
import java.util.Scanner;

public class HikeToThePeak {

    /**
    * TODO: Find the maximum elevation Brad reached given the following parameters:
    *
    * Parameters:
    * @param log --> (String) A string representing the change in Brad's elevation
    *
    * Returns:
    * @return an integer containing the maximum elevation Brad reached
    *
    */
    public static int findMaxElevation(String log) {

        // Write your code here

        return 0;
    }

    /*
    * It is unnecessary to edit the "main" method of each problem's provided code
    * skeleton. The main method is written for you in order to help you conform to
    * input and output formatting requirements.
    */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int cases = Integer.parseInt(in.nextLine());
        for (; cases > 0; cases--) {
            // User Input
            String log = in.nextLine();

            // Function Call
            int returnedVal = findMaxElevation(log);

            // Terminal Output
            System.out.println(returnedVal);
        }

        in.close();
    }
}
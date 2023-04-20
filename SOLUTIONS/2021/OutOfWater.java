import java.util.Scanner;
import java.util.Arrays;

public class OutOfWater {

    /**
    * TODO: Calculate and sort (smallest value first) the time (in minutes) it will take Captain Zap to get to each planet given the following parameters:
    *
    * Parameters:
    * @param distances --> (integer array) the distance (in km) needed to reach each planet
    *
    * Returns:
    * @returns a sorted array of integers (from least to greatest) representing the number of minutes it will take to reach each planet
    *
    * NOTE:  The speed of light is 300000 km/s
    * NOTE:  Use  = d/s where t is the time, d is the distance, and s is the speed
    * NOTE:  Round the nearest minute
    */
    public static int[] distanceFinder(int[] distances) {
        for(int i = 0; i < distances.length; i++){
         distances[i] = (int) (((distances[i] / 300000.0) / 60) + 0.5);   
        }
        Arrays.sort(distances);
        return distances;
    }

    /*
    * It is unnecessary to edit the "main" method of each problem's provided code
    * skeleton. The main method is written for you in order to help you conform to
    * input and output formatting requirements.
    */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        for (int tests = Integer.parseInt(in.nextLine()); tests > 0; tests--) {
            // User Input
            String[] inp = in.nextLine().split(" ");
            int[] distances = new int[10];
            for (int i = 0; i < inp.length; i++) {
                distances[i] = Integer.parseInt(inp[i]);
            }

            // Function Call
            int[] returnedVals = distanceFinder(distances);

            // Terminal Output
            for (int i = 0; i < returnedVals.length; i++){
            	if (i != returnedVals.length - 1){
                    System.out.print(returnedVals[i] + " ");
                } else {
                    System.out.print(returnedVals[i]);
                }
            }
            System.out.println("");
        }

        in.close();
    }
}
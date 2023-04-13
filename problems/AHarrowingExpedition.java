package problems;
import java.math.BigDecimal;
import java.util.Scanner;

public class AHarrowingExpedition {

    /**
    * TODO: calculate the probability of exactly x successes given n trials with probability of p given the following parameters:
    * 
    * Note: Documentation for the BigDecimal API can be found here: https://docs.oracle.com/javase/8/docs/api/java/math/BigDecimal.html
    * 
    * @param x --> (integer) number of successes 
    * @param n --> (integer) number of trials
    * @param p --> (double) probability of success
    *
    * @return new BigDecimal --> a BigDecimal containing the probability of exactly x successes out of n trials with a probability of p
    */
    public static BigDecimal binomial(int x, int n, double p) {

        // Write your solution here

        return new BigDecimal("1");
	}

    /*
    * It is unnecessary to edit the "main" method of each problem's provided code
    * skeleton. The main method is written for you in order to help you conform to
    * input and output formatting requirements.
    */
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

        int cases = in.nextInt();
        for (; cases > 0; cases--) {
			// User Input
            int x = in.nextInt();
            int n = in.nextInt();
			double p = in.nextDouble();

            // Function Call
            BigDecimal returnedVal = binomial(x, n, p);

			// Output
			System.out.printf("%.5f\n", returnedVal);
	
		}
	}
}
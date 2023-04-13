import java.util.Scanner;

public class TaylorSeries {

        /*
        * It is unnecessary to edit the "main" method of each problem's provided code skeleton.
        * The main method is written for you in order to help you conform to input and output formatting requirements.
        */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        for (; cases > 0; cases--) {
            double a = in.nextDouble();
            System.out.printf("%.3f %.3f\n", sin(a), cos(a));
        }
        in.close();
    }

    /**
        * TODO: Complete the following method which calculates the cosine given an angle in degrees
        * 
        * @param x --> the angle given in degrees
        * @return result --> the cosine given in radians
        */
    public static double cos(double x) {
        return 0;
    }

    /**
        * TODO: Complete the following method which calculates the sine given an angle in degrees
        * 
        * @param x --> the angle given in degrees
        * @return result --> the sine given in radians
        */
    public static double sin(double x) {
        return 0;
    }

    /**
        * 
        * Note: Use this factorial method when developing your code 
        * 
        * @param x --> the value that is used to calculate the factorial
        * @return result --> the result of x!
        */
    public static double factorial(int x) {
        double result = 1;
        if (x == 0)
            result = 1;
        else {
            for (int i = 1; i <= x; i++) {
                result *= i;
            }
        }
        return result;
    }
}     
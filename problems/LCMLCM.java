package problems;
import java.util.Scanner;

public class LCMLCM {
    // The main method handles standard input and output
    // You should not change this method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int     t       = scanner.nextInt();

        for (int i = 0; i < t; i++) {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(leastCommonMultiple(a, b));
        }
    }

    public static int leastCommonMultiple(int a, int b) {
        int smallest = b;
        if (a < b)
        {
            smallest = a;
        } 

        for (int i = smallest; i > 1; i--)
        {
            if (a % i == 0 && b % i == 0)
            {
                a /= i;
                break;
            }
        }

        return a * b;
    }
}
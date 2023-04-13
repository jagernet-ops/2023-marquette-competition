import java.util.Scanner;

public class QuestionTwo {
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
        scanner.close();
    }

    public static int leastCommonMultiple(int a, int b) {
        int m1 = 1;
        int m2 = 1;
        while (true) {
            if(a * m1 == b * m2) {
                return a * m1;
            }else {
                if(m1 > m2) {
                    m2++;
                }else {
                    m1++;
                }
            }
        }
    }
}
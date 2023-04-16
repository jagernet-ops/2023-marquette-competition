package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class QuestionThre {

    // The main method handles standard input and output
    // You should not change this method
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int t= scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int startingYear = scanner.nextInt();
            int endingYear = scanner.nextInt();
            ArrayList<Integer> solution = findLeapYears(startingYear, endingYear);
            Integer solution2[] = new Integer[solution.size()];
            solution2 = solution.toArray(solution2);
            //to print your array
            System.out.println(Arrays.toString(solution2));
        }
    }
    public static ArrayList<Integer> findLeapYears(int startingYear, int endingYear) {
        ArrayList<Integer> leapYears = new ArrayList<Integer>();

            for (int i = startingYear + 1; i <= endingYear; i++) {
                if ((i % 4 == 0) && !((i % 100 == 0) && !(i % 400 == 0))) { 
                    leapYears.add(i);
                }
            }
        return leapYears;
    }
}
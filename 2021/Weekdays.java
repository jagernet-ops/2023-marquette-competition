import java.util.Scanner;

public class Weekdays {

    /**
    * TODO: Find the number of weekdays between two dates in 2021 given the following parameters:
    * 
    * @param first_month --> (integer) the month number of the first date (1 = January, 2 = February, ..., 12 = December)
    * @param first_day --> (integer) the day number of the first date (1, 2, 3, ...)
    * @param second_month --> (integer) the month number of the second date (1 = January, 2 = February, ..., 12 = December)
    * @param second_day --> (integer) the day number of the second date (1, 2, 3, ...)
    *
    * @return an integer representing the number of days between the two dates
    *
    * Note: Include the first date in your count (if it's a weekday) but not the second date.
    */
    public static int weekdays(int first_month, int first_day, int second_month, int second_day)
    {
        // Here is the number of days in each month: Jan 1st is a friday
        int[] month_list = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        int start = first_day;

        for (int i = 0; i < first_month - 1; i++)
        {
            start += month_list[i];
        }

        int end = second_day;

        for (int i = 0; i < second_month - 1; i++)
        {
            end += month_list[i];
        }

        int weekdays = 0;
        
        for (int i = start; i < end; i++)
        {
            if (i % 7 != 2 && i % 7 != 3)
            {
                weekdays += 1;
            }
        }

        return weekdays;
    }

    /*
     * It is unnecessary to edit the "main" method of each problem's provided code
     * skeleton. The main method is written for you in order to help you conform to
     * input and output formatting requirements.
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        for (int tests = Integer.parseInt(in.nextLine()); tests > 0; tests--) {
            String text = in.nextLine();
            String[] dates = text.split(" ");

            String[] firstEntry = dates[0].split("/");
            String[] secondEntry = dates[1].split("/");
            
            int first_month = Integer.parseInt(firstEntry[0]);
            int first_day = Integer.parseInt(firstEntry[1]);
            int second_month = Integer.parseInt(secondEntry[0]);
            int second_day = Integer.parseInt(secondEntry[1]);

            System.out.println(weekdays(first_month, first_day, second_month, second_day));
        }

        in.close();
    }
}
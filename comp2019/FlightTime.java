package comp2019;

import java.util.Scanner;

public class FlightTime {

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
            int dist = in.nextInt();
            int velo = in.nextInt();
            int depHr = in.nextInt();
            int depMin = in.nextInt();

            // Function Call
            int[] flight = totalFlightTime(dist, velo, depHr, depMin);

            // Terminal Output
            System.out.printf("%d:%02d\n", flight[0], flight[1]);
        }

        in.close();

    }

    /**
        * TDsO: Complete the following method that calculates the arrival time of a
        * flight based on the given parameters:
        * 
        * Note: You do not need to account for time of day signifiers (AM or PM). Note:
        * You do not need to account for time change between time zones.
        * 
        * @param distance --> the distance in miles of the flight
        * @param velocity --> how fast the plane is going in mph
        * @param departureHr --> the hour in which the plane departs
        * @param departureMin --> the minute in which the plane departs
        * @return new int[] {arrivalHr, arrivalMin} --> an array with arrivalHr at
        *         index 0 and arrivalMin at index 1
        */
    public static int[] totalFlightTime(int distance, int velocity, int departureHr, int departureMin) 
    {
        int hours = distance / velocity;
        int minutes = (int)(((double)distance / velocity - hours) * 100.0/60.0);

        hours += departureHr;
        minutes += departureMin;

        if (minutes >= 60)
        {
            minutes -= 60;
            hours += 1;
        }
        if (hours > 12)
        {
            hours %= 12;
        }

        return new int[] {hours, minutes};
    }

}
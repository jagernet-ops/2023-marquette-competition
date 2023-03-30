import java.util.*;

public class PracticeProblem {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        for (int cases = keyboard.nextInt(); cases > 0; cases--) {
            int input = keyboard.nextInt();
            int output = addOne(input);
            System.out.println(output);
        }
        keyboard.close();
    }

    public static int addOne(int input) {
        int output = 0;

        /*
        * TODO: Change output to be "input + 1".
        */
        
        return output;
    }
}
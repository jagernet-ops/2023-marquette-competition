import java.util.*;

public class PigLatin {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        for (int cases = keyboard.nextInt(); cases > 0; cases--) {
            System.out.println(convertToPigLatin(keyboard.nextInt()));
        }
        keyboard.close();
    }

    public static int convertToPigLatin(int input) {
        int convertedInput = 0;

        // TODO: set "convertedInput" to the numeric pig latin version of "input"

        return convertedInput;
    }
}
import java.util.*;

public class CrackFreeWalls {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        for (int cases = keyboard.nextInt(); cases > 0; cases--) {
            System.out.println(countBuildConfigurations(keyboard.nextInt(), keyboard.nextInt()));
        }
        keyboard.close();
    }

    public static int countBuildConfigurations(int wallWidth, int wallHeight) {
        int numOfBuildConfigurations = 0;

        // TODO: set "numOfBuildConfigurations" to the number of ways to assemble the wall of given width and height
        // out of 2x1 and 3x1 bricks, with no running cracks

        return numOfBuildConfigurations;
    }
}
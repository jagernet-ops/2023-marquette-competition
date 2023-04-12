import java.util.Scanner;
import java.util.ArrayList;

public class CityGrid {

   /*
    * TODO: Determine if a city grid is valid given the following parameters:
    *
    * Parameters:
    * grid --> A 10x10 two-dimensional int array filled with integer values: 0, 1, 2, or 3.
    * 
    * Returns:
    * a boolean: True if the city grid is valid. Otherwise, false.
    * 
    * Note: The grid will only be filled with the integers 0, 1, 2, or 3.  The size of the grid will always be 10 by 10.
    */
    static ArrayList<ArrayList<String>> plots;
    static int[][] grid;

    // starting at a specified point, adds all adjacent plots of the same type to plots
    // re-calls itself on neighboring coords
    public static void scan(int y, int x)
    {
        int id = grid[y][x];
        plots.get(id - 1).add("" + y + x);

        checkCoord(y + 1, x, id);
        checkCoord(y - 1, x, id);
        checkCoord(y, x + 1, id);
        checkCoord(y, x - 1, id);
    }

    // returns if the coord is within the grid
    public static void checkCoord(int y, int x, int id)
    {
        if (x >= 0 && x < 10 && y >= 0 && y < 10)
        {
            //System.out.println(grid[y][x] + " " + id + " " + !(plots.get(id - 1).contains("" + y + x)));
            if (grid[y][x] == id && !(plots.get(id - 1).contains("" + y + x)))
            {
                //System.out.println("yes");
                scan(y, x);
            }
        }
    }

    public static boolean isValidCityGrid(int[][] theGrid)
    {
        grid = theGrid;
        plots = new ArrayList<ArrayList<String>>();
        plots.add(new ArrayList<String>());
        plots.add(new ArrayList<String>());
        plots.add(new ArrayList<String>());

        boolean[] hasBeenScanned = new boolean[] {false, false, false};

        for (int y = 0; y < 10; y++)
        {
            for (int x = 0; x < 10; x++)
            {
                int id = grid[y][x];

                if (id > 0)
                {
                    if (hasBeenScanned[id - 1])
                    {
                        if (!plots.get(id - 1).contains("" + y + x))
                        {
                            return false;
                        }
                    }
                    else
                    {
                        hasBeenScanned[id - 1] = true;
                        scan(y, x);
                    }
                }
            }
        }

        return true;
    }

    // It is unnecessary to edit the "main" function of each problem's provided code skeleton.
    // The main function is written for you in order to help you conform to input and output formatting requirements.
    public static void main(String[] args) {
        /*System.out.println(isValidCityGrid(new int[][] { new int[] { 0, 3, 3, 3, 3, 3, 0, 0, 0, 0 }, 
        new int[] { 0, 2, 1, 0, 0, 3, 3, 3, 0, 0 },
        new int[] { 0, 2, 1, 0, 0, 0, 0, 3, 0, 0 },
        new int[] { 0, 2, 1, 0, 0, 0, 0, 3, 0, 0 },
        new int[] { 0, 2, 1, 1, 1, 0, 0, 3, 0, 0 },
        new int[] { 0, 2, 0, 0, 1, 0, 0, 3, 0, 0 },
        new int[] { 0, 2, 0, 0, 1, 0, 0, 3, 0, 0 },
        new int[] { 0, 2, 2, 2, 1, 0, 0, 3, 0, 0 },
        new int[] { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
        new int[] { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
      })); */

		Scanner in = new Scanner(System.in);

        for (int tests = Integer.parseInt(in.nextLine()); tests > 0; tests--) {
            int[][] grid = new int[10][10];

            for (int row = 0; row < 10; row++) {
                String str = in.next();
                String[] s = str.split(",");
                
                for (int col = 0; col < 10; col++)
                    grid[row][col] = Integer.parseInt(s[col]);
            }
            
            boolean result = isValidCityGrid(grid);

            if(result)
                System.out.println("True");
            else
                System.out.println("False");
        }
		
        in.close();
	}
}
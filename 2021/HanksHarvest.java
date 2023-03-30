import java.util.Scanner;

public class HanksHarvest {
    private static int c = 0, p = 0, z = 0, r = 0;
	
	/**
     * TODO: Determine if this year's harvest was considered good based on given criteria:
     *
     * @param harvest --> (String) A representation of this year's harvest where each character represents a crop.
     *
     * @return result --> (boolean) true if the harvest is considered good, false if the harvest is considered bad
     */
	public static boolean isGoodHarvest(String harvest) {

        for (int i = 0; i < harvest.length(); i++)
        {
            char ch = harvest.charAt(i);
            if (ch == 'C')
            {
                c += 1;
            }
            else if (ch == 'P')
            {
                p += 1;
            }
            else if (ch == 'Z')
            {
                z += 1;
            }
            else if (ch == 'R')
            {
                r += 1;
            }
        }

        int total = c + p + z;

		return !(c < 2 || p < 4 || z < 5 || total < 15 || r > total * 0.1);
	}

	/*
	* It is unnecessary to edit the "main" method of each problem's provided code
	* skeleton. The main method is written for you in order to help you conform to
	* input and output formatting requirements.
	*/
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
        for (int tests = Integer.parseInt(in.nextLine()); tests > 0; tests--) {
            String harvest = in.nextLine();
            boolean isGoodHarvest = isGoodHarvest(harvest);
            if(isGoodHarvest){ 
                System.out.println("This year's harvest is good!");
            } else {
                System.out.println("This year's harvest is bad!");
            }
        }

        in.close();
	}
}
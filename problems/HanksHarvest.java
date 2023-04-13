package problems;
import java.util.Scanner;

public class HanksHarvest {
	
	/**
     * TODO: Determine if this year's harvest was considered good based on given criteria:
     *
     * @param harvest --> (String) A representation of this year's harvest where each character represents a crop.
     *
     * @return result --> (boolean) true if the harvest is considered good, false if the harvest is considered bad
     */
	public static boolean isGoodHarvest(String harvest) {
        harvest.toCharArray()

        // At least 2 corn
        // At least 4 potatoes
        // At least 5 zucchini
        // At least 15 crops total
        // At most 10% of all crops (including the rotten crops) are rotten (we never said he was a good farmer)
        // If any of these requirements are not met, then Farmer Hank considered the harvest a failure. The program takes in a string representing the harvest. Each letter represents a crop:

        // C represents a cob of corn
        // P represents a potato
        // Z represents a zucchini
        // R represents a rotten crop

		return false;
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

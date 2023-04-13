

import java.util.HashMap;
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
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        for (int i = 0; i < harvest.length(); i++) {
            count.put(harvest.charAt(i), count.getOrDefault(harvest.charAt(i), 0) + 1);
        }
        //printHashMap(count);

        if(count.getOrDefault('C', 0) < 2) {
            return false;
        }

        if(count.getOrDefault('P', 0) < 4) {
            return false;
        }

        if(count.getOrDefault('Z', 0) < 5) {
            return false;
        }

        int total = totalCrops(count);

        if(total < 15) {
            return false;
        }

        if((double) count.getOrDefault('R', 0) / (double)total > .1 ) {
            return false;
        }

		return true;
	}

    private static int totalCrops(HashMap<Character, Integer> map) {
        int rtn = 0;
        for (Character i : map.keySet()) {
            rtn += map.get(i);
        }
        return rtn;
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

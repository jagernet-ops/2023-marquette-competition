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
        boolean result = false;
        int[] cropCounter = {0, 0, 0, 0};
        int[] baselineHaul = {2, 4, 5, 15, 10};
        for(int i = 0; i < harvest.length(); i++){
            switch (harvest.charAt(i)) {
                case 'C':
                    cropCounter[0]++;
                    break;
                case 'P':
                    cropCounter[1]++;
                    break;
                case 'Z':
                    cropCounter[2]++;
                    break;
                case 'R':
                    cropCounter[3]++;
                    break;
                default:
                    System.out.println("Something went wrong!");
                    break;
            }
        }
        
        if(cropCounter[0] >= baselineHaul[0] && cropCounter[1] >= baselineHaul[1] && cropCounter[2] >= baselineHaul[2] 
        && harvest.length() >= 15){
            if(cropCounter[3] / harvest.length() <= harvest.length() * 0.1){
                result = true;
            }
        }

		return result;
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
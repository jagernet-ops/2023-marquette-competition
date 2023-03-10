import java.util.Scanner;
import java.util.HashMap;

public class HanksHarvest {

  /**
   * criteria:
   *
   * @param harvest --> (String) A representation of this year's harvest where
   *                each character represents a crop.
   *
   * @return result --> (boolean) true if the harvest is considered good, false if
   *         the harvest is considered bad
   */
  public static boolean isGoodHarvest(String harvest) {
    char potato = 'P';
    char zuccini = 'Z';
    char corn = 'Z';
    char rotten = 'R';
    HashMap<String, Integer> newHarvest = new HashMap<String, Integer>();
    newHarvest.put("Corn Count", 0);
    newHarvest.put("Potato Count", 0);
    newHarvest.put("Zuccini Count", 0);
    newHarvest.put("Rotten Count", 0);
    HashMap<String, Integer> baselineHarvest = new HashMap<String, Integer>();
    baselineHarvest.put("Corn Count", 2);
    baselineHarvest.put("Potato Count", 4);
    baselineHarvest.put("Zuccini Count", 5);
    baselineHarvest.put("Total Crops", 15);

    // Scans Array for all items

    char[] harvestArray = harvest.toCharArray();
    if (harvestArray.length < baselineHarvest.get("Total Crops")) {
      return false;
    }
    for (int i = 0; i < harvestArray.length; i++) {
      if (harvestArray[i] == corn) {
        Integer currentCorn = newHarvest.get("Corn Count");
        newHarvest.put("Corn Count", currentCorn++);
      } else if (harvestArray[i] == potato) {
        Integer currentPotatos = newHarvest.get("Potato Count");
        newHarvest.put("Potato Count", currentPotatos++);
      } else if (harvestArray[i] == zuccini) {
        Integer currentZuccini = newHarvest.get("Zuccini Count");
        newHarvest.put("Zuccini Count", currentZuccini++);
      } else if (harvestArray[i] == rotten) {
        Integer currentRotten = newHarvest.get("Rotten Count");
        newHarvest.put("Rotten Count", currentRotten++);
      }
    }
    if ((newHarvest.get("Rotten Count") * 0.01) > 0.1) {
      return false;
    }
    // Conditional Statement comparing hashmaps to return true
    if ((newHarvest.get("Corn Count") >= baselineHarvest.get("Corn Count"))
        && (newHarvest.get("Potato Count") >= baselineHarvest.get("Potato Count"))
        && (newHarvest.get("Zuccini Count") >= baselineHarvest.get("Zuccini Count"))) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    for (int tests = Integer.parseInt(in.nextLine()); tests > 0; tests--) {
      String harvest = in.nextLine();
      boolean isGoodHarvest = isGoodHarvest(harvest);
      if (isGoodHarvest) {
        System.out.println("This year's harvest is good!");
      } else {
        System.out.println("This year's harvest is bad!");
      }
    }

    in.close();
  }
}
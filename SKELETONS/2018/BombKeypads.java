import java.util.*;

public class BombKeypads {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String[] tableRows = new String[keyboard.nextInt()];
        keyboard.nextLine();
        for (int i = 0; i < tableRows.length; i++)
            tableRows[i] = keyboard.nextLine();

        int cases = keyboard.nextInt();
        keyboard.nextLine();
        for (; cases > 0; cases--) {
            String[] tableRowsCopyForThisTest = new String[tableRows.length];
            System.arraycopy(tableRows, 0, tableRowsCopyForThisTest, 0, tableRows.length);

            System.out.println(getButtonOrder(keyboard.nextLine(), tableRowsCopyForThisTest));
        }

        keyboard.close();
    }

    public static String getButtonOrder(String buttonLabels, String[] tableRows) {
        String orderedButtonLabels = buttonLabels;

        // TODO: reorder "orderedButtonLabels" to contain the button labels in the order that they appear in the one
        // matching row of "tableRows" (the row that contains all four of the button labels)

        return orderedButtonLabels;
    }
}
    
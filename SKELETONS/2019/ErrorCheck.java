import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class ErrorCheck {

    /* It is unnecessary to edit the "main" method of each problem's provided code skeleton.
    * The main method is written for you in order to help you conform to input and output formatting requirements.
    */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int cases = kb.nextInt();
        kb.nextLine();

        for (; cases > 0; cases--) {
            int lines = kb.nextInt();
            kb.nextLine();
            String[][] tokens = new String[lines][];
            for (int line = 0; line < lines; line++) {
                // split the line into tokens by using regex to match the space inbetween tokens
                tokens[line] = kb.nextLine().split(
                        "\\s+|(?<=[0-9\\+\\-\\*\\/\\(\\)])(?=[\\+\\-\\*\\/\\(\\)])|(?<=[\\+\\*\\/\\(\\)]|[0-9]\\-)(?=[0-9\\+\\-\\*\\/\\(\\)])");
                
                // check for the one case the regex fails to catch: negative sign versus minus sign (e.g. "1 * -1" should have "-1" be a token, but "1 -1" should have "-" and "1" be separate tokens)
                ArrayList tokensList = null;
                int failuresFixed = 0;
                for (int iToken = 0; iToken < tokens[line].length - 1; iToken++)
                    if (!isOperator(tokens[line][iToken]) && !tokens[line][iToken].equals("(") && !isOperator(tokens[line][iToken + 1]) && !tokens[line][iToken + 1].equals("(") && tokens[line][iToken + 1].charAt(0) == '-') {
                        // perform correction
                        if (failuresFixed == 0) tokensList = new ArrayList(Arrays.asList(tokens[line]));
                        tokensList.set(iToken + 1 + failuresFixed, tokens[line][iToken + 1].substring(1));
                        tokensList.add(iToken + 1 + failuresFixed, "-");
                        failuresFixed++;
                    }
                if (failuresFixed > 0)
                    tokens[line] = (String[]) tokensList.toArray(new String[0]);
            }
            int[] errorLocation = identifyError(tokens);
            System.out.printf("%d %d\n", errorLocation[0], errorLocation[1]);
        }
        kb.close();
    }

    /* TODO: Implement your routine to read the evaluation steps
    * of an arithmetic expression and identify the location of
    * the mathematical error, if any.
    * @param tokens, 2D String Array of tokens
    * @return errorLineIndex, errorTokenIndex, the line and token index of the error
    */
    public static int[] identifyError(String[][] tokens) {
        int errorRow = 0;
        int errorTokenIndex = 0;

        return new int[] { errorRow, errorTokenIndex };
    }

    public static boolean isOperator(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }
}
    
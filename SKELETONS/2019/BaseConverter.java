import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BaseConverter {

    /*
        * It is unnecessary to edit the "main" method of each problem's provided code
        * skeleton. The main method is written for you in order to help you conform to
        * input and output formatting requirements.
        */
    public static void main(String[] args) {

        /* Variable Declarations */
        int num, lwrBnd, uprBnd;
        ArrayList outputList;
        Scanner in = new Scanner(System.in);

        int cases = in.nextInt();
        for (; cases > 0; cases--) {
            /* User Input */
            num = in.nextInt();
            lwrBnd = in.nextInt();
            uprBnd = in.nextInt();

            /* Function call */
            /* Converts the output of multBaseConverter to an ArrayList outputList. */
            outputList = new ArrayList(Arrays.asList(multBaseConverter(num, lwrBnd, uprBnd)));
            /* Gets rid of any null elements in the ArrayList. */
            outputList.removeAll(Collections.singleton(null));

            /* Terminal Output */
            System.out.println(outputList.toString());
        }
        in.close();
    }

    /**
        * TODO: Complete the following method which converts a decimal to all bases between two bounds
        * 
        * Note: lwrBnd and uprBnd are INCLUDED in the final returned result. 
        * Note: Don't worry about null elements in the return array. The main method removes all null elements.
        * 
        * @param base10 --> the number to be converted, given in decimal (base 10)
        * @param lwrBnd --> the lower bound of bases to which base10 will be converted to
        * @param uprBnd --> the upper bound of bases to which base10 will be converted to
        * @return allBases --> an array of base10 converted to bases between the lwrBnd and uprBnd
        */
    public static String[] multBaseConverter(int base10, int lwrBnd, int uprBnd) {
        String[] allBases = new String[63];

        return allBases;
    }
}    
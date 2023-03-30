import java.util.*;

public class LookAndSay {

    /** 
    * TODO: Write a function that applies the look and say sequence 3 times, 
    * using the previous result as the input for the next sequence.
    *    @param input --> The initial input.
    *    @return the result of applying the look and say sequence 3 times. **/
    public static String lookandsay(String input){
        return "";
    }

    public static int sum(String input){
        int sum = 0;
        for(char c : input.toCharArray())
            sum += Integer.parseInt(c + "");
        return sum;
    }

    /* It is unnecessary to edit the "main" method of each problem's provided code skeleton.
        * The main method is written for you in order to help you conform to input and output formatting requirements.\
        */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int cases = in.nextInt();
        for(;cases > 0; cases--) {
            System.out.println(sum(lookandsay(in.next())));
        }
    }
}   
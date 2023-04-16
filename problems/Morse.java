package problems;

import java.util.HashMap;
import java.util.Scanner;

public class Morse {

    /*static final String[] MORSECODE = new String[] {".-", "-...", "-.-.", "-..", ".", "..-.",
"--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
    static final char[] CHARACTERS = new char[] {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    */
    static HashMap<String, Character> morsecode = new HashMap<String, Character>();
    // The main method handles standard input and output
    // You should not change this method
    public static void main(String[] args) {
        morsecode.put(".-", 'A');
        morsecode.put("-...", 'B');
        morsecode.put("-.-.", 'C');
        morsecode.put("-..", 'D');
        morsecode.put(".", 'E');
        morsecode.put("..-.", 'F');
        morsecode.put("--.", 'G');
        morsecode.put("....", 'H');
        morsecode.put("..", 'I');
        morsecode.put(".---", 'J');
        morsecode.put("-.-", 'K');
        morsecode.put(".-..", 'L');
        morsecode.put("--", 'M');
        morsecode.put("-.", 'N');
        morsecode.put("---", 'O');
        morsecode.put(".--.", 'P');
        morsecode.put("--.-", 'Q');
        morsecode.put(".-.", 'R');
        morsecode.put("...", 'S');
        morsecode.put("-", 'T');
        morsecode.put("..-", 'U');
        morsecode.put("...-", 'V');
        morsecode.put(".--", 'W');
        morsecode.put("-..-", 'X');
        morsecode.put("-.--", 'Y');
        morsecode.put("--..", 'Z');

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();//advances scanner to next line
        //to print your answer
        for(int i = 0; i < t; i++){
            String morse = scanner.nextLine();
            System.out.println(decodeMorse(morse));
        }

        scanner.close();
    }
    public static String decodeMorse(String morse){
        String[] code = morse.split(" ");
        
        //char[] chars = new char[code.length];
        String message = "";

        for (String phrase : code)
        {
            message += morsecode.get(phrase);
        }

        return message;

    }
}
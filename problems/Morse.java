package problems;


import java.util.Scanner;

public class Morse {

    static final String[] MORSECODE = new String[] {".-", "-...", "-.-.", "-..", ".", "..-.",
"--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
    static final char[] CHARACTERS = new char[] {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    // The main method handles standard input and output
    // You should not change this method
    public static void main(String[] args) {
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

        for (int i = 0; i < code.length; i++)
        {
            for (int I = 0; I < 26; I++)
            {
                if (code[i].equals(MORSECODE[I]))
                {
                    //chars[i] = CHARACTERS[I];
                    message += CHARACTERS[I];
                    break;
                }
            }
        }

        return message;

    }
}
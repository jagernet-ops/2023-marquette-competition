import java.util.Scanner;

public class Encryption {


    /* It is unnecessary to edit the "main" method of each problem's provided code skeleton.
        * The main method is written for you in order to help you conform to input and output formatting requirements.
        */	
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        for(;cases > 0; cases--)
            System.out.println(encode(in.next()));
        in.close();
    }
    
    /* TODO: Implement the "square encryption" scheme 
        * @param s, the message to encrypt, of type String 
        * @return s, the encrypted message
        */ 
    private static String encode(String s) {
        return s;
    }
}
  
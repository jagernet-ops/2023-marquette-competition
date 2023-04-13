import java.util.Scanner;
import java.util.ArrayList;
// Phi = (1 + sqrt(5)) / 2
public class TheMissingKey {
    //final static double PHI = (1.0 + Math.sqrt(5)) / 2.0;

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static int powMod(int b, int e, int m) {
        return java.math.BigInteger.valueOf(b).modPow(java.math.BigInteger.valueOf(e), java.math.BigInteger.valueOf(m))
                .intValue();
    }

    public static String decode(int[] message) {
        return java.util.Arrays.stream(message).mapToObj(i -> Character.toString((char) i))
                .collect(java.util.stream.Collectors.joining());
    }

    /**
     * Complete this method that finds a plaintext containing "Ahoya!"
     * 
     * @param p          --> p-value from the algorithm.
     * @param q          --> q-value from the algorithm.
     * @param ciphertext --> ciphertext represented as an array of integers
     * 
     * @return {string} - decoded plaintext as a string
     */
    public static String codebreak(int p, int q, int[] m) {
        
        // Write your code here

        int n = p * q;
        int phiN = (p - 1) * (q - 1);

        ArrayList<Integer> possibleE = new ArrayList<Integer>();

        for (int i = 2; i < phiN; i++)
        {
            if (gcd(phiN, i) == 1)
            {
                possibleE.add(i);
            }
        }

        int d = 0;
        while (true)
        {
            d += 1;
            
            for (int e: possibleE)
            {
                if ((d * e) % phiN == 1)
                {
                    
                    int[] message = new int[m.length];

                    for (int I = 0; I < m.length; I++)
                    {
                        message[I] = powMod(m[I], d, n);
                    }

                    String decodedMessage = decode(message);

                    if (decodedMessage.substring(decodedMessage.length() - 6).equals("Ahoya!"))
                    {
                        return decodedMessage;
                    }
                }
            }
        }
    }

    /*
    * It is unnecessary to edit the "main" method of each problem's provided code
    * skeleton. The main method is written for you in order to help you conform to
    * input and output formatting requirements.
    */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for (int tests = in.nextInt(); tests > 0; tests--) {
            int p = in.nextInt();
            int q = in.nextInt();

            int[] c = java.util.Arrays.stream(in.next().split("(?<=\\G..)")).mapToInt(s -> Integer.parseInt(s, 16))
                    .toArray();

            System.out.println(codebreak(p, q, c));
        }
        in.close();
    }
}
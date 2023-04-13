package problems;
import java.util.Scanner;

public class TheMissingKey {
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

        return null;
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
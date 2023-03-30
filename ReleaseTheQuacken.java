import java.util.Scanner;

public class ReleaseTheQuacken {

    public static int[] duckOrder(int n, int m){
        /*
        * TODO: Write code that returns the order the ducks must escape in.
        */ 
        int[] order = {};

        return order;
    }

    /*
    * It is unnecessary to edit the "main" method of each problem's provided code skeleton.
    * The main method is written for you in order to help you conform to input and output formatting requirements.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCases = scanner.nextInt();
        for(int iCase = 0; iCase < numCases; iCase++) {
            String[] m_and_n = scanner.nextLine().split(" ");
            int[] order = duckOrder(Integer.parseInt(m_and_n[0]), Integer.parseInt(m_and_n[1]));
            for(int i = 0; i < order.length; i++){
                System.out.print(String.valueOf(order[i])+" ");
            }
        }
        scanner.close();
    }
}

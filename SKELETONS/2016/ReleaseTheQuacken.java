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
        Scanner in = new Scanner(System.in);
        int numCases = Integer.parseInt(in.nextLine());
        for(int iCase = 0; iCase < numCases; iCase++) {
            // User Input
            String m_and_n = in.nextLine();
            // Function Call
            int[] order = duckOrder(Integer.parseInt(m_and_n.split(" ")[0]), Integer.parseInt(m_and_n.split(" ")[1]));
            // Terminal Output
            for(int i = 0; i < order.length; i++){
                System.out.print(String.valueOf(order[i])+" ");
            }
        }
        in.close();
    }
}

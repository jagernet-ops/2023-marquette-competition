import java.util.*;

public class PipeFlow {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int numInputs = keyboard.nextInt(), numJunctions = keyboard.nextInt(), numOutputs = keyboard.nextInt(), numConnections = keyboard.nextInt();
        keyboard.nextLine();
        String[][] connections = new String[numConnections][2];
        for (int iConnection = 0; iConnection < numConnections; iConnection++) {
            connections[iConnection] = keyboard.nextLine().split(" ");
        }

        for (int cases = keyboard.nextInt(); cases > 0; cases--) {
            float[] inputFlows = new float[numInputs];
            for (int iInput = 0; iInput < numInputs; iInput++)
                inputFlows[iInput] = keyboard.nextFloat();
            
            float[] outputFlows = getOutputFlows(numInputs, numJunctions, numOutputs, connections, inputFlows);
            String[] outputFlowsPrintable = new String[numOutputs];
            for (int iOutput = 0; iOutput < numOutputs; iOutput++)
                outputFlowsPrintable[iOutput] = Integer.toString((int) outputFlows[iOutput]);
            System.out.println(String.join(" ", outputFlowsPrintable));
        }
        keyboard.close();
    }

    public static float[] getOutputFlows(int numInputs, int numJunctions, int numOutputs, String[][] connections, float[] inputFlows) {
        // see the problem description for descriptions of the input arguments

        float[] outputFlows = new float[numOutputs];

        // TODO: populate "outputFlows" with the amount of water going through each of the output pipes
        // e.g., output[0] should be the amount of water through "OUT0", output[1] should be the amount through "OUT1", etc.

        return outputFlows;
    }
}
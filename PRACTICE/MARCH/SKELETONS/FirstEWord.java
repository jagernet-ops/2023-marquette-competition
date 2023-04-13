import java.util.Scanner;

public class FirstEWord {
    public static int indexOf(String[] userList){
        int result = -1;

        // Write some code here

        return result;
    }
    public static void main(String[] args){
        /*
        * It is unnecessary to edit the "main" method of each problem's provided code
        * skeleton. The main method is written for you in order to help you conform to
        * input and output formatting requirements.
        */
        Scanner scanner = new Scanner(System.in);
        int numberOfCases = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < numberOfCases; i++){
            String[] userList = scanner.nextLine().split(" ");
            System.out.println(indexOf(userList));
            scanner.close();
        
        }
    }
}

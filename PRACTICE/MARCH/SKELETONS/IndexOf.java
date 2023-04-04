import java.util.Scanner;

public class IndexOf {
    public static int indexOf(int[] userList, int userNumber){
        int result = -1;

        

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
            int userNumber = Integer.parseInt(scanner.nextLine());
            String[] userList = scanner.nextLine().split(" ");
            int[] intList = new int[userList.length];
            for(int j = 0; j < userList.length; j++){
                intList[j] = Integer.parseInt(userList[j]);
            }
            System.out.println(indexOf(intList, userNumber));
            scanner.close();
        
        }
    }
}

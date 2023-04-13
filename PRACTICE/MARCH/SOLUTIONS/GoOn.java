import java.util.Scanner;

public class GoOn {
    public static int indexOf(String[] userList, char userLetter){
        int result = -1;

        for(int i = 0; i < userList.length; i++){
            for(int j = 0; j < userList[i].length(); j++){
                if(userList[i].toLowerCase().charAt(0) == userLetter){
                    result = i;
                }
            }
        }

        return result;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numberOfCases = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < numberOfCases; i++){
            String[] userList = scanner.nextLine().split(" ");
            char userChar = scanner.nextLine().charAt(0);
            System.out.println(indexOf(userList, userChar));
            scanner.close();
        
        }
    }
}

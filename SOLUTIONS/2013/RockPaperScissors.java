import java.util.Scanner;

public class Contains {

    public static int[] contest(String userThrow){
        int[] results = new int[2];
        char lettermanChar = userThrow.charAt(0);
        switch (indexedChar) {
        case 'R':
            if(userThrow.charAt(1) == 'S'){
                results[0]++;
            }else if(userThrow.charAt(1) == 'P'){

            }else{
                 
            }
        break;
        case 'S':
            if(userThrow.charAt(1) == 'S'){

            }else if(userThrow.charAt(1) == 'P'){

            }else{
                
            }
        break;
        case 'P':
            if(userThrow.charAt(1) == 'S'){

            }else if(userThrow.charAt(1) == 'P'){

            }else{
                
            }
        break;
    
        default:
            break;
        }

        return winner;
    }

    public static void main(String[] args){
        /*
        * It is unnecessary to edit the "main" method of each problem's provided code
        * skeleton. The main method is written for you in order to help you conform to
        * input and output formatting requirements.
        */
        Scanner scanner = new Scanner(System.in);
        String userInput;
        int[] winner = {};
        int numberOfCases = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < numberOfCases; i++){
            do{
                userInput = scanner.nextLine();
                winner = contest(userInput);
            }while(userInput.toLowerCase() != "end");
            if(winner[0] > winner[1]){
                System.out.println("Regis wins");
            }else if(winner[1] > winner[0]){
                System.out.println("David wins");
            }else{
                System.out.println("Tie");
            }
        }
    }
}
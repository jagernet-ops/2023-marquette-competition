import java.util.Scanner;

public class RockPaperScissors {

    public static int[] contest(String userThrow){
        int[] results = new int[3];
        char lettermanChar = userThrow.charAt(0);
        switch (lettermanChar) {
        case 'R':
            if(userThrow.charAt(1) == 'S'){
                results[0]++;
            }else if(userThrow.charAt(1) == 'P'){
                results[1]++;
            }else{
                results[0]++;
                results[1]++;
            }
        break;
        case 'S':
            if(userThrow.charAt(1) == 'R'){
                results[1]++;
            }else if(userThrow.charAt(1) == 'P'){
                results[0]++;
            }else{
                results[0]++;
                results[1]++;
            }
        break;
        case 'P':
            if(userThrow.charAt(1) == 'S'){
                results[1]++;
            }else if(userThrow.charAt(1) == 'R'){
                results[0]++;
            }else{
                results[0]++;
                results[1]++;
            }
        break;
    
        default:
            break;
        }

        return results;
    }

    public static void main(String[] args){
        /*
        * It is unnecessary to edit the "main" method of each problem's provided code
        * skeleton. The main method is written for you in order to help you conform to
        * input and output formatting requirements.
        */
        Scanner scanner = new Scanner(System.in);
        String userInput;
        int[] winner = new int[3];
        int numberOfCases = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < numberOfCases; i++){
            while(true){
                userInput = scanner.nextLine();
                if(userInput.toLowerCase().equals("end")){
                    break;
                }else{
                    int [] results = contest(userInput);
                    for(int j = 0; j < results.length; j++){
                        winner[j] += results[j];
                    }
                }
            }
            if(winner[0] > winner[1]){
                System.out.println("David wins");
            }else if(winner[1] > winner[0]){
                System.out.println("Regis wins");
            }else{
                System.out.println("Tie");
            }
        }
        scanner.close();
    }
}
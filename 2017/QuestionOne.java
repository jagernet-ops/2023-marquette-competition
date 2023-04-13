import java.util.Scanner;

public class QuestionOne {
    
    //The main method handles standard input and output
    //You should not change this method
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for(int i = 0; i < num; i++){
            int left = scanner.nextInt();
            String op = scanner.next();
            int right = scanner.nextInt();
            System.out.println(calculate(left, op, right));
        }
        scanner.close();
    }
    
    public static int calculate(int left ,String op, int right){
        if(op.equals("*")) {
            return left * right;
        }

        if(op.equals("/")) {
            if(right == 0) {
                return 0;
            }
            return left / right;
        }

        if(op.equals("-")) {
            return left - right;
        }
        
        return left + right;
    }
}
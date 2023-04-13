package problems;
import java.util.Scanner;

public class Sunrise {
    
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
    
    public static int calculate(int left, String op, int right){
        if (op.equals("/")) {
            try {
                return (left / right);
            } catch (Exception e) {
                return 0;
            }
        }
        else if (op.equals("*")) {
            return (left * right);
        }
        else if (op.equals("+")) {
            return (left + right);
        }
        else {
            return (left - right);
        }
    }
}
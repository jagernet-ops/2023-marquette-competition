import java.util.*;

public class PasswordStrength {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int cases = keyboard.nextInt();
        keyboard.nextLine();
        for (; cases > 0; cases--) {
            String[] arguments = keyboard.nextLine().split(" ");
            if (isAcceptablePassword(arguments[0], arguments[1], arguments[2], Integer.parseInt(arguments[3]), Integer.parseInt(arguments[4]), Integer.parseInt(arguments[5])))
                System.out.println("OK");
            else
                System.out.println("INVALID");
        }
        keyboard.close();
    }

    public static boolean isAcceptablePassword(String password, String userFirstName, String userLastName, int birthYear, int birthMonth, int birthDay) {
        boolean isAcceptable = true;

        // TODO: set "isAcceptable" to false if the password violates any of the requirements, otherwise leave "isAcceptable" true

        return isAcceptable;
    }
}
public class RockPaperScissors {
    public static void main(String[] args) {
        System.out.println(zoom("SP"));
    }

    public static String zoom(String test) {
        char letterman = test.charAt(0);
        char regis = test.charAt(1);
        int wins_l = 0;
        int wins_r = 0;

        if (letterman == 'R' && regis == 'S') {
            wins_l++;
        }
        if (letterman == 'R' && regis == 'P') {
            wins_r++;
        }
        if (letterman == 'P' && regis == 'R') {
            wins_l++;
        }
        if (letterman == 'S' && regis == 'R') {
            wins_r++;
        }
        if (letterman == 'S' && regis == 'P') {
            wins_l++;
        }
        if (letterman == 'P' && regis == 'S') {
            wins_r++;
        }

        if (wins_l > wins_r) {
            return "letterman wins";
        }
        else if (wins_r > wins_l) {
            return "regis wins";
        }
        else {
            return ""+wins_l + wins_r;
        }
    }
}

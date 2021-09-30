
import java.util.*;

public class Tryrun {
    public static void main(String[] args) {
        RaffleCup cup1 = new RaffleCup();
        Player player1 = new Player(cup1, "player 1");
        Player player2 = new Player(cup1, "player 2");
        System.out.println("Welcome to the dice game press enter to play and to countinue playing after rolling ");
        while (!player1.win && !player2.win) {
            Scanner input = new Scanner(System.in);
            String turn = input.nextLine();
            cup1.roll();
            player1.redirectPoint(cup1);
            if (player1.win) {
                break;
            }
            String turnp2 = input.nextLine();
            cup1.roll();
            player2.redirectPoint(cup1);
            if (player2.win) {
                break;
            }


        }




    }
}

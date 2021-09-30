import java.util.Scanner;

public class Spil{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Defines variables such as Players and dies
        int Player1 = 0;
        int Player2 = 0;
        int Die1;
        int Die2;

        //Creating a loop collecting points for Player1 and Player2
        while (true) {
            //Getting total points for Player1

                Die1 = (int) (Math.random() * 6 + 1);
                Die2 = (int) (Math.random() * 6 + 1);
                Player1 = Player1 + Die1 + Die2;
                System.out.println("Spiller 1's points med kastene:" + Die1 + " og " + Die2 + " Totale points = " + Player1);
                if (Die1 == 1 && Die2 == 1) {
                    System.out.println("Player2 wins");
                    break;
                }
                if(Die1==6&&Die1==Die2){
                    System.out.println("Player1 wins");
                    break;
                }



            //Special condition for extra turn
            if (Die1 == Die2) {
                Die1 = (int) (Math.random() * 6 + 1);
                Die2 = (int) (Math.random() * 6 + 1);
                Player1 = Player1 + Die1 + Die2;
                System.out.println("Spiller 1's points med kastene:" + Die1 + " og " + Die2 + " Totale points = " + Player1);

            }
            if (Die1 == 1 && Die2 == 1) {
                System.out.println("Player 2 wins");
                break;
            }
            if(Die1==6&&Die1==Die2){
                System.out.println("Player1 wins");
                break;
            }

            //Getting total points for Player2
            Die1 = (int) (Math.random() * 6 + 1);
            Die2 = (int) (Math.random() * 6 + 1);
            Player2 = Player2 + Die1 + Die2;
            System.out.println("Spiller 2's points med kastene:" + Die1 + " og " + Die2 + " Totale points = " + Player2);
            if (Die1 == 1 && Die2 == 1) {
                System.out.println("Player 1 wins");
                break;
            }
            if(Die1==6&&Die1==Die2){
                System.out.println("Player2 wins");
                break;
            }
            //Special condition for extra turn
            if (Die1 == Die2) {
                Die1 = (int) (Math.random() * 6 + 1);
                Die2 = (int) (Math.random() * 6 + 1);
                Player2 = Player2 + Die1 + Die2;
                System.out.println("Spiller 2's points med kastene:" + Die1 + " og " + Die2 + " Totale points = " + Player2);
            }
            if (Die1 == 1 && Die2 == 1) {
                System.out.println("Player 1 wins");
                break;
            }
            if(Die1==6&&Die1==Die2){
                System.out.println("Player2 wins");
                break;
            }

            //Creating a condition for the loop to end
            if (Player1 >= 40 || Player2 >= 40) {
                break;
            }
        }
            //Prints out results of the game
            if (Player1 >=40 && Player1 > Player2) {
                System.out.println("Player1 vinder");
            }

            if (Player2 >= 40 && Player2 > Player1) {
                System.out.println("Player2 vinder");
            }

            if (Player1 == Player2 && Player1 >= 40) {
                System.out.println("Uafgjort");
            }
    }
}

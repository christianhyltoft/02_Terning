public class Testforsøg {
    public static void main(String[] args) {
        RaffleCup cup1 = new RaffleCup();
        RaffleCup cup2 = new RaffleCup();
        Player player1 = new Player(cup1, "player1");
        Player player2 = new Player(cup1, "player2");
        /*while (player1.points<40) {
            cup1.roll();
            cup1.print();
            player1.redirectPoint(cup1);
            cup2.roll();
            cup2.print();
            player2.redirectPoint(cup2);*/
        cup1.test();



        }

    }

import java.util.*;

public class Player {
    String inname;
    RaffleCup incup;
    int points;
    boolean win = false;



    public Player(RaffleCup cup, String name) {
        inname = name;
        incup = cup;
    }


    public void redirectPoint(RaffleCup x) {
        if (win) {

        } else {
            if (x.interning2 == x.interning1) {
                samefaces(x);
            } else {
                awardpoint(x);


            }
        }
    }

    private void awardpoint(RaffleCup x) {
        points = points + x.interning1 + x.interning2;
        System.out.println(inname + " You now have " + points + " Points");

    }

    private void samefaces(RaffleCup x) {
        if (points >= 40) {
            if (x.interning1 == x.interning2 && x.interning1!=1) {
                win();
            }

        } else {


            if (x.interning1 == 1) {
                points = 0;
                System.out.println(inname + " Your points have been reset, and now you have " + points + " Points");
                reroll(x);
            } else if (x.interning1 == 6) {
                points = points + x.interning1 + x.interning2;
                printpoint();
                System.out.println("Congratulations you may now roll again if you roll to 6's you win the game");

                x.roll();
                if (x.interning1 == 6 && x.interning2 == 6) {
                    win();
                }
                if (x.interning1 == 1) {
                    points = 0;
                    System.out.println(inname + " Your points have been reset, and now you have " + points + " Points");
                    reroll(x);}


            } else {
                points = points + x.interning1 + x.interning2;
                printpoint();
                reroll(x);
            }
        }
    }

    private void reroll(RaffleCup x) {
        System.out.println("Congratulations you may now roll again");
        Scanner rollagain= new Scanner(System.in);
        String inpt=rollagain.nextLine();
        x.roll();
        redirectPoint(x);


    }

    private void win() {
        win = true;
        System.out.println(inname + " Has won the game");

    }
    private void printpoint(){
        System.out.println(inname + " You now have " + points + " Points");
    }


}




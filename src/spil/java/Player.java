import java.util.*;

public class Player {
    final String inname;
    final RaffleCup incup;
    private int points;
    boolean win = false;

    public int getPoints() {
        return points;
    }

    public boolean getWin() {
        return win;
    }

    public void setPoint(int setPoints) {
        points = setPoints;
    }

    public void setWin(boolean setWin) {
        win = setWin;
    }

    public Player(RaffleCup cup, String name) {
        inname = name;
        incup = cup;
    }

    //Vurderer om spilleren har sloet lige eller ulige, og sender videre til andre metoder. gør intet hvis en spiller har vundet.
    public void redirectPoint(RaffleCup x) {
        if (win) {

        } else {
            if (x.getInterning1() == x.getInterning2()) {
                samefaces(x);
            } else {
                awardpoint(x);
            }
        }
    }

    //Hvis spiller har forskellige slag for man bare point
    private void awardpoint(RaffleCup x) {
        points = points + x.getSum();
        System.out.println(inname + " You now have " + points + " Points");

    }

    // Hvis man får 2 ens kaldes denne metode.
    private void samefaces(RaffleCup x) {
        if (points >= 40) {
            if (x.getInterning1() == x.getInterning2() && x.getInterning1() != 1) {
                win();
            }

        } else {

            if (x.getInterning1() == 1) {
                points = 0;
                System.out.println(inname + " Your points have been reset, and now you have " + points + " Points");
                reroll(x);
            } else if (x.getInterning1() == 6) {
                points = points + x.getSum();
                printpoint();
                System.out.println("Congratulations you may now roll again if you roll two of the same kind you win the game");

                x.roll();
                if (x.getInterning1() == 6 && x.getInterning2() == 6) {
                    win();
                }
                if (x.getInterning1() == 1 && x.getInterning2() == 1) {
                    points = 0;
                    System.out.println(inname + " Your points have been reset, and now you have " + points + " Points");
                    reroll(x);
                }

            } else {
                points = points + x.getSum();
                printpoint();
                reroll(x);
            }
        }
    }

    // Reroll til hvis man slor to ens
    private void reroll(RaffleCup x) {
        System.out.println("Congratulations you may now roll again");
        Scanner rollagain = new Scanner(System.in);
        String inpt = rollagain.nextLine();
        x.roll();
        redirectPoint(x);
    }

    //setter win til true hvis en spiller har opfyldt en win condition.
    private void win() {
        win = true;
        System.out.println(inname + " Has won the game");

    }

    //Udprinter maengden af point spilleren har.
    private void printpoint() {
        System.out.println(inname + " You now have " + points + " Points");
    }
}




public class Player {
    String inname;
    RaffleCup incup;
    int points;

    public Player(RaffleCup cup, String name) {
        inname = name;
        incup = cup;
    }


    public void redirectPoint(RaffleCup x) {
        int t1 = x.interning1;
        ;
        int t2 = x.interning2;
        if (t1 == t2) {
            samefaces(t1, t2);
        } else {
            awardpoint(t1, t2);


        }
    }

    public boolean awardpoint(int x, int y) {
        points = points + x + y;
        System.out.println(inname + " You now have " + points + " Points");
        return false;

    }

    public void samefaces(int x, int y) {
        int t1 = x;
        int t2 = y;

        if (t1 == 1 && t2 == 1) {
            points = 0;
            System.out.println(inname + " Your points have been reset, and now you have " + points + " Points");

        }
        else {
            points = points + x + y;
            System.out.println(inname + " You now have " + points + " Points");
        }

        reroll();


    }

    public boolean reroll() {
        System.out.println("Hurra du må slå igen");
        return false;


    }

}


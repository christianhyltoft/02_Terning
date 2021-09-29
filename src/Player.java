public class Player {
    String inname;
    RaffleCup incup;
    int points;


    public Player(RaffleCup cup, String name) {
        inname = name;
        incup = cup;
    }


    public void redirectPoint(RaffleCup x) {

        if (x.interning2 == x.interning1) {
            samefaces(x);
        } else {
            awardpoint(x);


        }
    }

    public boolean awardpoint(RaffleCup x) {
        points = points + x.interning1 + x.interning2;
        System.out.println(inname + " You now have " + points + " Points");
        return false;

    }

    public void samefaces(RaffleCup x) {


        if (x.interning1 == 1) {
            points = 0;
            System.out.println(inname + " Your points have been reset, and now you have " + points + " Points");
            reroll();
        }
        else if(x.interning1==6){
            points = points + x.interning1 + x.interning2;


        }



         else{
            points = points + x.interning1 + x.interning2 ;
            System.out.println(inname + " You now have " + points + " Points");
            reroll();


        }



    }

    public boolean reroll() {
        System.out.println("Hurra du må slå igen");
        return false;


    }

}


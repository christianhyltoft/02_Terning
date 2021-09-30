import gui_main.*;
public class RaffleCup {
    int interning1;
    int interning2;
    int sum;
    GUI gui = new GUI();

    public void roll() {
        interning1 = (int) (Math.random() * 6 + 1);
        interning2 = (int) (Math.random() * 6 + 1);
        sum = interning1 + interning2;
        gui.setDice(interning1,interning2);


    }
    public void setGUi(GUI x){

    }

    public void print() {
        System.out.println("Du slog " + interning1 + "," + interning2 + " Med summen " + sum);

    }

    public void test() {
        int j = 0;
        int count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0, count7 = 0,
                count8 = 0, count9 = 0, count10 = 0, count11 = 0, count12 = 0;
        while (j < 1000) {
            j = j + 1;
            roll();
            switch (sum) {
                case 2:
                    count2++;
                    break;
                case 3:
                    count3++;
                    break;
                case 4:
                    count4++;
                    break;
                case 5:
                    count5++;
                    break;

                case 6:
                    count6++;
                    break;
                case 7:
                    count7++;
                    break;
                case 8:
                    count8++;
                    break;
                case 9:
                    count9++;
                    break;
                case 10:
                    count10++;
                    break;
                case 11:
                    count11++;
                    break;
                case 12:
                    count12++;
                    break;
            }
        }
        System.out.println("Antal af summen 2 " + count2);
        System.out.println("Antal af summen 3 " + count3);
        System.out.println("Antal af summen 4 " + count4);
        System.out.println("Antal af summen 5 " + count5);
        System.out.println("Antal af summen 6 " + count6);
        System.out.println("Antal af summen 7 " + count7);
        System.out.println("Antal af summen 8 " + count8);
        System.out.println("Antal af summen 9 " + count9);
        System.out.println("Antal af summen 10 " + count10);
        System.out.println("Antal af summen 11 " + count11);
        System.out.println("Antal af summen 12 " + count12);

    }
}



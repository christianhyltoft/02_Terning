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
        gui.setDice(interning1, interning2);
        print();
    }

    private void testRoll() {
        interning1 = (int) (Math.random() * 6 + 1);
        interning2 = (int) (Math.random() * 6 + 1);
        sum = interning1 + interning2;
        gui.setDice(interning1, interning2);
    }

    private void print() {
        System.out.println("you rolled " + interning1 + "," + interning2 + " with the sum " + sum);
    }

    public void test() {
        int j = 0;
        int count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0, count7 = 0,
                count8 = 0, count9 = 0, count10 = 0, count11 = 0, count12 = 0;
        int par1 = 0, par2 = 0, par3 = 0, par4 = 0, par5 = 0, par6 = 0;

        while (j < 1000) {
            j = j + 1;
            testRoll();
            switch (sum) {
                case 2 -> count2++;
                case 3 -> count3++;
                case 4 -> count4++;
                case 5 -> count5++;
                case 6 -> count6++;
                case 7 -> count7++;
                case 8 -> count8++;
                case 9 -> count9++;
                case 10 -> count10++;
                case 11 -> count11++;
                case 12 -> count12++;
            }
            if (interning1 == interning2) {
                switch (interning1) {
                    case 1 -> par1++;
                    case 2 -> par2++;
                    case 3 -> par3++;
                    case 4 -> par4++;
                    case 5 -> par5++;
                    case 6 -> par6++;
                }
            }
        }
        // Counts the sum of available outcomes
        System.out.println("Total sum of 2: " + count2);
        System.out.println("Total sum of 3: " + count3);
        System.out.println("Total sum of 4: " + count4);
        System.out.println("Total sum of 5: " + count5);
        System.out.println("Total sum of 6: " + count6);
        System.out.println("Total sum of 7: " + count7);
        System.out.println("Total sum of 8: " + count8);
        System.out.println("Total sum of 9: " + count9);
        System.out.println("Total sum of 10: " + count10);
        System.out.println("Total sum of 11: " + count11);
        System.out.println("Total sum of 12: " + count12);

        // Counts the sum of a given pair
        System.out.println("Total amount of pairs of 1: " + par1);
        System.out.println("Total amount of pairs of 2: " + par2);
        System.out.println("Total amount of pairs of 3: " + par3);
        System.out.println("Total amount of pairs of 4: " + par4);
        System.out.println("Total amount of pairs of 5: " + par5);
        System.out.println("Total amount of pairs of 6: " + par6);
        System.out.println("Combined sum of pairs: " + (par1 + par2 + par3 + par4 + par5 + par6));
    }
}



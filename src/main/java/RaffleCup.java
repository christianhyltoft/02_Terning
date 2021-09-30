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
        gui.setDice(interning1, interning2);}


    private void print() {
        System.out.println("you rolled " + interning1 + "," + interning2 + " with the sum " + sum);

    }

    public void test() {
        int j = 0;
        int count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0, count7 = 0,
                count8 = 0, count9 = 0, count10 = 0, count11 = 0, count12 = 0;
        int par1=0,par2=0,par3=0,par4=0,par5=0,par6=0;

        while (j < 1000) {
            j = j + 1;
            testRoll();
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
            if (interning1 == interning2) {
                switch (interning1) {
                    case 1:
                        par1++;
                        break;
                    case 2:
                        par2++;
                        break;
                    case 3:
                        par3++;
                        break;
                    case 4:
                        par4++;
                        break;

                    case 5:
                        par5++;
                        break;
                    case 6:
                        par6++;
                        break;

                }
            }




        }
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

        System.out.println("Total amount of pairs of 1: " + par1);
        System.out.println("Total amount of pairs of 2: " + par2);
        System.out.println("Total amount of pairs of 3: " + par3);
        System.out.println("Total amount of pairs of 4: " + par4);
        System.out.println("Total amount of pairs of 5: " + par5);
        System.out.println("Total amount of pairs of 6: " + par6);
        System.out.println("Combined sum of pairs: " + (par1 + par2 +par3 + par4 + par5 + par6));
    }}



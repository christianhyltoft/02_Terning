import gui_main.GUI;


public class RaffleCupTest {
    private int interning1;
    private int interning2;
    private int sum;

    public int getInterning1() {
        return interning1;
    }

    public int getInterning2() {
        return interning2;
    }

    public int getSum() {
        return sum;
    }

    public void roll() {
        interning1 = (int) (Math.random() * 6 + 1);
        interning2 = (int) (Math.random() * 6 + 1);
        sum = interning1 + interning2;
    }
    public void test() {
        int j = 0;
        int count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0, count7 = 0,
                count8 = 0, count9 = 0, count10 = 0, count11 = 0, count12 = 0;
        int par1=0,par2=0,par3=0,par4=0,par5=0,par6=0;

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

        System.out.println("Antal par 1 " + par1);
        System.out.println("Antal par 2 " + par2);
        System.out.println("Antal par 3 " + par3);
        System.out.println("Antal par 4 " + par4);
        System.out.println("Antal par 5 " + par5);
        System.out.println("Antal par 6 " + par6);
    }
}



import gui_main.*;

//Klasse med Rafflebaeger
public class RaffleCup {
    private int interning1;
    private int interning2;
    private int sum;
    private GUI gui = new GUI();

    public int getInterning1() {
        return interning1;
    }

    public int getInterning2() {
        return interning2;
    }

    public int getSum() {
        return sum;
    }

    // metode der aendrer vaerdig på de to variable or derefter summen
    public void roll() {
        interning1 = (int) (Math.random() * 6 + 1);
        interning2 = (int) (Math.random() * 6 + 1);
        sum = interning1 + interning2;
        gui.setDice(interning1, interning2);
        print();
    }


    private void print() {
        System.out.println("you rolled " + interning1 + "," + interning2 + " with the sum " + sum);
    }


}
// Counts the sum of available outcomes






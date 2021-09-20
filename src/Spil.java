public class Spil {
    public static void main(String[] args) {
        int Player1=0;
        int Player2=0;
        int Die1;
        int Die2;
        int t=0;


        Die1 = (int) (Math.random() * 6 + 1);
        Die2 = (int) (Math.random() * 6 + 1);
        Player1 = Player1 + Die1 + Die2;
        System.out.println("Spiller 1's points: " + Player1);


        Die1 = (int) (Math.random() * 6 + 1);
        Die2 = (int) (Math.random() * 6 + 1);
        Player2 = Player2 + Die1 + Die2;
        System.out.println("Spiller 2's points: " + Player2);

        }
    }



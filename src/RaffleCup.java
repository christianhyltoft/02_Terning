public class RaffleCup {
    int interning1;
    int interning2;
    int sum;
    public void roll(){
        interning1=(int) (Math.random()*6+1);
        interning2=(int) (Math.random()*6+1);
        sum=interning1+interning2;
    }
    public void print(){
        System.out.println("Du slog "+interning1+","+interning2+" Med summen "+sum);

    }




}

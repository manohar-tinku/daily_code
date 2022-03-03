package day_5;

public class MinMaxPair {
    public static void main(String[] args) {
        System.out.println(car(cons(3,5)));
        System.out.println(cdr(cons(3,4)));
    }
    public static Pair cons(int a,int b){
        return new Pair(a,b);
    }
    public static int car(Pair pair){
        return Math.min(pair.getA(), pair.getB());
    }
    public static int cdr(Pair pair){
        return Math.max(pair.getA(), pair.getB());
    }
}
class Pair{
    private int a;
    private int b;
    Pair(int a,int b){
        this.a=a;
        this.b=b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}


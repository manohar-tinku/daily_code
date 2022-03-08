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

record Pair(int a, int b) {

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

}


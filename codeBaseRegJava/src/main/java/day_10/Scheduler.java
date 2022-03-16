package day_10;

public class Scheduler {

    public static void main(String[] args) {
        Perform p=new Perform();
        schedule(5,p);
    }

    private static void schedule(int time,Perform p){
        System.out.println(System.currentTimeMillis());
        try{
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        p.add();
        System.out.println(System.currentTimeMillis());
    }


}

class Perform{
    void add(){
        System.out.println(10+10);
    }
}

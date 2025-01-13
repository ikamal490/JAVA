package _74_Thread_Priorities;
/*
    java.lang.Thread.MIN_PRIORITY
    java.lang.Thread.NORM_PRIORITY
    java.lang.Thread.MAX_PRIORITY
 */
class MyTh extends Thread{
    public MyTh(String name){ // overloaded constructor
        super(name);
    }
    @Override
    public void run(){
        System.out.println("Thank You BTECH  " + this.getName()); // Execute at least one time for each function
        int i=0;
        while(i<1){
            System.out.println("Thank You " + this.getName());
           i++;
       }
    }
}
public class Thread_Priorities {
    public static void main(String[] args) {
        // Ready Queue: t1, t2 t3, t4 t5
        MyTh t1 = new MyTh("1");
        MyTh t2 = new MyTh("Guru 2");
        MyTh t3 = new MyTh("GAMERS (Most Important Work) 3");
        MyTh t4 = new MyTh("SPORTS 4 ");
        MyTh t5 = new MyTh("Mumbai 5 ");
        t3.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t1.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        // The start() method makes the thread run in the background while other things happen.
    }
}

package _76_Questions_on_Thread;
/*
    Problem: Demonstrate getPriority() and setPriority() methods
                in java Thread
 */
class MyThread extends Thread{
    public void run(){
        System.out.println("I am Setting Priority for t1");
    }
}
class MyThread1 extends Thread{
    public void run(){
        System.out.println("I am Setting Priority for t2 ");
    }
}
public class Question03 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread1 t2 = new MyThread1();
        t1.setPriority(9);
        System.out.println(t1.getPriority());
        t2.setPriority(7);
        System.out.println(t2.getPriority());
        t2.start();
        t1.start();
    }
}

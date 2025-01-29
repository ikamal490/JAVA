package _76_Questions_on_Thread;
/*
    How do you get reference to the current thread in java
 */
class MyThre1 extends Thread{
    public void run(){
        while(true){
            System.out.println("I am Thread class");
        }
    }
}
class MyThre extends Thread{
    public void run(){
        System.out.println("I am Super Man ");
    }
}
public class Question05 {
    public static void main(String[] args) {
            MyThread t1 = new MyThread();
            MyThread1 t2 = new MyThread1();
        System.out.println(Thread.currentThread().getState());
    }
}
/*
Output:
    RUNNABLE
 */

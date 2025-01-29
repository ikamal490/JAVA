package _76_Questions_on_Thread;
/*
    Problem: How do you get state of a given thread in java.
 */
class MyThread3 extends Thread{
    public void run(){
        while(true){
        System.out.println("I am Thread class");
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        System.out.println("I am Super Man ");
    }
}
public class Question04 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread1 t2 = new MyThread1();
        System.out.println(t1.getState());
    }
}
/*
Output:
    NEW
 */

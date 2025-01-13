package _75_Thread_Methods;

class MyThread1 extends Thread{
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("I am running...");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("I am sleeping...");
            i++;
        }
    }
}
public class Thread_Methods {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start();
        try{
            t1.join();  // First fully execute the t1 object then after run the t2 object
        }
        catch(Exception e){
            System.out.println(e);
        }
        t2.start();
    }
}

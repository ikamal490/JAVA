package _76_Questions_on_Thread;
/*
    Problem: Add a sleep method in Welcome thread of question1 to
                delay its execution for 2000 ms.
 */
class Pen1 extends Thread{
    public void run(){
        int i=0;
        while(i<500){ // continuously infinite loop
            System.out.println("\" Good Morning \"");
            i++;
        }
    }
}
class Pen2 extends Thread{
    public void run(){
        int i=0;
        while(i<500){  // continuously infinite loop
            try{
                Thread.sleep(1); // delay execution by 200 milliseconds
            }
            catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("\"  hello shefali how are you are you fine \"");
            i++;
        }
    }
}
public class Question02 {
    public static void main(String[] args) {
        Pen1 r1 = new Pen1();
        Pen2 r2 = new Pen2();
        r1.start();
        r2.start();
    }
}
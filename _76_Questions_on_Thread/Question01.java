package _76_Questions_on_Thread;
/*
    Problem: WAP to print the "Good Morning" and "Welcome" continuously
             on the screen in Java using Threads.
 */
class Room1 extends Thread{
    public void run(){
        int i=0;
        while(true){ // continuously infinite loop
            System.out.println("\" Good Morning \"");
            i++;
        }
    }
}
class Room2 extends Thread{
    public void run(){
        int i=0;
        while(true){  // continuously infinite loop
            System.out.println("\" Welcome \"");
            i++;
        }
    }
}
public class Question01 {
    public static void main(String[] args) {
        Room1 r1 = new Room1();
        Room2 r2 = new Room2();
        r1.start();
        r2.start();
    }
}

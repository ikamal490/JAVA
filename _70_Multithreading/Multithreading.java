package _70_Multithreading;

class Mythread1 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<25){
        System.out.println("I am Chatting with Shefali ");
        i++;
        }
    }
}
class Mythread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<25){
            System.out.println("I am Cooking ");
            i++;
        }
    }
}
class Mythread3 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<25){
            System.out.println(" 490 ");
            i++;
        }
    }
}
public class Multithreading {
    public static void main(String[] args) {
        Mythread1 t1 = new Mythread1();
        Mythread2 t2 = new Mythread2();
        Mythread3 t3 = new Mythread3();
        t1.start();
        t2.start();
        t3.start();
        // The start() method makes the thread run in the background while other things happen.
    }
}
/*
Output:
I am Chatting with Shefali
I am Chatting with Shefali
I am Cooking
I am Cooking
I am Cooking
I am Cooking
I am Cooking
I am Cooking
I am Cooking
I am Cooking
I am Cooking
I am Cooking
I am Cooking
I am Cooking
I am Cooking
I am Cooking
I am Cooking
 490
 490
 490
 490
 490
 490
 490
 490
 490
 490
 490
 490
 490
 490
 490
 490
 490
 490
 490
 490
 490
 490
 490
 490
 490
I am Chatting with Shefali
I am Chatting with Shefali
I am Chatting with Shefali
I am Chatting with Shefali
I am Chatting with Shefali
I am Chatting with Shefali
I am Chatting with Shefali
I am Chatting with Shefali
I am Chatting with Shefali
I am Chatting with Shefali
I am Cooking
I am Chatting with Shefali
I am Chatting with Shefali
I am Chatting with Shefali
I am Chatting with Shefali
I am Chatting with Shefali
I am Chatting with Shefali
I am Chatting with Shefali
I am Cooking
I am Cooking
I am Cooking
I am Cooking
I am Cooking
I am Cooking
I am Cooking
I am Cooking
I am Cooking
I am Chatting with Shefali
I am Chatting with Shefali
I am Chatting with Shefali
I am Chatting with Shefali
I am Chatting with Shefali
I am Chatting with Shefali

Process finished with exit code 0
 */

package _71_Thread_Using_Runnable_Interface;

class MyThreadRunable1 implements Runnable{
    public void run() {
        int i = 0;
        while(i<25){
            System.out.println("You are so gorgeous Shefali ");
            i++;
        }
    }
}
class MyThreadRunable2 implements Runnable{
    public void run() {
        int i = 0;
        while(i<25){
        System.out.println("Looks like a moon !");
            i++;
        }
    }
}
public class Thread_runnable {
    public static void main(String[] args) {
        MyThreadRunable1 bullet1 = new MyThreadRunable1();
        Thread gun1 = new Thread(bullet1);

        MyThreadRunable2 bullet2 = new MyThreadRunable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
/*
Output:
You are so gorgeous Shefali
You are so gorgeous Shefali
You are so gorgeous Shefali
You are so gorgeous Shefali
You are so gorgeous Shefali
You are so gorgeous Shefali
You are so gorgeous Shefali
You are so gorgeous Shefali
You are so gorgeous Shefali
You are so gorgeous Shefali
You are so gorgeous Shefali
You are so gorgeous Shefali
Looks like a moon !
Looks like a moon !
Looks like a moon !
Looks like a moon !
Looks like a moon !
Looks like a moon !
Looks like a moon !
You are so gorgeous Shefali
You are so gorgeous Shefali
You are so gorgeous Shefali
You are so gorgeous Shefali
You are so gorgeous Shefali
You are so gorgeous Shefali
You are so gorgeous Shefali
You are so gorgeous Shefali
You are so gorgeous Shefali
You are so gorgeous Shefali
You are so gorgeous Shefali
You are so gorgeous Shefali
You are so gorgeous Shefali
Looks like a moon !
Looks like a moon !
Looks like a moon !
Looks like a moon !
Looks like a moon !
Looks like a moon !
Looks like a moon !
Looks like a moon !
Looks like a moon !
Looks like a moon !
Looks like a moon !
Looks like a moon !
Looks like a moon !
Looks like a moon !
Looks like a moon !
Looks like a moon !
Looks like a moon !
Looks like a moon !

Process finished with exit code 0
 */

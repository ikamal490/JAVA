package _73_Constructors_from_Thread;

class MyThread1 extends Thread{
    public MyThread1(String name){ // constructor
        super(name);
    }
    @Override
    public void run(){
        int i=0;
        while(i<7){
            System.out.println("I am KD");
            i++;
        }
    }
}
public class Constructors_from_Thread {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1("Kamal");
        MyThread1 t2 = new MyThread1("Shefali");
        t1.start();
//         The start() method makes the thread run in the background while other things happen.
        System.out.println("The id of the 1st thread is : " + t1.getId());
        System.out.println("The Name  of the 1st thread is : " + t1.getName());
        System.out.println("The ID of 2nd thread is : " +t2.getId());
        System.out.println("The Name of 2nd thread is : " +t2.getName());
    }
}
/*
Output:
    I am KD
    I am KD
    I am KD
    I am KD
    I am KD
    I am KD
    I am KD
    The id of the 1st thread is : 21
    The Name  of the 1st thread is : Kamal
    The ID of 2nd thread is : 22
    The Name of 2nd thread is : Shefali
 */

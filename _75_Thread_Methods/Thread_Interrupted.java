package _75_Thread_Methods;

class MyThr1 extends Thread{
    public void run(){
        int i=0;
        while(true){
            System.out.println("I am running...");
            try {
                Thread.sleep(3443);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
                  i++;
        }
        /*
            How it works:
            step 1- I am running execute hoga
            step 2- Phir 3232 milli-seconds ke liye ruk jayega
            step 3- jab tak 3232 milli-seconds complete nhi hogi, tab tak I am sleeping print hoga
            step 4- I am sleeping... print karne ki speed 1343 milli-seconds hai
            step 5- Jab 3232 milli-seconds complete ho jayegi phir "I am running" execute hoga ek baar
         */
    }
}
class MyThr2 extends Thread{
    public void run(){
        int i=0;
        while(true){
            try {
                Thread.sleep(1343);
            } catch (Exception e) {
                System.out.println(e); // same method as above
            }
            System.out.println("I am sleeping...");
            i++;
        }
    }
}
public class Thread_Interrupted {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1();
        MyThr2 t2 = new MyThr2();
        t1.start();
        t2.start();
    }
}

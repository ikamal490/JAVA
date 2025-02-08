package MyPractice_code;
/*
    Problem: Create a class `Car` with methods to print
             "starting", "accelerating", "braking", "stopping".
 */

class Car{
    public void accelerating(){
        System.out.println("Accelerating...");
    }
    public void starting(){
        System.out.println("Starting...");
    }public void braking(){
        System.out.println("braking...");
    }public void stopping(){
        System.out.println("stopping...");
    }
}
public class _080_OOPs {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.accelerating();
        obj.starting();
        obj.braking();
        obj.stopping();
    }

}

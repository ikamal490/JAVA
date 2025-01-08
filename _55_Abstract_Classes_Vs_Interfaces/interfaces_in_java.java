package _55_Abstract_Classes_Vs_Interfaces;
// Interface is the group of methods hai jinko implement jarur karna hai
interface Bicycle{
    int a = 45; // it is the final value we can't modify that
    final int a1 = 73;
    void applyBrake(int increment);
    void speedUp(int decrement);
}
interface MoterCycle{
    void applyDiskBrake();
    void applyGear();
}
class AvonCycle implements Bicycle,MoterCycle{ // Bicycle ke saare methods ko public karna hai or implement karna hai
    void blowHorn(){ // that is not part of the interfaces.
        System.out.println("pee pee poo poo ");
    }
    public void applyBrake(int increment){ // we have to make every method public in interface
        System.out.println("Applying Brake");
    }
    public void speedUp(int decrement){
        System.out.println("Applying SpeedUp");
    }
   public  void applyDiskBrake(){
        System.out.println("Brake on traffic light");
    }
    public void applyGear(){
        System.out.println("Moter Bike have 4 gears");
    }
}
public class interfaces_in_java {
    public static void main(String[] args) {
        AvonCycle myCycle = new AvonCycle();
        myCycle.speedUp(3);
        // You can create properties in Inheritance
        System.out.println(myCycle.a);
        // You cannot modify the properties in Inheritances as they are final
        //myCycle.a = 34; // thrown an error we can't modify
        myCycle.applyDiskBrake();
        myCycle.applyGear();
        myCycle.blowHorn();
    }
}
/*
Output:
    Applying SpeedUp
    45
    Brake on traffic light
    Moter Bike have 4 gears
    pee pee poo poo
 */

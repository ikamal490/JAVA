package _60_Questions_on_Abstract_Classes_and_Interfaces;
/*
    Question 04: Create a class Telephone with ring() , lift() and disconnect() methods as
                abstract methods. Create another class SmartTelephone and demonstrate polymorphism.
 */
abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnet();
}
class SmartTelephone extends Telephone{
    public void ring(){
        System.out.println("SmartPhone Ringing...");
    }
    public void lift(){
        System.out.println("Pick Up the SmartPhone");
    }
    public void disconnet(){
        System.out.println("Disconnecting...");
    }
    void play(){
        System.out.println("Playing Games... ");
    }
}
public class Question04 {
    public static void main(String[] args) {
        SmartTelephone sp = new SmartTelephone();
        sp.ring();
        sp.disconnet();
        sp.play();

        Telephone t = new SmartTelephone();
        t.disconnet();
        //t.play(); // Error ! -- play is not the part of the Telephone method, Telephone is the reference

        //Telephone t1 = new Telephone(); // Error !
        //SmartTelephone s = new Telephone();  // Error ! Here, Telephone is the object and Telephone is also an abstract class we don't made object of an abstract class
    }
}
/*
Output:
    SmartPhone Ringing...
    Disconnecting...
    Playing Games...
    Disconnecting...
 */


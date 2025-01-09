package _60_Questions_on_Abstract_Classes_and_Interfaces;

/*
    Question 01: Create an abstract class Pen with methods write() and refill() as
             abstract methods
    Question 02: Use the Pen class from Question 01 to create a concrete class
                FountainPen with additional methods changeNib()
 */
abstract class Pen{
    abstract void write ();
    abstract void refill();
}
class FountainPen extends Pen{
    public void write(){
        System.out.println("Writing using FountainPen");
    }
    public void refill(){
        System.out.println("Refilling FountainPen");
    }
     void changeNib(){
        System.out.println("Changing Nib for FountainPen");
    }
}
public class Question01or02 {
    public static void main(String[] args) {
        FountainPen fp = new FountainPen();
        fp.write();
        fp.changeNib();
        fp.refill();
    }
}
/*
Output:
    Writing using FountainPen
    Changing Nib for FountainPen
    Refilling FountainPen
 */

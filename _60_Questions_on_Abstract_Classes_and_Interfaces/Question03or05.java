package _60_Questions_on_Abstract_Classes_and_Interfaces;
/*
    Question 03: Create a class Monkey with jump() and bite() methods. Create a class Human
                 which inherits this Monkey class and implements BasicAnimal interface with eat() and sleep() methods.

     Question 05: Demonstrate polymorphism using monkey class from question 03.
 */
class Monkey{
    public void jump(){
        System.out.println("Monkey jumping");
    }
    public void bite(){
        System.out.println("Monkey biting");
    }
}
    interface BasicAnimal{
        void eat();
        void sleep();
    }
    class Human extends Monkey implements BasicAnimal{
        public void eat(){
            System.out.println("Kush eating");
        }
        public void sleep(){
            System.out.println("Kush sleeping");
        }
        public void kite(){
            System.out.println("Human Flying Kites on 14 January");
        }
    }
public class Question03or05 {
    public static void main(String[] args) {
        Human insaan = new Human();
        insaan.kite();
        insaan.sleep();
        insaan.bite();

        // Demonstrate polymorphism
        Monkey m1 = new Human();
        m1.jump();
        //m1.sleep(); // Cannot use sleep method because the reference is monkey which does not have a sleep method

        BasicAnimal b1 = new Human();
        b1.eat();
        b1.sleep();
        //b1.jump(); // error
    }
}
/*
Output:
    Human Flying Kites on 14 January
    Kush sleeping
    Monkey biting
    Monkey jumping
    Kush eating
    Kush sleeping
 */


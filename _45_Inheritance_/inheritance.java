package _45_Inheritance_;
class Base{  // ParentClass , SuperClass
   public int x;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        System.out.println("I am in base and setting X now  ");
        this.x = x;
    }
    public void printMe(){
        System.out.println("Ye Kya Kar Rahe Ho Bhai Tum !! ");
    }
}
class Derived extends Base{  // By using of extend Base ---> Base class ki sari items/cheeze Derived Class me copy ho jayegi
   // Derived class hai Base class se aa rahi hai bnn kar
  // means , Derived Class child hai Base class ka
    public int y;
    public int getY() {
        System.out.println("I am in child class ");
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class inheritance {
    public static void main(String[] args) {
        // Creating an object of Base class
        Base b = new Base();
        b.setX(10);
        System.out.println(b.getX());
        b.x = 34;  // we can also print like ths
        System.out.println(b.x); // we don't use of access modifiers , it not throws an error
        // We can't access Y from the Base class because it is in Derived Class

        /*
        b.setY(10);    // Kya kar rhe ho bhai
        System.out.println(b.getY());
        It throw an error because we can't access Y from the Base class
         */

        // Creating an object of Derived class
        Derived d = new Derived();
        d.setY(82);
        System.out.println(d.getY());
        d.setX(6969);
        System.out.println(d.getX());
        d.printMe();
        b.printMe();
    }
}
/*
    output

    I am in base and setting X now
    10
    34
    I am in child class
    82
    I am in base and setting X now
    6969
    Ye Kya Kar Rahe Ho Bhai Tum !!
    Ye Kya Kar Rahe Ho Bhai Tum !!

 */

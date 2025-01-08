package _53_Abstract_Class_and_Abstract_Methods;
/*
NOTES:
    Abstract Method: A method that is declared without any implementation

    Abstract Class: If a class includes abstract methods, then the class
                    itself must be declared abstract. An abstract class is a class that cannot be instantiated directly.
                    It's often used as a base class for other classes.
                    In your code, Parent is an abstract class:

             एक मछली पूरे तालाब को गंदा कर देती है |
              means ek abstract method pure class ko abstract bana deti hai
      Abstract class -- जिसका object नहीं बनाया जा सकता है |

      1. Abstract class --
        Key points about abstract classes:
        They are declared with the abstract keyword.
        They can have both abstract and non-abstract (concrete) methods.
        They can have constructors, instance variables, and static methods.
        You cannot create an object of an abstract class directly.

        2. Abstract Method --
        key points
        They are declared with the abstract keyword and don't have a body.
        They must be implemented by any concrete (non-abstract) subclass.
        They can only be declared in abstract classes.
 */
// Here parent is the abstract class
abstract class Parent{ // mera object mt banao, nhi toh error milega beta terko
    public Parent(){ // constructor made
        System.out.println("I am a constructor");
    }
    public void sayHello(){  //This is a concrete (non-abstract) method in the Parent class
        System.out.println("Hello");
    }
    public void iAmConcrete(){  //non-abstract method
        System.out.println("I am concrete");
    }
    // greet() and greet1() are abstract methods:
    abstract public void greet();
    abstract public void greet1();
}
class Child extends Parent{ // Child is a concrete class
    @Override
    public void greet(){
        System.out.println("Good Morning Shefali");
    }
    @Override
    public void greet1(){
        System.out.println("How are you !");
    }
    public void iAmConcrete1(){
        System.out.println("I am concrete 1");
    }
}
//    Child2 is another abstract class
abstract class Child2 extends Parent{ // Standard se Standard bana diya
    public void rule(){ // This is a concrete
        System.out.println("It's a rule to made it abstract class");
    }
}
public class abstract_class {
    public static void main(String[] args) {
//        Parent p = new Parent(); // 'Parent' is abstract class; cannot be instantiated thrown an error
        Child c = new Child();
//        Child2 c2 = new Child2(); // It is also an abstract class thrown an error; we can't make an object of an abstract class.
        c.greet();
        c.greet1();
        c.sayHello();
        c.iAmConcrete();
        c.iAmConcrete1();
    }
}
/*
Output:
    I am a constructor
    Good Morning Shefali
    How are you !
    Hello
    I am concrete
    I am concrete 1
 */

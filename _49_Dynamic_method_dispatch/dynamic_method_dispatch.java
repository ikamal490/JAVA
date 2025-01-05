package _49_Dynamic_method_dispatch;
/*
    Super obj = new Sub()  --> Allowed
    Sub obj = new Super()  --> Not Allowed

    Dynamic method dispatch is used to achieve the runtime polymorphism in java
    Polymorphism: - One entity many forms
    e.g - Smartphone --> Phone
    e.g - Smartphone --> Calculator
 */
class Phone{
    public void showTime(){
        System.out.println("Time is 9 A.M ");
    }
    public void on(){  // It is name naam ka function
        System.out.println("Turning on the Phone...");
    }
}
class SmartPhone extends Phone{
    public void playMusic(){
        System.out.println("Playing Music ...");
    }
    public void playGame(){
        System.out.println("Playing BGMI...");
    }
    @Override
    public void on(){  // method overriding
        System.out.println("Turning on SmartPhone...");
    }
}
public class dynamic_method_dispatch {
    public static void main(String[] args) {
        System.out.println("  By Using of Normal Method :- ");
        Phone vivo = new Phone(); //Allowed // object is made on run time
        SmartPhone smp = new SmartPhone(); // Allowed
        smp.playGame();
        vivo.showTime();
        vivo.on();
        smp.on();

        System.out.println("\n  By using of Dynamic method dispatch :- ");
        Phone obj = new SmartPhone(); // Allowed
        /*
            Here, phone is the parent class or superclass
                  and SmartPhone is the child or subclass

          So, reference (Phone) is Superclass and object(SmartPhone) is subclass,
              therefore, we can't get an error ... Hum esa kar sakte hai
         */

       // SmartPhone obj2 = new Phone(); // Not Allowed
        /*
            It is not allowed because here,
            reference(SmartPhone) is subclass and object (Phone) is parent class
            so, we get an error ... Hum esa nhi kar sakte hai
         */
        obj.on();  // Here, there are two 'on' functions; SmartPhone is subclass , so it will execute
        obj.showTime();  // It is a function of parent class (Phone) which is reference class, so it will execute
//        obj.playMusic(); // It is a function of subclass (SmartPhone) which is object class, so it will not execute // It throw an error
        // obj.playGame(); // throw an error
    }
}
/*
    Output

    By Using of Normal Method: -
Playing BGMI...
Time is 9 A.M
Turning on the Phone...
Turning on SmartPhone...

      By using of Dynamic method dispatch: -
  Turning on SmartPhone...
  Time is 9 A.M
 */

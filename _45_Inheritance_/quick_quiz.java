package _45_Inheritance_;
/*
    Quick Quiz : Create a class Animal and Derive another class Dog form it
 */
class Animal{
    String turtle;
    String rabbit;
    String dog;
    public String turtleProp(){
        return turtle = "Slow";
    }
    public String rabbitProp(){
        return rabbit = "Fast";
    }
    public String dogProp(){
        return dog = "Fast and Slow";
    }
}
class Dog extends Animal{
    String dog;
    public String dogBehaviour(){
        return dog = "Barking";
    }
}
public class quick_quiz {
    public static void main(String[] args) {
        Animal a = new Animal();  // It is a Base class
        System.out.println(a.turtleProp());
        System.out.println(a.rabbitProp() +"\n");

        Dog d = new Dog();  // It is Derived class
        System.out.println( d.turtleProp());
        System.out.println(d.dogBehaviour());
        System.out.println(d.dogProp());

        /*
           // Output
            Slow
            Fast

            Slow
            Barking
            Fast and Slow
         */
    }
}

package _46_Constructors_in_Inheritance;
// class 1  -- it is a parent class
class Base{
    Base(){  // made of constructor
        System.out.println("Me Base class ka Constructor hu !!");
    }
    Base(int x){  // overloaded constructor
        System.out.println("I am an overloaded constructor of Base class with value of x as: " +x);
        /*
            Child class doesn't print an overloaded constructor it will skip that ,
            to print that we have to use of super() function in derived class
         */
    }
}
// class 2 -- it is child or subclass of a Base class
class Derived extends Base{  // extends copy all the items of Base class
    Derived(){  // made of constructor
        //super(69);  // If we don't use of that it will run the without argument constructor  i.e; Base() only
        System.out.println("Me Derived Class ka Constructor hu !!");
        System.out.println("Let's check it is printing or not !");
    }
    Derived(int x , int y){
        super(x);
        System.out.println("I am an overloaded constructor of Derived with value of y as: " +y);
        System.out.println("Hellow"); // only class which have parameters can print that i.e; Derived d = new Derived(14,45); ||   ChildOfDerive cd = new ChildOfDerive(12,44,23);
    }
        }
// class 3  -- it is Grand child of a Base class
class ChildOfDerive extends Derived{  // It is a Grand child of Base class
//    extends copy all the items of Derived class + Base class ,because it is a Grand child
    ChildOfDerive(){
        System.out.println("I am a child of derived constructor ");
    }
    ChildOfDerive(int x,int y, int z){
        super(x,y);
        System.out.println("I am an overloaded constructor of ChildOfDerive with value of z as: " +z);
    }
        }
public class Constructors_in_Inheritance {
    public static void main(String[] args) {
        Base b = new Base();
//        Derived d = new Derived();
//        Derived d = new Derived(14,45);
//        ChildOfDerive cd = new ChildOfDerive();
        ChildOfDerive cd = new ChildOfDerive(12,44,23);


        // uncomment above code Run each and understand the logic behind the constructor
    }
}

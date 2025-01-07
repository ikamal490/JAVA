package _52_Question_on_Inheritance;
/*
    Create a class circle and use inheritance to
     create another class Cylinder from it.

     // Use of formula
     Area of Circle = pi*radius*radius
     Volume of Cylinder = pi*radius*radius*height
 */
class Circle{
     public int radius;
    Circle(){  // it's a constructor
        System.out.println("I am non parameterized constructor of circle ");
    }
    Circle(int r){  // overload constructor
        System.out.println("I am circle parameterized constructor ");
        this.radius = r;
    }
    public double area(){  // it's a method
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder extends Circle{
    public int height;
    Cylinder(){  // it's a constructor
        System.out.println("I am Cylinder non parameterized constructor :");
    }
    Cylinder(int r , int h){  // overload constructor
        super(r); // parent ke overload wale constructor ko run karega
        this.height = h;
        System.out.println("I am Cylinder parameterized constructor ");
//        super(r);  // Super ko hamesha first line me rakhte hai constructor ke, this line thrown an error
    }
    public double volume(){
    return Math.PI*this.radius*this.radius*height;
    }
}
public class Question01 {
    public static void main(String[] args) {
        Cylinder obj = new Cylinder(5,2);
        Circle obj1 = new Circle(8);  // Calling a method
        Cylinder obj2 = new Cylinder();
        System.out.println(obj.volume());
        System.out.println(obj1.radius);  // it will printout the radius
        System.out.println(obj1.area()); // output acc. to radius of obj1
        obj1.radius = 3;
        System.out.println(obj1.area());  // output acc. to radius 3 because we here set radius
        System.out.println(obj1.radius);
    }
}
/*
    Output
    I am circle parameterized constructor
    I am Cylinder parameterized constructor
    I am circle parameterized constructor
    I am non parameterized constructor of circle
    I am Cylinder non parameterized constructor :
    157.07963267948966
    8
    201.06192982974676
    28.274333882308138
    3
 */

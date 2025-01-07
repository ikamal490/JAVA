package _52_Question_on_Inheritance;
/*
    Create a class Rectangle and use inheritance to create another class Cuboid.
    Try to keep it as close to a real world scenario as possible.
 */
/*
Formula
Area of Rectangle = length*breadth;
Volume of Rectangle = length*breadth*height;
Volume of Cuboid = length*breadth*height;
Total surface area of cuboid = 2(length*breadth+height*breadth+length*height)
 */
class Rectangle{
    public int length;
    public int breadth;
    public int height;
    Rectangle(){ // default constructor
        System.out.println("I am a default constructor of Rectangle");
    }
//    Rectangle(){  // thrown an error of already defined
//        System.out.println("I am 2nd default constructor");
//    }
    Rectangle(int length, int breadth){ // overload constructor using 2 parameters
        System.out.println("I am an overloaded constructor of Rectangle class have 2 parameters");
    }
    Rectangle(int length, int breadth, int height){ // overload constructor using 3 parameters
        System.out.println("I am an overloaded constructor of Rectangle class have 3 parameters");
//        this.length = length;  //there is no use of these commented lines
//        this.breadth = breadth;
//        this.height = height;
    }
    public int areaOfRectangle(int length, int breadth){
        return length*breadth;
    }
    public int volumeOfRectangle(int length, int breadth, int height){
        return length*breadth*height;
    }
}
class Cuboid extends Rectangle{
    Cuboid(){
        System.out.println("I am a default constructor of Cuboid ");
    }
    Cuboid(int length, int breadth,int height) {
        super(length,breadth);
        //super(length, breadth, height); // thrown an error of super must be the first statement in constructor body
        System.out.println("overloaded constructor of Cuboid class have 3 parameters");
    }
    public int surfaceAreaOfCuboid(int length, int breadth,int height){
        return 2*length*breadth+2*height*breadth+2*length*height;
    }
    public int volumeOfCuboid(int length, int breadth, int height){
        return length*breadth*height;
    }
}
public class Question02 {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        Rectangle area = new Rectangle(2,3);
        Rectangle volume = new Rectangle(2,3,4);
        System.out.println(area.areaOfRectangle(2,3));
        volume.volumeOfRectangle(2,3,4); // not give any output, because we have to use of println here
        System.out.println(volume.volumeOfRectangle(2,3,4));
        Cuboid obj1 = new Cuboid();
        Cuboid obj2 = new Cuboid(2,3,4);
        System.out.println(obj1.surfaceAreaOfCuboid(2,3,4));
        obj1.volumeOfCuboid(2,3,4); // not give any output, because we have to use of println here
        System.out.println(obj1.volumeOfCuboid(2,3,4));
        obj2.length = 5;
        obj2.breadth = 1;
        obj2.height = 1;
        System.out.println(obj2.length); // output: 5
//        System.out.println(obj2.volumeOfCuboid());
    }
}
/*
output:
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

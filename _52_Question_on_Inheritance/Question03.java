package _52_Question_on_Inheritance;
/*
    create methods for area and volume in for class Square and
    use inheritance to create another class Cylinder from it.
 */
/*
    Formula:
    Area of Cylinder = 2*PI*radius(radius+height)
    Volume of Cylinder = pi*radius*radius*height
    Area of Square = side*side
    Volume of Square = side*side*side
 */
class Square{
    public int area(int length){ // area is a method
        return length*length;
    }
    public int volume(int length){
        return length*length*length;
    }
}
class Cylinder1 extends Square{
     public double area(int radius,int height){
        return 2*Math.PI*radius*(radius+height);
    }
    public double volume(int radius, int height){
        return Math.PI*radius*radius*height;
    }
}
public class Question03 {
    public static void main(String[] args) {
        Square sq = new Square();
        System.out.print("The area of Square is : ");
        System.out.println(sq.area(5));
        System.out.print("The volume of Square is : ");
        System.out.println(sq.volume(5));
        Cylinder1 ci = new Cylinder1();
        System.out.print("The area of Cylinder is : ");
        System.out.println(ci.area(3,5));
        System.out.print("The Volume of Cylinder is : ");
        System.out.println(ci.volume(2,3));
    }              
}
/*
Output:
    The area of Square is : 25
    The volume of Square is : 125
    The area of Cylinder is : 150.79644737231007
    The Volume of Cylinder is : 37.69911184307752
 */

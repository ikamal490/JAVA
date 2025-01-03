package _44_Questions_on_Constructors;
/*
    Problem : Create a class cylinder and use constructor to set its radius and height
 */
class Cylinder2{
    private int height;
    private int radius;

    public Cylinder2(int height, int radius) {
        this.height = height;
        this.radius = radius;
    }
    public double surfaceArea(){
        return 2*Math.PI*radius*radius + 2*Math.PI*radius*height;
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}

public class Question03 {
    public static void main(String[] args) {
    Cylinder2 cyl1 = new Cylinder2(12,9);
        System.out.print("It is the suface area of Cylinder :");
        System.out.println(cyl1.surfaceArea());
        System.out.print("It is the volume of Cylinder :");
        System.out.println(cyl1.volume());
    }
}

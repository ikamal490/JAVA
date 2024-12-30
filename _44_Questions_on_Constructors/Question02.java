package _44_Questions_on_Constructors;
/*
    Problem : Calculate the surface area and volume of the cylinder
 */
class Cylinder1 {
    private int height;
    private int radius;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double surfaceArea(){
        return 2*3.142*radius*radius + 2*3.142*radius*height;
    }
    public double volume(){
        return Math.PI*radius*radius*height; // Math.PI = 3.1415 (It is the value of the pi) we can also use that type
    }
}
public class Question02 {
    public static void main(String[] args) {
        Cylinder1 cyl = new Cylinder1();
        cyl.setHeight(12);
        System.out.println(cyl.getHeight());
        cyl.setRadius(9);
        System.out.println(cyl.getRadius());
        System.out.println(cyl.surfaceArea());
        System.out.println(cyl.volume());

    }
}


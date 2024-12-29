package _44_Questions_on_Constructors;
/*
    Problem : Create a class cylinder and use getters and setters to set its radius and height
 */
class Cylinder{
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
}
public class Question01 {
    public static void main(String[] args) {
        Cylinder myCylinder = new Cylinder();
        myCylinder.setHeight(12);
        int h =myCylinder.getHeight();
        System.out.println(h);
        myCylinder.setRadius(8);
        System.out.println(myCylinder.getRadius());
    }
}

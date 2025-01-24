package MyPractice_code;
/*
Class for a Circle
    WAP class Circle with methods to initialize its radius and calculating its area and perimeter.
 */
// Area of circle = pi*radius*radius
// Perimeter of circle = 2*pi*radius
class Circle{
    int radius;
    public double area(int radius){
        return Math.PI*radius*radius;
    }
    public double perimeter(int radius){
        return 2*Math.PI*radius;
    }
}
public class _077_OOPs {
    public static void main(String[] args) {
        Circle crl = new Circle();
        System.out.println("The Area of circle is : "+crl.area(6));
        System.out.println("The Perimeter of circle is : "+crl.perimeter(3));
    }
}

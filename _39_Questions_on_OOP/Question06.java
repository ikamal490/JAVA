package _39_Questions_on_OOP;
// Area of circle = pi*radius*radius
// Perimeter of circle = 2*pi*radius
class Circle{
    int radius;
    public float area(){
        return 3.14f*radius*radius;
    }
    public float perimeter(){
        return 2*3.14f*radius;
    }

    // Both are correct
    public float getArea(){
        return 3.14f*radius*radius;
    }
    public float getPerimeter(){
        return 2*3.14f*radius;
    }
}
public class Question06 {
    public static void main(String[] args) {
       Circle crl = new Circle();
       crl.radius = 5;

        System.out.println("The area of circle  is : " +crl.area());
        System.out.println("The Perimeter of Circle  is : " +crl.perimeter());
       /*
       //Output
        The area of circle  is : 78.5
        The Perimeter of Circle  is : 31.400002
        */

        // Using of getter
        System.out.println("area" +crl.getArea());
        System.out.println("Perimeter " +crl.getPerimeter());
         /*
        //Output
        area78.5
        Perimeter 31.400002
        */
    }
}

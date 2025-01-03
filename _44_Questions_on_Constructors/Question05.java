package _44_Questions_on_Constructors;
/*
    Problem : Create a class Sphere and use getters and setters to set its radius and height
              and find Area and Volume of sphere.

    Area of Sphere = 4*PI*radius*radius
    Volume of Sphere = 4/3*PI*radius*radius*radius
*/

 class Sphere{
  int radius;
  int height;
  public void setRadius(int radius){
   this.radius = radius;
  }
  public int getRadius(){
   return radius;
  }
  public void setHeight(int height){
   this.height =height;
  }
  public int getHeight(){
   return height;
  }
  public double areaOfSphere(){
   return 4*Math.PI*radius*radius;   // Area of Sphere
  }
  public double volumeOfSphere(){
   return 4/3*Math.PI*radius*radius*radius;  // Volume of Sphere
  }
}
public class Question05 {
 public static void main(String[] args) {
  Sphere spr = new Sphere();
  spr.setRadius(4);
  System.out.println(spr.getRadius());
  spr.setHeight(3);
  System.out.println(spr.getHeight());
  System.out.println("The Area of Sphere is : " +spr.areaOfSphere());
  System.out.print("The Volume of Sphere is : "+spr.volumeOfSphere());
 }
}

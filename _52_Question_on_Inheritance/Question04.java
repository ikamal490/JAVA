package _52_Question_on_Inheritance;
/*
    Create methods for area and volume of class Sphere
     and use inheritance to create another class and use of getter and setters.
 */
/*
Formula:
    Area of Sphere = 4πr2
    Volume of Sphere = 4/3 π r³
    Volume of Hemisphere = 2/3 ×π × r3
    Area of Hemisphere = 3πr2
 */
class Sphere{
    private int r;
    public int getR() {
        return r;
    }
    public void setR(int r) {
        this.r = r;
    }
    Sphere(){
        System.out.println("I am a default Sphere constructor ");
    }
    Sphere(double r){
        System.out.println("I have one  parameters use for volume ");
        System.out.print("Volume by sout : "+(double)4/3*Math.PI*r*r*r+"\n");
    }
    public double volumeOfSphere(int r){
        return (double) 4 /3*Math.PI*r*r*r;
    }
    public double areaOfSphere(int r){
        return 4*Math.PI*r*r;
    }
}
class HemiSphere extends Sphere{
    HemiSphere(){
        System.out.println("I am a superman ");
    }
    HemiSphere(int r){
        super(r); // 'Super' give output of overloaded constructor
        System.out.println("I am not a superman");
    }
    public double areaOfHemiSphere(int r){
        return 3*Math.PI*r*r;
    }
    public double volumeOfHemiSphere(int r){
        return (double)2/3*Math.PI*r*r;
    }
}
public class Question04 {
    public static void main(String[] args) {
        Sphere obj = new Sphere(); // output: I am a default Sphere constructor
        Sphere obj1 = new Sphere(3);
        HemiSphere hs = new HemiSphere();
        HemiSphere hs1 = new HemiSphere(4);
        System.out.println("The area of Sphere is: "+obj.areaOfSphere(2));
        System.out.println("The volume of Sphere is: "+obj.volumeOfSphere(3));
        System.out.println(obj1.volumeOfSphere(3)); // above line of code and this line are same there is not diff. by using of obj1
        System.out.println("The area of HemiSphere is: "+hs.areaOfHemiSphere(6));
        System.out.println("The volume of HemiSphere is: "+hs.volumeOfHemiSphere(6));
    }
}
/*
output:
    I am a default Sphere constructor
    I have one  parameters use for volume
    Volume by sout : 113.09733552923255
    I am a default Sphere constructor
    I am a superman
    I have one  parameters use for volume
    Volume by sout : 268.082573106329
    I am not a superman
    The area of Sphere is: 50.26548245743669
    The volume of Sphere is: 113.09733552923255
    113.09733552923255
    The area of HemiSphere is: 339.29200658769764
    The volume of HemiSphere is: 75.39822368615503
 */

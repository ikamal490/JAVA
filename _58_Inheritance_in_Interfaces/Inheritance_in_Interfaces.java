package _58_Inheritance_in_Interfaces;

interface sampleInterface{
    void meth1();
    void meth2();
}
interface childSampleInterface extends sampleInterface{ // Use of inheritance in interfaces
    void meth3();
    void meth4();
}
class ChildClass implements childSampleInterface{
    public void meth1(){
        System.out.println("Meth1 implementation");
    }
    public void meth2(){
        System.out.println("Meth2 implementation");
    }
    public void meth3(){
        System.out.println("Meth3 implementation");
    }
    public void meth4(){
        System.out.println("Meth4 implementation");
    }
}
public class Inheritance_in_Interfaces {
    public static void main(String[] args) {
        ChildClass cc = new ChildClass();
        cc.meth1();
        cc.meth2();
        cc.meth3();
        cc.meth4();
    }
}
/*
output:
    Meth1 implementation
    Meth2 implementation
    Meth3 implementation
    Meth4 implementation
 */

package _48_Method_Overriding;
/*
    If the child class implement the same method present in the
    parent class again, it is known as method overriding.
    --> Redefining method of super class in sub_class
    In Hindi : ek naam ke same method present in different class
                (condition:- one class should be a parent class, || it should followed inheritance rules)
                 is called method overriding
 */
class A{
    public int a;
    public void meth1(){ // It is a method
        System.out.println("I am a method 1 of class A");
    }
    public void meth2(){ // It is a method
        System.out.println("I am a method 2 of class A");
    }
}
class B extends A{
    @Override  // Recommended to use for override function
    public void meth2(){   // Here, it is a method overriding because we use of same function of class A meth2() in class B
        System.out.println("I am a method 2 of class B");
    }
    public void meth3(){
        System.out.println("I am a method 3 of class B");
    }
}
public class overriding {
    public static void main(String[] args) {
        A a = new A();  // 'A' is a class and 'a' is an object
        a.meth2(); // output : I am a method 2 of class A
        B b = new B();
        b.meth2();   // output : I am a method 2 of class B
        b.meth1();  // output : I am a method 1 of class A
    }
}
/*
    output

    I am a method 2 of class A
    I am a method 2 of class B
    I am a method 1 of class A
 */

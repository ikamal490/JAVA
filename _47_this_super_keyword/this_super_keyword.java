package _47_this_super_keyword;
/*
    // This keyword
    This is a way for us to reference an object of the class which is being created/referenced
        this.area  --> this is a reference of current object

    // Super Keyword
    A reference variable used to refer immediate parent class object
 */
class EkClass{
    int a;
    public int getA(){
        return a;
    }
    EkClass(int a){  // a=12
//        a = a;  // This is not a correct format, so we have to use of 'this' keyword
        this.a = a;
    }
}
        // super keyword
    class DoClass extends EkClass {
        DoClass(int c) {
            super(c);  // If we remove super keyword code thrown an error
            System.out.println("I am a Constructor");
        }
    }

public class this_super_keyword {
    public static void main(String[] args) {
        EkClass e = new EkClass(12);
//        e.a = 67; //  here we, set the 'a' value to 67 . if we uncomment this code we got output of 67 in getter
        DoClass d = new DoClass(23);  // output : I am a Constructor
        System.out.println(e.getA()); // output : 12
    }
}
    /*
         //output
         I am a Constructor
         12
     */

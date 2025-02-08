package _66_Access_Modifiers;

class c1{
    public int A = 23;
    private int B = 45;
    int C = 92;
    protected int D = 32;
    public void meth1(){
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
    }
}
public class Access_Modifiers {
    public static void main(String[] args) {
        c1 obj = new c1();
//        obj.meth1(); // Print all the class

        /*
        System.out.println(obj.A);
        //System.out.println(obj.B); // Private don't access to the package, it throws an error
        System.out.println(obj.C);
        System.out.println(obj.D);
    */
    }
}

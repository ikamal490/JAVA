package _31_Methods;

public class Calling_a_Method {
     int logic (int x, int y){  // we don't use of static keyword here !, so we have to create an object
        int z;
        if(x<y){
            z=x+y;
        }
        else{
            z=(x+y)*10;
        }
        return z;
    }
    public static void main(String[]args){
        int a=14;
        int b=4;
        int c;
        // Method invocation using Object creation
        Calling_a_Method obj = new Calling_a_Method(); // We create an object of class name because we don't use of static keyboard
        c = obj.logic(a,b);
        int a1=5;
        int b1=43;
        int c1;
        c1 = obj.logic(a1,b1);
        System.out.println(c );
        System.out.println(c1);
    }
}

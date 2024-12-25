package _39_Questions_on_OOP;
/*
    Problem : Create a class rectangle with a method to initialize its
                length and breadth  ,calculating area , perimeter etc.
 */
class rectangle{
    int length;
    int breadth;
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length + breadth);
    }
}

public class Question04 {
    public static void main(String[]main){
        rectangle rc = new rectangle();
        rc.length = 5;
        rc.breadth = 3;
        // rc.area();  //It won't work because area is int function we have use of, System.out.println(rc.area());
        System.out.println(rc.area());
        System.out.println(rc.perimeter());
    }
}

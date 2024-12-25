package _39_Questions_on_OOP;
/*
    Problem : Create a class square with a method to initialize its
                sides ,calculating area , perimeter etc.
 */
class square{
    int side;
    public int area(){
       return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
public class Question03 {
    public static void main(String[] args) {
        square sq = new square();
//        int side = 5; // It is wrong method
        sq.side = 5;
        System.out.println(sq.area());;
        System.out.println(sq.perimeter());
    }
}

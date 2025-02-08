package MyPractice_code;
/*
    Problem: Create a class square with a method to initialize its
                sides, calculating area, perimeter etc.
 */
// Area = side*side
// perimeter = 4*side

class Square{
    public void area(int side){
        System.out.println(side*side);
    }
    public void perimeter(int side){
        System.out.println(4*side);
    }
}
class OtherMethod{
    int side = 2;
    public int area(){
        return side*side;
    }
    public int periMeter(){
        return 4*side;
    }
}
public class _081_OOPs {
    public static void main(String[] args) {
        Square sq = new Square();
        OtherMethod sq1 = new OtherMethod();
        sq.area(4);
        sq.perimeter(3);
        sq1.side = 2;
        System.out.println(sq1.area());
        System.out.println(sq1.periMeter());
    }
}

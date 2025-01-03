package _44_Questions_on_Constructors;
/*
    Overload a constructor used to initialize a rectangle of length 4 and
    breadth 5 for using custom parameters
 */
class rectangle{
    private int length;
    private int breadth;

    public rectangle() { // initialize constructor
        this.length = 4;
        this.breadth = 5;
    }

    public rectangle(int length, int breadth) {  // custom constructor
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() { // getter
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}
public class Question04 {
    public static void main(String[] args) {
//        rectangle r = new rectangle(12,34);
        rectangle r = new rectangle();
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());
    }
}

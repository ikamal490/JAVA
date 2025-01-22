package MyPractice_code;
/*
    Calculate the Area of a Rectangle
    Write a program to declare two variables length and breadth of type int,
    assign values to them, and calculate the area of a rectangle using the formula:
    Area=length×breadth

    Example Output:
    Length: 5
    Breadth: 10
    Area of Rectangle: 50
 */
public class _056_ {
    public static void main(String[] args) {
        int length = 5;
        int breadth = 10;
        System.out.println("Length: "+length);
        System.out.println("Breadth: "+breadth);
        System.out.println("Area of Rectangle: "+length*breadth);
    }
}

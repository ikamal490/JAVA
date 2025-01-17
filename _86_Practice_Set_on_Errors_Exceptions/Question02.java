package _86_Practice_Set_on_Errors_Exceptions;

/*
    Question: WAP that prints "HaHa" during Arithmetic Exceptions and "HeHe"
                during an Illegal argument exception.
 */
public class Question02 {
    public static void main(String[] args) {
        int a = 50;
        int b = 0;
        try{
            System.out.println(a/b);
        }
        catch (ArithmeticException e){
            System.out.println("Haha ");
        }
        catch (IllegalArgumentException e){
            System.out.println("HeHe");
        }
    }
}
/*
Output:
    Haha
 */
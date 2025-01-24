package MyPractice_code;
/*
Write a method to find the maximum of two numbers.
    Create a method public static int findMax(int a, int b)
    that takes two integers and returns the larger number.
 */
public class _071_Methods {
    public static int findMax(int a, int b){
        if(a > b){
            return a;
        }
        else{
            return b;
        }
    }
    public static void main(String[] args) {
        System.out.println(findMax(342,39));
    }
}

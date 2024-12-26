package _35_Questions_on_Methods;
/*
    Problem : Write a function to find average of a set of numbers passed as argument.
 */
// Use concept of varargs
public class Question05 {
    static float average(float a , float b, float c){
        return (a+b+c)/3;
    }
    public static void main(String[]args){
        System.out.println("The average of these number you have entered is :" +average(23,43,82));
    }
}

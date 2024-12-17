package _33_Variable_arguments;

public class varargs01 {
    static int sum(int ...arr){
        // Available as int [] arr;
        int result = 0;
        for(int a: arr){   // Read : For a in arr
            result += a;
        }
        return result;
    }
    public static void main(String[]args){
        System.out.println("Welcome to varargs Tutorial");
        System.out.println("The sum of 9 and 11 is :" +sum(9,11));
        System.out.println("The sum of 9 , 15 and 11 is :" +sum(9,15,11));
        System.out.println("The sum of 10 ,15, 20 and 25 is :" +sum(10,15,20,25));

    }
}

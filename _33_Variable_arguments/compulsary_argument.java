package _33_Variable_arguments;

public class compulsary_argument {
    static int sum(int x ,int ...arr){
        int result = x;  // We use x here instead of 0 because made it compsulary
        for(int a : arr){
            result +=a;
        }
        return result;
    }
    public static void main(String[]args){
        System.out.println("Welcome to varargs Tutorial");
//        System.out.println("We don't blank out the space " +sum()); // It give an error because we made compulsary one argument by using of int x
        System.out.println("The sum is : "+sum(1));
        System.out.println("The sum of 9 and 11 is :" +sum(9,11));
        System.out.println("The sum of 9 , 15 and 11 is :" +sum(9,15,11));
        System.out.println("The sum of 10 ,15, 20 and 25 is :" +sum(10,15,20,25));

    }
}

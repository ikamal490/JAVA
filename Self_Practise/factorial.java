package Self_Practise;

public class factorial {
    static int factorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    public static void main(String[]args){
        int a = 4;
        System.out.println("The factorial of this 'a' value is :" +factorial(a));
        // we can also call directly
        System.out.println("Factorial of this value is  :" +factorial(6));
    }
}

package _34_Recursion;

public class using_for_loop_ {
    static int factorial_iterative(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            int product =1 ;
            for(int i=1; i<=n; i++){  // 1 to n
                product *=i;
            }
            return product;
        }
    }
    public static void main(String[]args){
        int x = 4;
        System.out.println("The value of factorial x is :" +factorial_iterative(x));
    }
}

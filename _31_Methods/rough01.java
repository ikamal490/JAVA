package _31_Methods;

public class rough01 {
         static int mySum(int a , int b){
            int c = a+b ;
            return c;
        }
        int mySum(int a,int b,int c){
             int r =a*b*c;
             return r;
        }

    public static void main(String[] args) {
        System.out.println("The sum of these numbers is : " +mySum(3,5));
        System.out.println("Sum is "+mySum(23,3));

        rough01 obj = new rough01();
        System.out.println("The multiplication is : " +obj.mySum(2,2,2) );

        // Other Method to describe this :
        // Output is : 6
        int a = 2;
        int b = 3;
        int c = 1;
        int z;
        z = obj.mySum(2,3,1);
        System.out.println(z);

        // Other method :
        // Output is : 24
        int p ;
        p = obj.mySum(2,3,4);
        System.out.println(p);

        // Other method below code will save our lines
        // Output is :24
        System.out.println(obj.mySum(2,3,4));
    }
}

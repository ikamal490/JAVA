package _13string;

public class use_of_format {
    public static void main(String[] args) {
        int a = 7;
        float b = 3.3443f;
            System.out.printf("The value of a is %d and the value of b is %f ", a, b);
            System.out.println();
            System.out.format("The value of a is %d and the value of b is %f ", a, b);   // This is same like a printf
            System.out.println();

        //Multiplication table of 7 by using of format parameter
        int a1 = 7;
        for(int i=1; i<=10; i++){
            System.out.format("%d X %d = %d\n",a1, i, a1*i);
        }
            System.out.println();

        //Multiplication table of 8 by using of printf parameter
        int b2 = 8;
        for(int i=1; i<=10; i++){
            System.out.printf("%d X %d = %d\n",b2, i, b2*i);
        }
    }
}
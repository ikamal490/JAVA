package Associativity_of_Operators09;

public class Associativity_of_Operators {
    public static void main(String[] args) {
     /*
        int a = 6*5-34/2;
        System.out.println(a);
        /*
            30-34/2
            30-17
            13
         */
        int b = 60/5-34*2; // precedence of * and / are same we use associative rule left to right

        /*
                12-34*2
                12-68
                -56
         */
     //  System.out.println(b);
        // Precendence & Associativity

        //  Quick Quiz
        int x = 6;
        int y = 1;
        int k = x * y /2 ;
        System.out.println(k);

    }
}

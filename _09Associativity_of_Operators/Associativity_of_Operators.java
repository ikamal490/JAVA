package _09Associativity_of_Operators;

public class Associativity_of_Operators {
    public static void main(String[] args) {
        int a = 6*5-34/2;
        /*
            30-34/2
            30-17
            13
         */
        System.out.println(a);
        int b = 60/5-34*2; // precedence of * and / are same we use associative rule left to right
        /*
                12-34*2
                12-68
                -56
         */
       System.out.println(b);
        // Precendence & Associativity

        //  Quick Quiz
        int x = 6;
        int y = 1;
        int k = x * y /2 ;
        System.out.println(k);

    }
    /*
       Highest precedence 14 :  Left to Right
       ( ) Function call
       [ ] Array subscript
       . Dot (member of structure)
       -> Arrow (Member of structure)


       Second highest precedence 13 : Right to Left
       ! Logical Not
       - One's complement
       ++ Increment
       -- Decrement
       & Address of
       * Indirection
       (type) Cast


       Third highest precedence 12 : Left to Right
       * Multiplication
       / Division
       % Modulus(Remainder)


       4th highest precedence 11 : Left to Right
       + Addition
       - Subtraction

       5th precedence 10 : Left to Right
       << Left -shift
       >> Right shift

       6th  precedence 8 : Left to Right
       < less than
       <= less than equal to

     */
}

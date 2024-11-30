package _10Resulting_data_type;

public class Resulting_data_type {
    public static void main(String[]args){

        // Increment and Decrement Operators ::

        int i = 56;
        int a = i++;  // first a is assigned i then i is incremented
        System.out.println(a);
        System.out.println(i++);
        System.out.println(i++);
        System.out.println(i);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);
        System.out.println();


        int j = 67;
        int c = ++j ; // first j is incremented then c value is assigned j
        System.out.println(c);
        System.out.println();
        System.out.println();    // use for line break

        // Question
        int y = 7;
        int x = (++y*8);
        System.out.println(x);
        System.out.println();

        int Y = 7;
        int X = (Y++*8);
        System.out.println(X);

        char p = 'a';
        char q = ++p;
        System.out.println(q);
        System.out.println();


        char P = 'a';
        char Q = P++;
        System.out.println(Q);
    }
}

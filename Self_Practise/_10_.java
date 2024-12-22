package Self_Practise;

import com.sun.security.jgss.GSSUtil;
import org.w3c.dom.ls.LSOutput;

public class _10_ {
    public static void main(String[] args) {
        char p = 'a';
        char q = ++p;
        System.out.println(q);  // output will be 'b'
        char p1 = 'a';
        char q2 = p1++;
        System.out.println(q2); // output is a
        char p3 = 'A';
        char q3 = ++p3;
        System.out.println(q3);  // output will be capital B
        char a = 'd';
        char b = --a; // use of decrement operator
        System.out.println(b); // output will be 'c'
        int a1 = 34;
        int b1 = ++a1;
        System.out.println(a1); // output is 35;
        int a2 = 34;
        int b2 = a1++;
        System.out.println(a2); //output is 34;
    }
}

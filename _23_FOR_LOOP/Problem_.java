package _23_FOR_LOOP;

public class Problem_ {
    public static void main(String[] args) {
        /*
            Write a program to print first n odd numbers using a for loop
         */

        // 2n = Even numbers = 0, 2, 4, 6, 8...
        // 2n+1 = Odd numbers = 1 ,3, 5, 7, 9 ...

        int n = 10;
        for(int i = 0; i<=n; i++  )
            System.out.println(2*i+1);

    }
}

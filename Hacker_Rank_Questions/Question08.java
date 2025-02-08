package Hacker_Rank_Questions;
// Java Varargs - Simple Addition

import java.util.Scanner;

// Java Varargs - Simple Addition
public class Question08 {
    static int sum(int ...arr){
        int result = 0;
        for(int a: arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        int n5 = sc.nextInt();
        System.out.println( sum(n,n1));
        System.out.println(sum(n,n1,n2));
        System.out.println(sum(n,n1,n2,n3,n4));
        System.out.println(sum(n,n1,n2,n3,n4,n5));
    }
}

package Hacker_Rank_Questions;

import java.util.Scanner;

// Java Substring
/*
Sample Input:
Helloworld
3 7

Sample Output:
lowo
 */
public class Question04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(str.substring(n,m));
    }
}

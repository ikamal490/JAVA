package MyPractice_code;

import java.util.Scanner;

/*
    Vowel or Consonant
    Write a program to check whether a given character
    is a vowel (a, e, i, o, u) or a consonant.
 */
public class _011_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character : ");
        char ch = sc.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("It is a vowel");
        } else {
            System.out.println("It is a consonant");
        }
    }
}

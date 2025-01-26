package Hacker_Rank_Questions;
import java.util.Scanner;
// String palindrome
public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        StringBuilder obj = new StringBuilder(str1);
        obj.reverse();
        if(str1.equals(obj.toString())){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }
    }

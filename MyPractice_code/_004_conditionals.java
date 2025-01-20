package MyPractice_code;
import java.util.Scanner;
/*
            Problem 6: Write a program to find out the type of website from the URL
                        .com -> commercial website
                        .org -> organization website
                        .in  -> indian website
         */
public class _004_conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the website name : ");
        String url = sc.nextLine();
        if(url.endsWith(".com")) {
            System.out.println("It's a commercial website");
        }
        else if(url.endsWith(".org")) {
            System.out.println("It's a organization website");
        }
        else if(url.endsWith(".in")) {
            System.out.println("It's a indian website");
        }
        else{
            System.out.println("Enter correct url");
        }
    }
}

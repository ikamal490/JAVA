package _25_Questions_on_Loop;
/*
    Problem 3:  Write a program to print multiplication table of given number n
     */
public class Question03 {
    public static void main(String[] args) {
        int n = 9;
        for(int i=1; i<=10; i++){
            System.out.format("%d X %d = %d\n",n,i,i*n); // Best method to solve this Question
        }
            System.out.println();
        // OR
        int n1 = 10;
        for(int i=1; i<=10; i++){
            System.out.println(n1*i); // Normal way
        }
    }
}

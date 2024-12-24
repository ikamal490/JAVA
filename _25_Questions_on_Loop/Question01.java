package _25_Questions_on_Loop;
/*
            Problem 1: Write a program to print the following pattern using of loops:
                        *****
                        ****
                        ***
                        **
                        *
         */
public class Question01 {
    public static void main(String[] args) {
        for(int i=5; i>0; i--){ // It is outer loop , " The outer loop controls how many lines of asterisks(*) will be printed "
            for(int j=0; j<i; j++){ // Inner Loop , " The inner loop is responsible for printing the asterisks on the same line."
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Print in decreasing order :");

         /*
            Problem 2: Write a program to print the following pattern using of loops:
                        *
                        **
                        ***
                        ****
                        *****
         */
        int n = 5;
        for(int i=1; i<=n; i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

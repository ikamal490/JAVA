package MyPractice_code;
/*
Pattern Problem:
            Problem 1: Write a program to print the following pattern using of loops:
                        *****
                        ****
                        ***
                        **
                        *
         */
public class _019_Loops {
    public static void main(String[] args) {
        for(int i=5; i>0; i--){ // controls the number of rows.
            for(int j=1; j<=i; j++){ // controls the number of stars (*) printed in each row.
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

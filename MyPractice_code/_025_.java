package MyPractice_code;
/*
Pattern Problem using while loop:
            Problem 1: Write a program to print the following pattern using of while loop:
                        *****
                        ****
                        ***
                        **
                        *
         */
public class _025_ {
    public static void main(String[] args) {
        int i=5;
        while(i>0){ // // controls the number of rows.
        int j=1;
            while(j<=i){
                System.out.print(" * "); // controls the number of stars (*) printed in each row.
                j++;
            }
            System.out.println();
            i--;
        }
    }
}

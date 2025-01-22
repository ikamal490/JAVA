package MyPractice_code;
/*
    Write a program to print a pyramid pattern of stars (*) for a given number of rows using nested for loops.

       *
      ***
     *****
    *******

 */
public class _038_Loops_Hard_type {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            for(int j=5; j>=i; j--){
                System.out.print("   ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            for(int j=1; j<i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

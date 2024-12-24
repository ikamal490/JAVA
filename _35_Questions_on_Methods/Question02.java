package _35_Questions_on_Methods;
/*
       problem 1 : Write a program using function to print the following pattern:
                    *
                    **
                    ***
                    ****
                    *****
 */

public class Question02 {
    static void pattern(int n) {
        for (int i = 1; i <= n; i++) {  // humko kitni rows chahiye, ye wala for loop dekhega
            for (int j = 0; j < i; j++) {  // humko kitne stars chahiye, ye wala for loop dekhega
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
       problem 2 : Write a program using function to print the following pattern:
                  *****
                  ****
                  ***
                  **
                  *
 */

    static void pattern1(int n){
        for(int i=n; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        pattern(5);
        System.out.println("Print this pattern in reverse order :");
        pattern1(5);
    }
}

package Practise_set_;
import java.util.Scanner;
public class LOOP_problems {
    public static void main(String[]args){

        /*
            Problem 1: Write a program to print the following pattern :
                        ****
                        ***
                        **
                        *
         */


//        //  By using of Basic Java :
//        System.out.println("****");
//        System.out.println("***");
//        System.out.println("**");
//        System.out.println("*");
//        System.out.println();

//        //  By  Using of Loop Method :
//        int n = 10;
//        for(int i = n; i>0; i--){
//            for(int j = 0; j<i; j++ ){
//            System.out.print("*");
//            }
//            System.out.println();
//        }


        /*
             Problem 2: Write a program to sum first n even numbers using while loop
         */

            int sum=0;
            int n=4;
            int i=0;
            while(i<n){
                sum=sum+(2*i);
                i++;
            }
                System.out.println("The sum of these number is : ");
                System.out.println(sum);

                // First 4 even number is : 0, 2, 4 , 6
        /*
            Problem 3:  Write a program to print multiplication table of given number n
         */

//        int i = 1;
//        while(i<=10){
//            System.out.println(5*i);
//            i++;
//        }


//        // ******* User defined Method **********

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number you want to create a table :");
//        int n = sc.nextInt();
//        System.out.println("The Multiplication Table of " + n + " is :");
//        int i = 1;
//        while(i<=10){
//            System.out.println( n +"x" + i + "=" + n*i );
//            i++;
//        }


        /*
            Problem 4: Write a program to print multiplication table of 10 in reverse order
         */

//        for(int i = 10; i>=1; i--){
//            System.out.println();
//        }

        /*
            problem 5: Write a program to find the factorial of a given number
                        using of a for loop
         */

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number : ");
//        int n = sc.nextInt();
//        for(int i = 5; i>=1; i-- ){
//            System.out.println(5*i--);
//        }



        /*
            Problem 6: Repeat 5 Using while loop
         */


        /*
            Problem 7: Repeat 1 Using For loop
         */


        /*
            Problem 8: What can be done using one type of loop can also be done using the
                        other two types of loops - True / False

         */

        /*
            Problem 9: Write a program to calculate the sum of the numbers occurring in
                        the multiplication table of 8
         */
//
//        int n = 8;
//        for (int i = 1; i<=10; i++){
//            System.out.println(n+"+"+i +"="+ (n+i));
//
//        }

        /*
            Problem 10: A do - while loop is executed :
                        1> At least once
                        2> At least twice
                        3> At most one
         */

        /*
            Problem 11: Repeat 2 using for loop

         */





    }
}

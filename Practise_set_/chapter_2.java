package Practise_set_;

public class chapter_2 {
    public static void main(String[] args) {



    // Q1:  What will be the result of following expression float a =7/4 * 9/2

   /*
        float a = 7/4.0f*9/2.0f;
        System.out.println(a);
    */


    // Q2 : Write a java program to encrypt a grade by adding 8 to it . Decrypt it to show the correct grade.

        // // Encrypt Grade
    char grade = 'B';
    grade = (char )(grade + 8);

        System.out.println(grade);

        // Decrypting Grade
        grade =(char)(grade -8);
        System.out.println(grade);

    // Q3 : Use comparison  operators to find out whether a given number is greater than the user entered number or not

//        Scanner sc = new Scanner (System.in);
//        System.out.println("Enter the number: ");
//        int a = sc.nextInt();
//        System.out.println(a>23);


        // Q4 : Write the following expression in a given program : ( v^2 - u^2 ) / 2as

          // ! I got error in this problem
//           int a = 12;
//           int v = 2;
//           int u = 3;
//           int s = 6;
//           int k = (v*v) - (u*u)/ 2a*s ;
//         System.out.println(k);

        //  Q5: Find the value of the following expression :
             // int x = 7  , int a = 7*49/7+35/7  what the value of a ?

//        int x = 7;
//        int a = 7*49/7+35/7 ;
//        System.out.println(a);

}
}
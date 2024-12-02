package Practise_set_;
import java.util.Scanner;
public class Conditinals {
    public static void main(String[]args) {

    /*

    Problem 1 : What will be the output of this program
                int a = 10;
                if(a = 11)
                    System.out.println("I am 11");
                else
                    System.out.println("I am not 11")

     */

//        int a = 10;
//        if(a = 11) {
//            System.out.println("I am 11");
//        }
//        else
//            System.out.println("I am not 11")

        //  // There is an error in this code threfore , there is no output


    /*

    Problem 2: Write a program to find out whether a student is pass or fail
                it  requires total 40% and at least 33% in each subject to pass.
                Assume 3 subjects and take marks as an input from the user .
     */

//        byte k1 , k2 ,k3 ;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the marks of Physics");
//        k1 = sc.nextByte();
//        System.out.println("Enter the marks of Chemistry");
//        k2 = sc.nextByte();
//        System.out.println("Enter the marks of Mathematics");
//        k3 = sc.nextByte();
//
//        float avg = (k1+k2+k3)/3.0f;
//        System.out.println("Your Total Percentage is:" +avg);
//        if(avg>=40 && k1>=33 && k2>=33 && k3>=33 ){
//            System.out.println("Congratulation, you have been promoted to next class");
//        }
//        else    {
//            System.out.println("Sorry !, you have not been promoted to next class");
//        }


        /*
        Problem 3: Calculate the income tax paid by an employee to the government as per
                    the slabs mentions below:

                    Income Tax      Slab
                    2.5L - 5.0L     5%
                    5.0L - 10.0L    20%
                    Above 10.0L     30%

        Note: There is no tax below 2.5L . Take input amount as an input from the user .

         */


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Your income in Lakhs per annum");
//        float tax =0;
//        float income =sc.nextFloat();
//        if(income<=2.5){
//            tax = tax+0;
//        }
//
//        else if(income >2.5f && income<=5.0f){
//            tax = tax + 0.05f * (income - 2.5f);
//        }
//        else if (income> 5.0f && income<=10.0f ){
//            tax = tax + 0.05f *(5.0f - 2.5f);
//            tax = tax =0.2f * (income -5f);
//        }
//        else if(income>10.0f){
//            tax = tax + 0.05f * (5.0f -2.5f);
//            tax = tax + 0.2f *(10.0f - 5f);
//            tax = tax + 0.3f *(income -10f);
//        }
//
//        System.out.println("The total tax paid by the employee is :" + tax);
//




        /*
            Problem 4 : Write a java program to find out the day of the week given the number [1 for
                        Monday , 2 for Tuesday .... and so on ]
         */

//                System.out.println("Enter the number:");
//                Scanner sc = new Scanner(System.in);
//                int number = sc.nextInt();
//                if(number==1){
//                    System.out.println("Monday");
//                }
//                else if (number ==2){
//                    System.out.println("Tuesday");
//                }
//                else if(number == 3){
//                    System.out.println("Wednesday");
//                }
//                else if (number == 4){
//                    System.out.println("Thursday");
//                }
//                else if (number == 5){
//                    System.out.println("Friday");
//                }
//                else if(number == 6){
//                    System.out.println("Saturday");
//                }
//                else if (number ==7){
//                    System.out.println("Sunday");
//                }
//                else{
//                    System.out.println("Enter number between 1 - 7 !");
//                }


//   //       *****  Another One  *****

//
//            System.out.println("Enter you number");
//            Scanner sc = new Scanner(System.in);
//            int day = sc.nextInt();
//            switch(day){
//                case 1 :
//                    System.out.println("Monday");
//                    break;
//                case 2 :
//                    System.out.println("tuesday");
//                    break;
//                case 3:
//                    System.out.println("Wednsday");
//                    break;
//                case 4:
//                    System.out.println("Thursday");
//                    break;
//                case 5:
//                    System.out.println("Friday");
//                case 6:
//                    System.out.println("Saturday");
//                case 7:
//                    System.out.println("Sunday");
//
//            }


        /*
            problem 5 :Write a Java program to find whether a year enterd by the user is a leap year
                        or not ??
         */



//        System.out.println("Enter the year to be checked");
//        Scanner sc=new Scanner(System.in);
//        int year= sc.nextInt();
//
//        if((year%4==0 && year%100!=0)|| year%400==0)
//            System.out.println("Leap year");
//        else
//            System.out.println("Not a leap year");



        /*
            Problem 6:  Write a program to find out the type of website from the URL
                        .com -> commercial website
                        .org -> organization website
                        .in  -> indian website
         */


//            Scanner sc = new Scanner(System.in);
//            System.out.println("Entered the website url ends with");
//            String website = sc.next();
//            if(website.endsWith(".org")){
//            System.out.println("It is an organization website");
//            }
//            else if(website.endsWith(".com")){
//                    System.out.println("It is an commercial website");
//            }
//                  else if (website.endsWith(".in")){
//                System.out.println("It is an Indian website");
//            }
//                  else {
//                System.out.println("You entered wrong url");
//            }

    }
}

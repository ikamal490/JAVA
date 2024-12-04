package _21_Rock_Paper_Scissors_Game;
import java.util.Scanner;
public class diff_method {
    public static void main(String[]args){
        System.out.println("Welcome To Our Game");
        System.out.println("The game of rock , paper , and scissor");
        System.out.println("You can enter like below given");
        System.out.println("rock = 1 , paper = 2 , scissor = 3");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your value:");
        int your = sc.nextInt();

        System.out.println("Enter the opponent value");
        int opponent = sc.nextInt();

        if(your == 1 && opponent == 1){
            System.out.println("Match Draw ! Try Again .. ");
        }
        else if(your == 1 && opponent ==2){
            System.out.println(" You Lose !!");
        }
        else if(your == 1 && opponent == 3){
            System.out.println("Congratulations , You Won !!");
        }
        else if(your ==2 && opponent ==1){
            System.out.println("Congratulations , You Won !!");
        }
        else if(your ==2 && opponent ==2){
            System.out.println("Match Draw ! Try Again .. ");

        }
        else if(your ==2 && opponent ==3){
            System.out.println(" You Lose !!");

        }
        else if(your ==3 && opponent ==1){
            System.out.println(" You Lose !!");

        }
        else if(your ==3 && opponent ==2){
            System.out.println("Congratulations , You Won !!");


        }
        else if(your ==3 && opponent ==3){
            System.out.println("Match Draw ! Try Again .. ");
        }

        else{
            System.out.println("You have entered wrong number check it again !!");
        }






    }
}

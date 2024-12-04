package _20_Rock_Paper_Scissors_Game;
import java.util.Scanner;
import java.util.Random;
public class game {
        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 1 for stone ");
            System.out.println("Enter 2 for scissor");
            System.out.println("Enter 3 for Paper");

            Random move = new Random();
            int com = move.nextInt(4);
            Scanner soc = new Scanner(System.in);
            System.out.println("Enter a number :");
            int n = soc.nextInt();
            if (n==1 && com==2){
                System.out.println("You Won");
            }
            else if (n==2 && com==3){
                System.out.println("You  won");
            }
            else if (n==3 && com ==1){
                System.out.println("You Won");
            }
            else {
                System.out.println("You lost");
            }


        }
}

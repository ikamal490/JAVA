package Self_Practise;
import java.util.Scanner;

public class rock_paper_scissor_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome To My Game");
        System.out.println("Game Name is : Rock Paper and Scissor ");
        System.out.println("Press 1 - Rock \nPress 2 - Paper \nPress 3 - Scissor ");
        System.out.println("Enter you Move :");
        int n = sc.nextInt();
        System.out.println("Opponent move");
        int o = sc.nextInt();
        if (n == 1 && o == 1 || n == 2 && o == 2 || n == 3 && o == 3) {
            System.out.println("Draw");
        }
        else if (n == 1 && o == 3 || n == 2 && o == 1 || n == 3 && o == 2) {
            System.out.println("Congratulations, You Won");
        }
        else {
            System.out.println("Oops! You loose ");
        }
    }
}

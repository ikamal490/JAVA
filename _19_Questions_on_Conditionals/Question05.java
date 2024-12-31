package _19_Questions_on_Conditionals;
import java.util.Scanner;
public class Question05 {
    public static void main(String[] args) {
        System.out.println("Enter the number between 1-7 :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num==1){
            System.out.println("Monday");
        }
        else if(num==2) {
            System.out.println("Tuesday");
        }
        else if(num==3){
            System.out.println("Wednesday");
        }
        else if(num==4){
            System.out.println("Thursday");
        }
        else if(num==5){
            System.out.println("Friday");
        }
        else if(num==6){
            System.out.println("Saturday");
        }
        else if(num==7){
            System.out.println("Sunday");
        }
        else{
            System.out.println("Wrong number ");
        }

        // *** Other Method
        System.out.println("Using of switch case :");
        int day = sc.nextInt();
        switch(day){
            case 1:
            System.out.println("Monday");
            break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter correctly !");
        }
    }
}

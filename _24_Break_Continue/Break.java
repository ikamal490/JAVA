package _24_Break_Continue;

public class Break {
    public static void main(String[]args){

        for(int i = 0; i<5; i++){
            System.out.println(i);
            System.out.println("I am learning Java ");
            if(i == 2){
                System.out.println("Ending of this loop ");
                break;
            }

        }
    }
}


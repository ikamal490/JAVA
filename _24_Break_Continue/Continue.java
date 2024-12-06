package _24_Break_Continue;

public class Continue {
    public static void main(String[]args){

        for(int i = 0; i<7; i++){
            if(i==2){
                System.out.println("Skip of this line ");
                continue;
            }
            System.out.println(i);
            System.out.println("I am java programmar");
        }
    }
}
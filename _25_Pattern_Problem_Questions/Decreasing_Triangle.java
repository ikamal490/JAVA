package _25_Pattern_Problem_Questions;
/*

 *  *  *  *  *
 *  *  *  *
 *  *  *
 *  *
 *

 */
public class Decreasing_Triangle {
    public static void main(String[] args) {  
        for(int i=1; i<=5; i++){
            for(int j=5; j>=i; j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

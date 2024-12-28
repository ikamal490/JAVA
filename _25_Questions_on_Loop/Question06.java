package _25_Questions_on_Loop;
/*
   Problem - WAP to calculate the sum of the numbers occurring in the multiplication table of 9;
   */
public class Question06 {
    public static void main(String[] args) {
        int n = 9;
        for(int i=1; i<=10; i++){
            System.out.format("9 + "+i+" = "+(i+9)+"\n");
        }
    }
}

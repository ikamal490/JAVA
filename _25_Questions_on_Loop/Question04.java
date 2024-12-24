package _25_Questions_on_Loop;
/*
   Problem 4: Write a program to print multiplication table of 10 in reverse order
        */
public class Question04 {
    public static void main(String[] args) {
        int n = 7;
        for(int i=10; i>0; i--){
            System.out.format("%d X %d = %d\n",n,i,n*i);
        }
    }
}

package MyPractice_code;
/*
Sum of the values in table
   Problem - WAP to calculate the sum of the numbers occurring in the multiplication table of 8;
   */
public class _026_ {
    public static void main(String[] args) {
        int num = 9;
        int sum =0;
        for(int i=1; i<=10; i++){
            sum = sum+(i*num);
        }
        System.out.println("The sum of all the numbers in "+num+" table is : "+sum);
    }
}

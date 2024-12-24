package _25_Questions_on_Loop;
/*
     Problem 2: Write a program to sum first n even numbers using while loop
                Hint : Even number start with 0,2,4,6,8....
    */
public class Question02 {
    public static void main(String[] args) {
        int sum=0;
        int i=0;
        while(i<4){
            sum=sum+(2*i);
            i++;
        }
        System.out.println("The sum of these number is : ");
        System.out.println(sum);
    }
}

package _29_Questions_on_Array;
/*
    problem : Calculate the average marks from an array containing marks
            of all students in Physics using for-each loop.
 */
public class Question03 {
    public static void main(String[] args) {
        float[] marks = {67, 89, 77, 45, 23};
        float average = 0;
        float sum = 0;
        for(float elements: marks){
            sum = sum+elements;
            average = (sum/marks.length);
        }
        System.out.println(average);

        // Other same method
        float[] marks1 = {67, 89, 77, 45, 23};
        float sum1 =0;
        for(float elemets1: marks1){
            sum1 = sum1+elemets1;
        }
        System.out.println("The average of these numbers are :" + sum1/marks1.length);
    }
}

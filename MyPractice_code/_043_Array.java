package MyPractice_code;
/*
    problem: Calculate the average marks from an array containing marks
            of all students in Physics using for-each loop.
 */
public class _043_Array {
    public static void main(String[] args) {
        int[] marks = {56,87,99,78,98,76,69,87};
        float sum = 0;
        float avg = 0;
        for(int elements: marks){
          sum = sum+elements;
        }
        System.out.println(sum/marks.length);
    }
}

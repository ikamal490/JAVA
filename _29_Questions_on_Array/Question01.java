package _29_Questions_on_Array;
/*
    Problem : Create an array of 5 floats and calculate their sum.
 */
public class Question01 {
    public static void main(String[] args) {
        // It is Sasta method
        float[] value = new float[5];
        value[0] = 34.2f;
        value[1] = 83.34f;
        value[2] = 29.43f;
        value[3] = 92.43f;
        value[4] = 48.92f;
        float sum1 = value[0] + value[1] + value[2] + value[3] + value[4];
        System.out.println("The sum of the array value is : " + sum1);

        // It is a perfect method to solve this problem
        float[] value2 = {34.2f, 32.32f, 63.1f, 24.32f, 23.f, 2.f};
        float sum = 0;
        for (float element : value2) {
            sum = sum + element;
        }
        System.out.println(sum);

        int[] numbers = {10, 15, 20, 25};
        int sum3 = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum3 = sum3 + numbers[i];
        }
        System.out.println(sum3);
    }
}


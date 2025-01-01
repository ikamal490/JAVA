package _29_Questions_on_Array;
/*
    Problem : Create a java program to add two matrices of size 2x3.
 */

public class Question04 {
    public static void main(String[] args) {
        int[][] mat1 = {
                {4, 5, 6},
                {9, 5, 7}
        };
        int[][] mat2 = {
                {7, 9, 7},
                {8, 3, 4}
        };
        int[][] result = {
                {0, 0, 0},
                {0, 0, 0}
        };
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
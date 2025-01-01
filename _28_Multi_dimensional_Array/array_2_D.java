package _28_Multi_dimensional_Array;

public class array_2_D {
    /*
        output
        2  5  3  9  4  2
        3  2  8  2  2  9
        2  7  6  9  3  1
        2  2  4  2  2  1
     */
    public static void main(String[] args) {
        int[][] nums ={
                {2,5,3,9,4,2},
                {3,2,8,2,2,9},
                {2,7,6,9,3,1},
                {2,2,4,2,2,1}
        };   // it is [4][6] type array in which 4 rows and 6 columns
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[i].length; j++){
                System.out.print(nums[i][j] +"  ");
            }
            System.out.println();
        }

        /*
        Output
            12  24  10
            56  34  23
         */

        System.out.println("**** Another Example *****" +"\n");
        int[][] elements = {
                {12,24,10},
                {56,34,23},
        };
        for(int i=0; i<elements.length; i++){
            for(int j=0; j<elements[i].length; j++){
                System.out.print(elements[i][j] +"  ");
            }
            System.out.println();
        }
    }
}

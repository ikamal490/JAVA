package _28_Multi_dimensional_Array;

public class multi_dimensional {
    public static void main(String[]args){
        int [] marks ;// It is a  1-D Array
        String [][][] arr = new String[2][3][4]; // It is a  3-D Array
        int [][] flats ; // It is a  2-D Array
        flats = new int[2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

        // Displaying the 2-D Array (for loop )
        System.out.println("Printing a 2-D Array using for loop");
        for(int i=0; i<flats.length; i++ ){
            for(int j=0; j<flats[i].length; j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
            /*
                cars.length: detect how many instances/objects are there in the row of the 2D array
                and
                cars[i].length: detects how many instances/objects are there in the column of the 2D array
             */
        }
    }
}

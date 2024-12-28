package _26_Array;
// DataType[] ArrName  -- Format
public class way_1 {
    public static void main(String[] args) {
        // Declaration + Memory allocation
        int[] marks = new int[40];
        marks[0] = 89;
        marks[1] = 88;
        marks[35] = 94;
        marks[23] = 43;
       // marks[41] = 76;  // Array index is out of bound throw an error
        System.out.println(marks[35]);
        System.out.println(marks[37]);  // give 0 as a output
        // System.out.println(marks[41]);  --> Array length not match throw an error
    }
}

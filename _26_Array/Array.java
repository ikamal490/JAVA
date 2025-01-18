package _26_Array;
 // DataType[] ArrName;  --> Format for array writing
// Array indices starts form 0 and goes till (n-1) where n is the size of the array.

public class Array {
     // Array is the collection of similar types of data.
    // Accessing elements in an array is faster. Array ke andar hum elements ko jaldi se dundh lete hai
    public static void main(String[]args){
        /*
            Classroom of 500 students -- You have to enter marks of these 500 students
            You have 2 options:
            1> You have to Crete 500 variables // so boring and time-wasting
            2> Use Arrays (Recommended)
         */

        int []marks = new int[5]; // Here, 5 is the size of the array, it would be 500 or anything number
        // Initialization
        marks[0] = 89;
        marks[1] = 90;
        marks[2] = 80;
        marks[3] = 65;
        marks[4] = 43;
//      marks[5] = 34; // throws an error of --> index out of bounds

        //When two same numbers were coming in an array, it prints only the latest
//        System.out.print("commented code : "); // uncomment this and run
//        marks[2] = 43; // uncomment this and run  // output: 43, instead of 80
        System.out.println(marks[2]); // Output: 80
//        System.out.println(marks[5]); --> Throws an error because array length not match

        /*
            There are three main ways to create an array in java:
            1. Declaration + memory allocation
            int []marks = new int[5];
            int[] marks  ------> Declaration
            marks = new int[5] -----> memory allocation

            2. Declaration and then memory allocation
                int [ ] marks;
                marks = new int[5];
            Initialization :
             marks[0] = 89;
            marks[1] = 90;
            marks[2] = 80;
            marks[3] = 65;

         */
           // 3. Declaration , memory allocation and initialization together
          // Below code is an Example of this:

            int[] value = {76, 56, 54,90, 89};
            System.out.println(value[2]); // output: 54
            System.out.println(value[4]); // output: 89
    }
}
/*
Output:
    80
    54
    89
 */

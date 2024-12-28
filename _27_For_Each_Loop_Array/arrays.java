package _27_For_Each_Loop_Array;

public class arrays {
    public static void main(String[]args){
        /*
            int [] marks = {98,89,87,34,43};
            float [] marks = {98.44f,89.0f,87.43f,34,43};
            System.out.println(marks.length); // It give length of array
            System.out.println(marks[0]);
            String [] students = {"Ram", "Rohan", "Kamal", "Shefali", "Unknown", "Rajkumar" ,"Kritika"};
            System.out.println(students.length);
            System.out.println(students[3]);
         */

        int [] marks = {98,89,87,34,43};
//         System.out.println(marks.length);

        // Displaying the Array ( Naive way )
        System.out.println("By Using of Simple Method :");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println("\n");

        // Displaying the Array ( For loop )
        System.out.println("By Using of For loop :");
        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
        System.out.println("\n");
        // Displaying the Array in Reverse order ( For loop )
        System.out.println("By Using of For loop in reverse method :");
        for( int i=marks.length-1; i>=0; i-- ) {
            System.out.println(marks[i]);
        }
        System.out.println("\n");

        // Displaying the Array  ( For-each loop )
        System.out.println("By Using of For-each loop  :");
        for(int element: marks){
            System.out.println(element);}
            }
        }



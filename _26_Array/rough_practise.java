package _26_Array;

public class rough_practise {
    public static void main(String[] args) {
        int[] marks = new int[5];
        marks[0] = 45;
        marks[1] =43;
        marks[2] = 98;
        marks[4] = 67;
        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
        System.out.println("Using of for-each loop :");
        for(int number: marks){
            System.out.println(number);
        }
    }
}

package _29_Questions_on_Array;

public class rough {
    public static void main(String[] args) {
       float[] marks = {56,78,98,45,45};
       float sum = 0;
       for(float elements: marks){
          sum = sum+elements;
       }
        System.out.println("The average of these marks are :" +sum/marks.length);


    }
}




package _29_Questions_on_Array;
/*
    Problem : WAP to find out whether a given number is present in an array or not.
 */
public class Question02 {
    public static void main(String[] args) {
        int[] value = {34,43,63,93,32};
        int num = 63;
        boolean isInArray = false;
        for(int elemets: value){
            if(num==elemets){
               isInArray = true;
               break;
            }
           }
           if(isInArray){
               System.out.println("Present in Array");
            }
           else{
               System.out.println("Not Present in Array");
                }

           // Same approach by for loop

        int[] number = {12, 23, 27, 32};
        int num1 = 274;
        boolean isInArray1 = false;
        for(int i=0; i<number.length; i++){
            if(num1==number[i]){
                isInArray1 = true;
                break;
            }
        }
        if(isInArray1){
            System.out.println("Present in array");
        }
        else{
            System.out.println("Not present in array");
        }
    }
}



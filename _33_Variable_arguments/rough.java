package _33_Variable_arguments;

public class rough {
//    static int sum(int a, int b){
//        return a+b;
//    }
//    static int sum(int q, int w,int z){
//        return q+w+z;
//    }
//    static int sum(int a, int b,int c ,int d){
//        return a+b+c+d;
//    }
//    static int sum(int a, int b,int c, int d, int p){
//        return a+b+c+d+p;
//    }
//    public static void main(String[] args) {
//        System.out.println(sum(2,4));
//        System.out.println(sum(2,4,6));
//    }

    static int cocoCola(int ...arr){
        // Available as an array int[] arr
        int result = 0;
        for(int i=0; i<arr.length; i++){
            result = result+arr[i];
        }
        return result;
    }

    // By using of for each loop :
    static int coco(int a, int ...arr){ // int a is a compulsory
   int  result1 = a;
        for(int elements: arr){
            result1 +=elements;
        }
        return result1;
    }
    public static void main(String[] args) {
        int a ; int b; int c; int d; int e;
        a=12; b=12; c=14; d=15; e=16;
        int t = a+b+c+d+e;
        System.out.println(cocoCola(t));
        System.out.println(cocoCola(12,12,14,15,16));
        System.out.println(coco(12,12,12,13));
        System.out.println(coco(19));
    }
}

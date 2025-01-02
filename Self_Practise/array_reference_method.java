package Self_Practise;

public class array_reference_method {
        static void value(int[] arr){
            arr[0] = 83;
        }
        static void value(int x){
            x = 34;
        }
    public static void main(String[] args) {
        int[] marks = {23,54,64,34,65};
        value(marks);
        System.out.println(marks[0]);
        int a = 93;
        value(a);
        System.out.println(a); // It won't change ,it gave copy to value function
    }
}

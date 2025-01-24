package MyPractice_code;
/*
Write a method to print a string multiple times.
    Create a method public static void printString(String str, int times)
     that prints the given string a specified number of times.
 */
public class _072_Methods {
    public static void printString(String str, int times){
        for(int i=1; i<=times; i++){
            System.out.println(str);
        }
    }
    public static void main(String[] args) {
        printString("kamal",2);
        printString("Shefali",5);
    }
}

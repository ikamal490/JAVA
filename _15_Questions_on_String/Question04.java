package _15_Questions_on_String;
/*
    Problem : Write a java program to detect double and triple spaces in a String.
 */
public class Question04 {
    public static void main(String[] args) {
        String check = "Ramu loves the  shyamu";
        System.out.println(check.indexOf("  "));
        System.out.println(check.indexOf("   ")); // we got -1
        // If -1 occur it means it have dobule/triple spaces
    }
}

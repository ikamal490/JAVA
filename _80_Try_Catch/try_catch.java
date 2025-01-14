package _80_Try_Catch;

public class try_catch {
    public static void main(String[] args) {
        int a = 1000;
        int b = 0; // It is an arithmetic exception
        /*
               Without try and catch:
            int c = a/b;
            System.out.println("The result is: " +c);
             // we got an exception, and code will not run or execute
         */

        // With try and catch
        try{ // koshish karo isko run karne ki
        int c = a/b;
            System.out.println("The result is: " +c);
        }
        catch(Exception e){  // Agar koi exception aaye toh usee pakad lo
            System.out.println("We failed to divide. Reason:");
            System.out.println(e);
        }
        System.out.println("The Program has been ended");
    }
}
/*
Output:
    We failed to divide. Reason:
    java.lang.ArithmeticException: / by zero
    The Program has been ended
 */


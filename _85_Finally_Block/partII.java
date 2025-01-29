package _85_Finally_Block;

public class partII {
        public static void main(String[] args) {
        int a = 50;
        int b = 5;
        while(true) {
        try{
            System.out.println(a/b);
        }
        catch (Exception e) {
            System.out.println(e);
            break;
        }
        finally{
            System.out.println("I am finally for the value of b = " + b);
        }
        b--;
         }
        try{
            System.out.println(5/0);
        }
        finally {
            System.out.println("we can use of finally with try");
        }
    }
}


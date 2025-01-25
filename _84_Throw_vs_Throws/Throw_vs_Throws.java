package _84_Throw_vs_Throws;

class NegativeRadiusException extends Exception {
    @Override
    public String toString() {
        return "Radius cannot be negative";
    }
    @Override
    public String getMessage() {
        return "Radius cannot be negative";
    }
}
public class Throw_vs_Throws {
    public static double area(int r) throws NegativeRadiusException {
        if(r<0){
            throw new NegativeRadiusException(); // show an exception
        }
       // return Math.PI*r*r; // Direct method
        double result = Math.PI*r*r;
        return result;
    }
    // Made by Kamal
    public static int divide(int a, int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        // Shivam --Uses divide function created by Kamal
        try{
//            int c = divide(12,0);
//            System.out.println(c);
            double ar = area(-4);
            System.out.println(ar);
        }
        catch (Exception e){
            System.out.println("Exception");
        }
    }
}

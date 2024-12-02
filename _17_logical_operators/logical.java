package _17_logical_operators;

public class logical {

    public static void main(String[]args){

        System.out.println("For logical AND..");
        boolean a= true;
        boolean b = true;
        if(a && b){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        System.out.println("For logical OR...");
        boolean a1 = false;
        boolean b2 = false;
        if(a1 || b2){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        System.out.println("For logical NOT...");
        System.out.print("Not(a1) is: ");
        System.out.println(!a1);
        System.out.print("Not (b2) is :");
        System.out.println(!b2);
    }

}

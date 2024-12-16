package _32_Method_Overloadiing;

// overloading means " Naam ek kaam alag alag "
public class overloading {
    static void foo(){   // Here, we not give argument to foo
        System.out.println("Good morning shefali  ");
    }
    static void foo(int a ){   // Here, we give argument
        System.out.println("I love  "+ a +" people");
    }

    /*
        Difference between argument and parameter ?
            Argument are Actual
            Here 343,1, 434 etc.  are argument
            and int a , int b are parameters
     */

    static void foo(int a , int b){
        System.out.println("I have crush only " +a +" girl" );
        System.out.println("You have enterd the number: "+ b );
    }
    public static void main(String[]args){
        foo();
        foo(343);
        foo(1,434);
        // Argument are Actual


    }

}

package _109_AnonymousClasses_and_LambdaExpressions;

// Lambda Expressions use for interface having only one method.
@FunctionalInterface
interface DemoAno{
    void method1();
//    void method2();  // we have commented this line because we can use only one method in @FunctionalInterface
}
//class BikeDemo implements DemoAno{
//    @Override
//    public void method1() {
//        System.out.println("I am implementing the method 1");
//    }
//}
//class AnnoDemo implements DemoAno{
//    public void display(){
//        System.out.println("I am displaying");
//    }
//
//    @Override
//    public void method1() {
//        System.out.println("I am method 1");
//    }
//
//    @Override
//    public void method2() {
//        System.out.println("I am method 2");
//    }
//}
public class AnonymousClasses_LambdaExpressions {
    public static void main(String[] args) {
//        AnnoDemo obj = new AnnoDemo();
//        obj.method2();

        // Anonymous class
//        DemoAno obj = new DemoAno() {
//            @Override
//            public void method1() {
//                System.out.println("I am method 1");
//            }
//
//            @Override
//            public void method2() {
//                System.out.println("I am method 2");
//            }
//        };
//        obj.method1();
//        obj.method2();

        // Lambda Expression :

//        DemoAno bd = new BikeDemo();
//        bd.method1();

        DemoAno da = ()->{  //using of lambda, Direct use if function having only one interface
            System.out.println("I am kamal and using of lambda expression" );
        };
        da.method1();
    }
}

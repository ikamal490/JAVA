package _31_Methods;

public class rough {
     int addValue(int x,int y){  // if we remove static from this line then we have to create an object
        int z;
        if(x<y){
            z = x*y;
        }
        else{
            z = x+y;
        }
       return z;
    }

    static void whoIsCrush(){
        System.out.println("Shefali");
    }
    static void tellMeJoke(){
        System.out.println("I am Elon Musk ");
    }

    static void change(int a ){
         a = 34;  // It doesn't change the value of a(original) to 34 because it stores the copy
    }
    static void changeInArray(int[] arr){
        arr[0] = 834;
    }

    static void coco(){
        String strr = "Hello, I am Kamal Singh";
        System.out.println(strr);
        System.out.println(" Bhai Ke Haal hai !!");
    }
    static void foo(){   // Here, we not give argument to foo
        System.out.println("Good morning shefali  ");
    }
    static void foo(int a ){   // Here, we give argument
        System.out.println("I love " + a+ " people");
    }
    static void coco(String s){
         String str = "I want to dring " +s;
        System.out.println(str);
         coco();
    }

    public static void main(String[] args) {
        int a = 12;
        int b = 12;
        int c;
//        if(12<12){
//            c = 12*12;
//        }
//        else{
//            c = 12+12;
//        }
//        System.out.println(c);
        rough obj = new rough();  // we don't use of static keyword so, we initialize the object
//        c = addValue(a,b);  // it throws an error if we don't use of a static keyword
        c = obj.addValue(a,b);
        System.out.println(c);

        int a1 = 12;
        int b1 = 10;
        int c1;
//        if(12<10){
//            c1 = 12*10;
//        }
//        else{
//            c1 = 12+10;
//        }
//        System.out.println(c1);
        c1 = obj.addValue(a1,b1);
        System.out.println(c1);

        int a2 = 9;
        int b2 = 12;
        int c2;
//        if(9<12){
//            c2 = 9*12;
//        }
//        else{
//            c2 = 9+12;
//        }
//            System.out.println(c2);
        c2 = obj.addValue(a2,b2);
        System.out.println(c2);

        System.out.println("\nUse of void in method : ");
        whoIsCrush();
        tellMeJoke();
        // Changing the integer :
        System.out.println("\nChanging the integer :");
        int p = 12;  // It is the original value
        change(p);
        System.out.println("The value of p after running change is :" +p);

        // Changing the array :
        System.out.println("\nChanging the array :");
        int[] marks = {87,34,75,63,37};
        changeInArray(marks);
        System.out.println(marks[0]);
        System.out.println(marks[1]);

        coco();
        foo();
        foo(20);
        coco("beer");
    }
}

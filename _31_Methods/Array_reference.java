package _31_Methods;

public class Array_reference {
    static void tellJoke(){
        System.out.println("Shefali will be my Wife in Future !!");
    }
    static void change(int a ){
        a = 98;
    }
    static void change2(int []arr){
        arr[0] = 32;   // --> Array ke pehle element ko 54 karne ki kosish karega
    }
    public static void main(String[]args){
        tellJoke();
//      //  Case 1 : Changing the Integer
//        int x = 78;
//        change (x);
//        System.out.println("The value of x after runnig change is: " +x);

        // Case 2 : Changing the Array :
        int [] marks = {54,43,65,67,87,65,56};  // marks eska address store kar rha hai --> means marks ko pata hai ye cheez kaha par hai , marks is the reference
        change2(marks);  // --> esko ese bolenge " change2 me marks ko pass karenge "
        System.out.println("The value of marks[0] after runnig change2 is: " +marks[0]);

    }

    }


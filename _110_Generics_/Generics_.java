package _110_Generics_;

import java.util.ArrayList;

class MyGeneric<T1>{
    int val;
    private T1 t1;
    public MyGeneric(int val, T1 t1) {  // constructor made
        this.val = val;
        this.t1 = t1;
    }
    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }
}

public class Generics_ {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList(); // correct method
//        ArrayList<int> arrayList = new ArrayList();  -- this will produce an error
//        arrayList.add("Hello"); // we made this arrayList as an integer, it shows an error
        arrayList.add(10);
        arrayList.add(435);
       // int a = (int)arrayList.get(2); // if we don't use of ArrayList<Integer> use that
        int a = arrayList.get(1);
        int a1 = arrayList.get(0);
        System.out.println(a);
        System.out.println(a1);

        MyGeneric<String> g1 = new MyGeneric(23,"Hole Hole Ho jayega pyyar");
        String str = g1.getT1();
        System.out.println(str);
    }
}
/*
Output:
    435
    10
    Hole Hole Ho jayega pyyar
 */

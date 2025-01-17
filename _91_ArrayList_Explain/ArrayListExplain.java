package _91_ArrayList_Explain;

import java.util.ArrayList;
public class ArrayListExplain {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(2);
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(9);
        l2.add(25);
        l2.add(78);
        l2.add(93);
        l2.add(67);
        l1.add(0,4);
        l1.add(0,100);
        l1.addAll(l2);
        //l1.clear(); // clear the above // uncomment and run this line
        l1.add(83);
        l1.remove(0); // remove the element from the index 0
        l1.set(2,490); // set 490 on index 2
        System.out.println(l1.contains(32)); // false // kya 32 'l1' me preset hai ya nhi
        System.out.println(l1.contains(3)); // true
        System.out.println(l1.indexOf(9)); // present on 6th number of the array , counting start with 0
        System.out.println(l2.clone()); // yeh clone kar deta hai object ko wapas print kar deta hai
        for (int i = 0; i < l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(",  ");
        }
    }
}

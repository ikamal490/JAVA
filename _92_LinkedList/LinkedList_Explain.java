package _92_LinkedList;
// Linked list implement of the Queue data structure
// Queue --In Java, a queue is a data structure that follows the First-In-First-Out (FIFO) principle.
//          This means that the first element added to the queue (front) will be the first one removed (rear)
import java.util.LinkedList;

public class LinkedList_Explain {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>(); // There is no initial capacity in the linked list
        l1.add(4);
        l1.add(9);
        l2.add(93);
        l2.add(69);
        l1.add(0,4);
        l1.add(0,100);
        l1.addAll(l2);
        //l1.clear(); // clear the above // uncomment and run this line
        l1.add(83);
        l1.addLast(465); // Special method(addLast) which doesn't support in arrayList
        l1.addFirst(156); // Special method(addFirst) which doesn't support in arrayList
//        l1.remove(0); // remove the element from index 0 i.e.: 100
        l1.set(2,490); // set 490 on index 2
        System.out.println(l1.contains(32)); // false // kya 32 'l1' me preset hai ya nhi
        System.out.println(l1.indexOf(9)); // present on 4th number of the array, counting starts with 0
        for (int i = 0; i < l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(",  ");
        }
        System.out.print("\nThe first element of index is: ");
        System.out.println(l1.getFirst());
        System.out.print("The last element of index is: ");
        System.out.println(l1.getLast());
    }
}
/*
Output:
    false
    4
    156,  100,  490,  4,  9,  93,  69,  83,  465,
    The first element of index is: 156
    The last element of index is: 465
 */

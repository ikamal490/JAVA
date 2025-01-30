package _93_ArrayDeque;

import java.util.ArrayDeque;
public class Array_Deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> a = new ArrayDeque<>();
        a.add(37);
        a.add(23);
        a.add(69);
        a.addFirst(829);
        a.offerFirst(999);
        a.removeFirst(); // remove 999 from the index
        a.pollFirst(); // remove 829 from the index, it is the same as a.removeFirst()
        a.addFirst(633);
        a.addLast(672);
        System.out.println(a);
        System.out.print("The first element of this index is : ");
        System.out.print(a.getFirst()+" | ");
        System.out.println(a.peekFirst()); // same as a.getFirst(),[ a.peekFirst() ] it doesn't throw an exception
        System.out.print("The last element of this index is : ");
        System.out.println(a.getLast());
    }
}
/*
Output:
    [633, 37, 23, 69, 672]
    The first element of this index is : 633 | 633
    The last element of this index is : 672
 */
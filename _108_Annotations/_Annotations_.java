package _108_Annotations;

class MySelf{
@Deprecated
public int sum(int a, int b) {
    return a + b;
    }
@FunctionalInterface // we can only add one method in FunctionalInterface
public interface myFunctionalInterface{
    void thisMethod();
    }
}
public class _Annotations_ {
    public static void main(String[] args) {
        @SuppressWarnings("Deprecation") // esko use karne se main function me se warning remove ho jayegi
       MySelf obj = new MySelf();
        System.out.println(obj.sum(2,5));
    }
}
/*
Output:
    7
 */

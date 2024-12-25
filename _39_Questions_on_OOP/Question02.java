package _39_Questions_on_OOP;
/*
    problem : Create a class cellphone with methods to print
                "ringing" , "vibrating" , "calling"...
 */
class CellPhone{
    String name = "Kamal";
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling Kunal...");
    }

}
public class Question02 {
    public static void main(String[] args) {
        CellPhone iqoo = new CellPhone();
        iqoo.callFriend();
        iqoo.vibrate();
        iqoo.ring();
    }
}

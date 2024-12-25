package _39_Questions_on_OOP;
/*
    problem : Create a class ViceCity for rockstar games capable of hitting
                (printing hitting..), running , firing etc..
 */
class ViceCity{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on enemy");
    }
}
public class Question05 {
    public static void main(String[] args) {
        ViceCity player1 = new ViceCity();
//        System.out.println(player1.hit();); // It gave an error because hit is void method we can't print void with use of println , agar void ki jagah int hota or kuch value return karta, toh hum println use kar sakte the
        player1.hit();
        player1.run();
        player1.run();
    }
}

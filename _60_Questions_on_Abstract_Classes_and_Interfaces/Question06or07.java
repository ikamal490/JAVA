package _60_Questions_on_Abstract_Classes_and_Interfaces;

/*
    Question06: Create an Interface TvRemote and use it to inherit another Interface SmartTvRemote
    Question07: Create a class Tv which implements TvRemote interface from Question06
 */
interface SmartTvRemote{
    void powerOn();
    void switchToCartoonNetwork();
}
interface TvRemote extends SmartTvRemote{
    void limitedChannels();
    void ddNationalChannel();
}
class Tv implements TvRemote{
    @Override
    public void powerOn(){
        System.out.println("TV Powering On");
    }
    @Override
    public void switchToCartoonNetwork(){
        System.out.println("Doremon is Streaming...");
    }
    @Override
    public void limitedChannels(){
        System.out.println("I have only 25 channels");
    }
    @Override
    public void ddNationalChannel(){
        System.out.println("DD National Channel is most popular");
    }
    void myFav(){
        System.out.println("My Favorite Channel is Star Gold ");
    }
}
public class Question06or07 {
    public static void main(String[] args) {
        Tv t = new Tv();
        t.powerOn();
        t.switchToCartoonNetwork();
        t.myFav();
        t.limitedChannels();
        t.ddNationalChannel();
    }
}
/*
Output:
    TV Powering On
    Doremon is Streaming...
    My Favorite Channel is Star Gold
    I have only 25 channels
    DD National Channel is most popular
 */

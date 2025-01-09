package _57_Default_Methods;
// Interface is the group of methods hai, jinko class me implement jarur karna hai

interface Camera {
     /*
     void takeSnap(){
         System.out.println("Taking a snap ...");
     }
    -->  It's thrown an error,because we can't implement methods in interface
      */
    void openCamera();
    void takeSnap();
    void recordVideo();
//    void recordIn4K(); // we are not implementing this method below so, we have to use the default interface
    private void greet(){
        System.out.println("Good Morning Everyone !");
    }
    default void recordIn4K(){
        greet();
        System.out.println("Recording in 4K");
    }
}
interface wifi{
    String[] getNetwork();
    void connectToNetwork(String network);
}
class CellPhone{
    void callPhone(long phoneNumber){
        System.out.println("Calling to "+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting ...");
    }
}
class SmartPhone extends CellPhone implements wifi,Camera{
    public void openCamera(){
        System.out.println("Opening camera ...");
    }
    public void takeSnap(){
        System.out.println("Taking a snap");
    }
    public void recordVideo(){
        System.out.println("Recording video");
    }
//    public void recordIn4K(){  // If we override this will show in the output, not the default interface method
//        System.out.println("Recording video in 4K Resolution...");
//    }
    public String[] getNetwork( ){ // getNetwork is the name of an array
        System.out.println("Getting List of network :");
        String[] networkList = {"JioFibre", "AirtelNetwork","5G Network","Kamal"};
        return networkList;
        }
    public void connectToNetwork(String network){
        System.out.println("Connecting to "+network);
    }
}
public class Default_Methods {
    public static void main(String[] args) {
        CellPhone nokia = new CellPhone(); // CellPhone is a parent class
        SmartPhone vivo = new SmartPhone();
        nokia.callPhone(941417);  // output: Calling to 941417
        vivo.openCamera(); // output: Opening camera ...
        vivo.takeSnap(); // output: Taking a snap
        vivo.recordVideo(); // output: Recording video
        vivo.callPhone(9414173314l);  // output: Calling to 9414173314
        vivo.pickCall(); // output: Connecting ...
        String[] Arr = vivo.getNetwork();
        for(String network:Arr){ // Arr is an array name
            System.out.println(network);
        }  // output: JioFibre, AirtelNetwork, 5G Network, Kamal
        vivo.connectToNetwork("AirtelNetwork"); // output: Connecting to AirtelNetwork
        vivo.recordIn4K(); // It is a default interface
//        vivo.greet;  // throw an error, we directly not use here because it is a private access modifier
    }
}
/*
Output:
    Calling to 941417
    Opening camera ...
    Taking a snap
    Recording video
    Calling to 9414173314
    Connecting ...
    Getting List of network :
    JioFibre
    AirtelNetwork
    5G Network
    Kamal
    Connecting to AirtelNetwork
    Good Morning Everyone !
    Recording in 4K
 */

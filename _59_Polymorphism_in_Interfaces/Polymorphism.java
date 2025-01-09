package _59_Polymorphism_in_Interfaces;

interface Camera {
    void openCamera();
    void takeSnap();
    void recordVideo();
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
class SmartPhone extends CellPhone implements wifi,Camera {
    public void openCamera(){
        System.out.println("Opening camera ...");
    }
    public void takeSnap(){
        System.out.println("Taking a snap");
    }
    public void recordVideo(){
        System.out.println("Recording video");
    }
    public String[] getNetwork( ){ // getNetwork is the name of an array
        System.out.println("Getting List of network :");
        String[] networkList = {"JioFibre", "AirtelNetwork","5G Network","Kamal"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to "+network);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Camera cam1 = new SmartPhone(); // This is a SmartPhone but, use it as a Camera
        cam1.openCamera(); // Camera is the reference and SmartPhone is the object
        //cam1.connectToNetwork(); // Not Allowed
        //cam1.callPhone();  // Not Allowed

        wifi nw = new SmartPhone(); // This is a SmartPhone but, use it as a wifi
        nw.connectToNetwork("Jio Network");
        //nw.openCamera(); //  Not Allowed

//        wifi np = new CellPhone(); --> throw error, we can't access wifi from CellPhone
//        Camera mp = new CellPhone(); --> throw error

        System.out.println("\nBy Using of SmartPhone Class :");
        SmartPhone sp = new SmartPhone();
        sp.openCamera();
        sp.connectToNetwork("Jio Network");
        sp.callPhone(3434);
    }
}
/*
Output:
    Opening camera ...
    Connecting to Jio Network

    By Using of SmartPhone Class :
    Opening camera ...
    Connecting to Jio Network
    Calling to 3434
 */
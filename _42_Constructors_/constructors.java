package _42_Constructors_;
// A member function used to initialize an object while creating it.
class MyEmployee{
    private int id;
    private String name;

    public MyEmployee(){   // Constructor , no need to invoke ,automatically invoke
        id = 69;
        name = "Pushpa Raj "; // There is no return value
    }
    public MyEmployee(String myName){
        id = 1212;
        name = myName;
    }
    public MyEmployee(String myName , int myId){
        id = myId;
        name = myName;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        //name = n;
        this.name = n;
        // name = n  or this.name = n , both are correct choose any one and use them
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
        id = i;
    }
}
public class constructors {
    public static void main(String[] args) {
//        MyEmployee shefali = new MyEmployee("Hello Shefali", 123);
//        MyEmployee shefali = new MyEmployee("Dakku");
        MyEmployee shefali = new MyEmployee();

        shefali.setName("Shefali chopra ");  // If we comment out these two lines .setName or .setId we got output of public MyEmployee
        shefali.setId(465);
        System.out.println(shefali.getId());
        System.out.println(shefali.getName());

    }
}

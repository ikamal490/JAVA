package _40_Access_modifiers;
class MyEmployee{
   private int id; // we can access private ka saman by using of methods
   private String name; // If we use private keyword ,then use of getter or setter in code to access values

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
public class getters_setters {
    public static void main(String[] args) {
        MyEmployee kamal = new MyEmployee();   // Here, kamal is an object
//        kamal.id = 490;
//        kamal.name = "Kallu Bhai";  --> throws an error due to  private access modifier
        kamal.setName("Kallu Bhai"); // If we comment out these two lines .setName or .setId we got output null or 0
        kamal.setId(490);
        System.out.println(kamal.getName());
        System.out.println(kamal.getId());
    }
}

package _42_Constructors_;
class MainEmployee{
        //int id;  // System.out.println(rocky.id);  // we directly access the id from the main function
        //String name; // System.out.println(rocky.name);  // we directly access the name from the main function
    private int id;  // we have to use of getter i.e; System.out.println(rocky.getId());
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void printdetails() { // method
        System.out.println("Your name is : " + name + " and your id is : " + id);
    }
    public MainEmployee(int id, String name) { // It's an Overloaded constructor
        this.id = id;
        this.name = name;
    }
}
public class Full_Constructor{
    public static void main(String[] args) {
        MainEmployee rocky = new MainEmployee(343, "Raghu");
        //rocky.id = 637;  // If we don't use of private modifiers , we use this
        //rocky.name = "Kamal";  // It showed an error because we use of access modifiers which is private
        //System.out.println(rocky.id);   // It showed an error because we use of access modifiers which is private
        //System.out.println(rocky.name); //  If we remove private that will run properly not showed any error

        //rocky.setId(2322); // If we uncomment this line , then System.out.println(rocky.getId()); will print the 2322 because we set it

        System.out.println(rocky.getId());  // output : 343
        System.out.println(rocky.getName()); // output : Raghu

        rocky.printdetails();  // output : Your name is : Raghu and your id is : 343
        rocky.setName("I am Raghu");
        rocky.setId(23);
        System.out.println(rocky.getName()); // output : I am Raghu
        System.out.println(rocky.getId()); // output : 23
        rocky.printdetails(); // Output : Your name is : I am Raghu and your id is : 23
        /*
            Overall Code Output
            343
            Raghu
            Your name is : Raghu and your id is : 343
            I am Raghu
            23
            Your name is : I am Raghu and your id is : 23
         */
    }
}

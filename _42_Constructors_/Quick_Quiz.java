package _42_Constructors_;
/*
    Quiz : Overload the Employee constructor to initialize the salary to Rs.10,000
 */
class Employee{
    String name;
    int id;
    int salary;
    // Constructor with name parameter
    public Employee(){
         this.name = "Kamal";
         this.id = 342;
         this.salary = 90000;
    }
    // Constructor with name and id, default salary = 10,000
    public Employee(String name){
        this.name = name;
         this.id = 744;
         this.salary = 10000;  // Overloading requirement
    }
    // Constructor with all parameters

    public Employee(String name,int id,int salary){
//        this.name = "Kamal";
        this.name = name;
        this.id =id;
        this.salary = salary;
    }
    public void setId(int myId){
        this.id = myId;
    }
    public void setSalary(int salary){
        this.salary =salary;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getId(){
        return id;
    }
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
        }
public class Quick_Quiz {
    public static void main(String[] args) {
        Employee Ramu  = new Employee("kamal");
        Ramu.setId(233);
        Ramu.setSalary(9000);
//        Ramu.setName("KoKo");
        System.out.println(Ramu.getName());
        System.out.println(Ramu.getId());
        System.out.println(Ramu.getSalary());
    }
}

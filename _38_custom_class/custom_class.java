package _38_custom_class;
class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){  // It is a method
        System.out.print("Your Id is : " +id);
        System.out.println(" and your name is : "+name );
    }
    public int getSalary(){
        return salary;
    }
}
public class custom_class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee kamal = new Employee(); // Instantiating a new Employee Object
        //  Here,kamal is object in above line
        Employee hemant = new Employee();

        // Setting properties / Attributes for kamal
        kamal.id = 43;
        kamal.name = "Dhakad JI";
        kamal.salary = 340000;

        // Setting properties / Attributes for hemant
        hemant.id = 466;
        hemant.name = "Jain Shahab";
        hemant.salary = 43000;

        // Printing the Attributes
        kamal.printDetails();
        hemant.printDetails();
        int salary = kamal.getSalary();
        System.out.println(salary);

//        System.out.println(kamal.id);
//        System.out.println(kamal.name);
    }
}

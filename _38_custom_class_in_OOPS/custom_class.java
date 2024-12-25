package _38_custom_class_in_OOPS;
class Employee{
    // Attributes --> tell you more about the class e.g--> name , age ,salary
    int id;  // id , salary and name are attributes
    int salary;
    String name;
    public void printDetails(){  // It is a method
        System.out.print("Your Id is : " +id);
        System.out.println(" or your name is : "+name+ " and your salary is : "+salary);
    }
    public int getSalary(){  // It is a method
        return salary;
    }
}
public class custom_class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee kamal = new Employee(); // Instantiating a new Employee Object
        //  Here,kamal is object in above line and Employee is our custom class
        Employee hemant = new Employee();

        // Setting properties / Attributes for kamal
        kamal.id = 43;    // object1.attributes
        kamal.name = "Dhakad JI";
        kamal.salary = 340000;

        // Setting properties / Attributes for hemant
        hemant.id = 466;  // object2.attributes
        hemant.name = "Jain Shahab";
        hemant.salary = 43000;

        // It is basic way to print
        // Printing the Attributes
//        System.out.println("\"Kamal\"");
//        System.out.println(kamal.id);
//        System.out.println(kamal.name);
//        System.out.println(kamal.salary);
//        System.out.println("\"Hemant\"");
//        System.out.println(hemant.id);
//        System.out.println(hemant.salary);
//        System.out.println(hemant.name);

        kamal.printDetails();  // direct print the method
        hemant.printDetails();
//        int salary = kamal.getSalary();
//        System.out.println(salary);
         System.out.println(kamal.getSalary());  // Direct method to write above two lines
    }
}

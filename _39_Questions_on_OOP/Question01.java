package _39_Questions_on_OOP;
/*
    problem :
            Create a class karmchari with following properties and methods:
            salary(property)(int)
            getSalary(method returning int)
            name(property)(String)
            getName(method returning String)
            setName(method changing name)
 */
class karmchari{
    String name;
    int salary;
    public int getSalary(){
        return salary;
    }
    public void setName(String n){
        name =n ;
    }
    public String getName(){
        return name;
    }
}

public class Question01 {
    public static void main(String[] args) {
        karmchari kamal = new karmchari();
        kamal.setName("Kamal Singh Dhakad");
        System.out.println(kamal.getName());
        kamal.salary = 15000;
        System.out.println(kamal.getSalary());

        kamal.name = "Ke Haal Chaal Hai ";
        System.out.println(kamal.getName());
    }
}

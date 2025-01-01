package _26_Array;
/*
    WAP to print the elements of an array in reverse order
 */
public class Quick_Quiz {
    public static void main(String[] args) {
        String[] name = new String[5];
        name[0] = "kamal";
        name[1] = "kunal";
        name[2] = "hemant";
        name[3] = "shefali";
        name[4] = "aman";
        for(int i=name.length-1 ; i>=0; i--){
            System.out.println(name[i]);
        }
    }
}

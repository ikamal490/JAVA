package _107_Javadocs_Method_Tags;

// it is the class description
/**
 * Welcome to my class, Ruko Chai paani laate hai tumhare liye
 */
public class Javadocs_Methods {
    /**
     *
     * @param args These are the arguments supplied to the terminal
     */
    public static void main(String[] args) {
        System.out.println("I am a main method");

    }

    /**
     *Hello Everyone, Mera naam kamal hai or mere dost ka naa kunal hai
     * @param i This the first number to add
     * @param j This the second number to add
     * @return sum of two numbers as an integer
     * @throws Exception if i is 0
     * @deprecated This method is deprecated please use this method + Operator
     */
    public int add(int i,int j) throws Exception {
        if(i == 0){
            throw new Exception();
        }
        int c;
        c = i + j;
        return c;
    }
}
/*
Output:
    I am a main method
 */

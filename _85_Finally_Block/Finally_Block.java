package _85_Finally_Block;

public class Finally_Block {
    public static int greet(){
        try{
            int a = 50;
            int b = 0;
            int c = a/b;
            return c;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally { // Kisi bhi haal me ye execute hoga, chahe kuch bhi ho
        System.out.println("This is the end of this fucntion");
        }
        return 0;
    }
    public static void main(String[]args){
        greet();
        System.out.println();
        System.out.println(greet());
    }
}

package Self_Practise;

public class methods {
//    static int shotcut(int a , int b){ // a and b is any number we want to modify
//        int c; // result
//        if(a>b){
//            c = a*b;
//        }
//        else{
//            c = b*5;
//        }
//        return c;
//    }
   int shotcut(int a , int b){ // we don't use of static keyword
        int c; // result
        if(a>b){
            c = a*b;
        }
        else{
            c = b*5;
        }
        return c;
    }

    public static void main(String[]args){
//        int k = 4;
//        int p = 23;
//        int z;
//        z = shotcut(k,p);
//        System.out.println(z);

        // Using of class name :
        methods obj = new methods();
        int a = 12;
        int b = 22;
        int c ;
        c = obj.shotcut(a,b);
        System.out.println(c);

        }
}

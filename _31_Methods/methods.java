package _31_Methods;

public class methods {
    static int logic (int x, int y){  // We call directly in main by creating a static object. It is copy of a and b
        int z;
        if(x<y){
            z=x+y;
        }
        else{
            z=(x+y)*10;
        }
        return z;
    }
    public static void main(String[]args){
        int a=14;
        int b=4;
        int c;
        /*
            if(a>b){
           c=a+b;
        }
        else{
            c=(a+b)*10;
        }
        We using of below method instead using of this logic
         */
        c = logic(a,b);
        int a1=5;
        int b1=43;
        int c1;
        /*
        if(a1>b1){
         c1=a1+b1;
        }
        else{
            c1=(a1+b1)*10;
        }
         */
        c1 = logic(a1,b1);
        int p =23;
        int q = 12;
        int k;
        k = logic(p,q);
        System.out.println(c );
        System.out.println(c1);
        System.out.println(k);
    }
}

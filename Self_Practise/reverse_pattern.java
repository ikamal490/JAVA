package Self_Practise;

public class reverse_pattern {
    static void pattern(int n){
        if(n>0){
            pattern(n-1);
            for(int i=n; i>0; i--){
                System.out.println("*");
            }
            System.out.println();
        }
    }



}


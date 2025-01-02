package Self_Practise;

public class loops {
    public static void main(String[] args) {
        System.out.println("Using of While Loop :");
        int n = 0;
        while (n <= 15) {
            System.out.println(n);
            n++;
        }

        System.out.println("Using of do-while loop :");
        int d = 1;
        do{
            System.out.println(d);
            d++;
        }while(d<=9);

        System.out.println("Using of For loop :");
        for(int f=10; f>0; f--){
            System.out.println(f);
        }
    }
}


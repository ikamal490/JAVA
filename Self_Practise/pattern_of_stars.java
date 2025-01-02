package Self_Practise;

public class pattern_of_stars {
    public static void main(String[] args) {
//        int i =5;
//        while(i!=0){
//            System.out.print("*");
//            i--;
//        }
//        System.out.println();

//        for(int i=0; i<=4; i++){ // printing the stars
//        for(int j=0; j<=i; j++){
//        System.out.println("*");
//        }
//            System.out.println(); // Next Line
//        }

        for(int i=1; i<=5; i++){  // Rows
            for(int j=1; j<=5; j++){ // Column
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

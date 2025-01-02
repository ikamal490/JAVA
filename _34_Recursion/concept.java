package _34_Recursion;
// IMP rough
public class concept {
      /*
         Working Process :
         5*factorial(5-1)
         5*4*factorial(4-1)
         5*4*3*factorial(3-1)
         5*4*3*2*factorial(2-1)
         5*4*3*2*1*factorial(1-1)
       */

   static int factorial(int n){
      int sum =1;
      for(int i=1; i<=n; i++){
       sum = sum*i;
      }
      return sum;
   }
   public static void main(String[] args) {
      System.out.println(factorial(3));
   }
   /*
      sum = 1;
      Step 1: i = 1
      sum = sum * i → sum = 1 * 1 → sum = 1
      Step 2: i = 2
      sum = sum * i → sum = 1 * 2 → sum = 2
      Step 3: i = 3
      sum = sum * i → sum = 2 * 3 → sum = 6
      Step 4: i = 4
      sum = sum * i → sum = 6 * 4 → sum = 24
      Step 5: i = 5
      sum = sum * i → sum = 24 * 5 → sum = 120

    */
   }


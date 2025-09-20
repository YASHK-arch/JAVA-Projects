import java.util.*;
public class factorial {
       public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int fact1 = 1;
        int fact2 = 1;
        int fact3 = 1;
        for (int i = 2; i <= n; i++) {
            fact1 = fact1 * i;
        }
        for (int j = 2; j <= r; j++) {
            fact2 = fact2 * j;
        }
        for (int l = 2; l <= n - r; l++) {
            fact3 = fact3 * l;
        }
        int ncr = fact1 / (fact2 * fact3);
        System.out.println(ncr);

        
       //static long factorial(int n){
       // long fact = 1;
      //  for(int i=2;i<=n;i++){
      //      fact = fact * i;
      //  }
     //   return fact;
     //  }
    

       }
}
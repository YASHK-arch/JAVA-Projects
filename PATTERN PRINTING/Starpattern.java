import java.util.*;
public class Starpattern {
   public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //PART 1
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n - i; j++) {                   ///int 11,9,7 stars &  int 0,1,2 gaps///
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //PART 2
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {                       ///int 7,9,11 stars &  int 2,1,0 gaps///
                System.out.print("  ");
            }
            for (int j = 1; j <= 4 * n - (2 * i - 1); j++) {                   
                System.out.print("* ");
            }
            System.out.println();
        }
        //PART 3                                          ///PART-3 REVERSE OF 2 AND PART-4 REVERSE OF 1///
        for (int i = n; i >= 1; i--) {                     //OUTER LOOP CHANGE NO NEED TO CHANGE THE INNER LOOPS//
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 4 * n - (2 * i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
            //PART 4
           for (int i = n; i >= 1; i--) {
               for (int j = 1; j <= 2 * n - i; j++) {          
               System.out.print("  ");
              }
              for (int j = 1; j <= 2 * i - 1; j++) {
                   System.out.print("* ");
               }
              System.out.println();
           }
    
       
    }
}
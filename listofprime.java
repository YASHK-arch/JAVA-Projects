import java.util.*;
public class listofprime {
   public static void main(String args[]){
    //Print prime numbers between 2 numbers A and B,both inclusive//
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int min = 0;
        int max = 0;
        if (A < B) {
            min = A;
            max = B;
        }1 
        else {
            min = B;
            max = A;
        }
        int pcount = 0;
        int div = 1;
        int count = 0;
        while (min <= max) {

            while (div <= min) {
                if (min % div == 0) {
                    count++;
                }
                div++;
            }
            if (count == 2) {
                pcount++;
            }
            min++;
            div=1;
            count=0;
        }
        System.out.println(pcount);

   }  
}
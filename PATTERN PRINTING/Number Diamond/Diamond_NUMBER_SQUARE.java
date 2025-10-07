 import java.util.*;
import java.lang.*;
import java.io.*;

class Diamond_NUMBER_SQUARE
{
        public static final String RESET = "\u001B[0m";
        public static final String RED = "\u001B[31m";
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            int p = 1;
            for (int j = 1; j <= N - i + 1; j++) {
                System.out.print(p++ + " ");
                
            }
            int q = N - i + 1;
            for (int j = 1; j <= i - 1; j++) {
                System.out.print( RED + q + RESET+" ");
            }
            int r = N - i + 1;
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(RED + r + RESET + " ");
            }
            int s = N - i;
            for (int j = N-i; j >= 1; j--) {
                System.out.print(s-- + " ");
            }
            System.out.println();
        }
     for (int i = N-1; i >= 1; i--) {
            int p = 1;
            for (int j = 1; j <= N - i + 1; j++) {
                System.out.print(p++ + " ");
            }
            int q = N - i + 1;
            for (int j = 1; j <= i - 1; j++) {
                System.out.print( RED + q + RESET+" ");
            }
            int r = N - i + 1;
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(RED + r + RESET + " ");
            }
            int s = N - i;
            for (int j = N-i; j >= 1; j--) {
                System.out.print(s-- + " ");
            }
            System.out.println();
        }

    }
} 






import java.util.*;
import java.lang.*;
import java.io.*;

class Symmetric_number_pyramid
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" " + " ");
            }
            int p = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(p++ + " ");
            }
            int k = i - 1;
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(k-- + " ");
            }
            System.out.println();
        }

    }
}
import java.util.*;
import java.lang.*;
import java.io.*;

class HOLLOW_SQUARE
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i == 1 || j == 1 || i == N || j == N) {
                    System.out.print("* " + " ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

    }
}

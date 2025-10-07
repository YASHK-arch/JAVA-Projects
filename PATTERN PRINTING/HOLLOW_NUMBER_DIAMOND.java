import java.lang.*;
import java.util.*;

public class HOLLOW_NUMBER_DIAMOND {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      for (int i = 1; i <= N; i++) {
        int p = 1;
        for (int j = 1; j <= N - i; j++) {
          System.out.print(p++ + " ");
        }
        for (int j = 1; j <= i; j++) {
          System.out.print("_ ");
        }
        for (int j = 2; j <= i; j++) {
          System.out.print("_ ");
        }
        int q = N - i;
        for (int j = 1; j <= N - i; j++) {
          System.out.print(q-- + " ");
        }
        System.out.println();
      }
      for (int i = 1; i <= N - 1; i++) {
        int p = 1;
        for (int j = 1; j <= i; j++) {
          System.out.print(p++ + " ");
        }
        for (int j = 1; j <= N - i; j++) {
          System.out.print("_ ");
        }
        for (int j = 2; j <= N - i; j++) {
          System.out.print("_ ");
        }
        int q = i;
        for (int j = 1; j <= i; j++) {
          System.out.print(q-- + " ");
        }
        System.out.println();
      }
      for (int i = 1; i <= N; i++) {
        System.out.print(i + " ");
      }
      for (int i = N - 1; i >= 1; i--) {
        System.out.print(i + " ");
      }
    }
  }
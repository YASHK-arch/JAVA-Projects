import java.util.*;
//This method trims out the ending spaces from the pattern.
public class StringBuil_Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // Upper half (including middle)
        for (int i = 1; i <= N; i++) {
            StringBuilder row = new StringBuilder();              
            int p = 1;

            for (int j = 1; j <= N - i + 1; j++) {
                row.append(p++).append(" ");
            }

            int q = N - i + 1;
            for (int j = 1; j <= i - 1; j++) {
                row.append(q).append(" ");
            }

            int r = N - i + 1;
            for (int j = 1; j <= i - 1; j++) {
                row.append(r).append(" ");
            }

            int s = N - i;
            for (int j = N - i; j >= 1; j--) {
                row.append(s--).append(" ");
            }

            // Remove trailing space and print
            System.out.println(row.toString().trim());
        }

        // Lower half
        for (int i = N - 1; i >= 1; i--) {
            StringBuilder row = new StringBuilder();
            int p = 1;

            for (int j = 1; j <= N - i + 1; j++) {
                row.append(p++).append(" ");
            }

            int q = N - i + 1;
            for (int j = 1; j <= i - 1; j++) {
                row.append(q).append(" ");
            }

            int r = N - i + 1;
            for (int j = 1; j <= i - 1; j++) {
                row.append(r).append(" ");
            }

            int s = N - i;
            for (int j = N - i; j >= 1; j--) {
                row.append(s--).append(" ");
            }

            // Remove trailing space and print
            System.out.println(row.toString().trim());
        }
    }
}

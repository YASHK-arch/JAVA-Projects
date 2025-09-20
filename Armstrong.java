import java.util.*;
public class Armstrong {
 static int countofdigits(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;

        }
        return count;
    }
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cod = countofdigits(n);
        int copy_n = n;
        int sum = 0;

        while (n > 0) {
            int d = n % 10;
            sum = sum + (int) Math.pow(d, cod);
            n = n / 10;

        }
        if (sum == copy_n) {
            System.out.println("Armstrong");

        }
        else {
            System.out.println("Not");
        }

    }
}
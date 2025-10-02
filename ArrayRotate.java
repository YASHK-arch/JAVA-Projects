import java.util.*;
class ArrayRotate
{

    public static void rotate(int[] arr, int K) {
        int N = arr.length;
        K = K % N;    // if rotation count is greater than array length,(did to avoid extra rotation iterations)
        
        reverse(arr,0,N-1);     //reverse full array
        reverse(arr,0,K-1);     //reverse first part of the reversed array
        reverse(arr,K,N-1);     //reverse the remaining part of the reversed array

    }

     public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array count = ");
        int n = sc.nextInt();
        System.out.println("Enter Array numbers");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("<----Input Array----->");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        System.out.print("Enter Rotation count = ");
        int K = sc.nextInt();
        rotate(arr, K);
        System.out.println("Rotated Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
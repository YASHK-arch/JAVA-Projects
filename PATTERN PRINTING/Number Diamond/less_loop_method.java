import java.util.*;
import java.lang.*;
import java.io.*;

class less_loop_method
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            for(int i = N; i>=1; i--){
                for(int j = 1; j<=N ; j++){
                    if(j<=i){
                        System.out.print(j);
                    }
                    else{
                        System.out.print(i);
                    }
                    // if(j!=i){
                    //     System.out.print("_");
                    // }
                }
                for(int j = N-1; j>=1 ; j--){
                    if(j<=i){
                        System.out.print(j);
                    }
                    else{
                        System.out.print(i);
                    }
                    // if(j!=i){
                    //     System.out.print("_");
                    // }
                }
                System.out.println();
            }
    }
 }

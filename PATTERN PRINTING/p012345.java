import java.util.*;
class p012345{
    public static void main(String[]Args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  //rows
        int M = sc.nextInt(); //columns
        for(int i = 1; i<=N; i++){
            for(int j= 1; j<=M ;j++ ){
                if(i==1||i==N||j==1||j==M){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();   //space

        for(int i = 1; i<=N; i++){
            for(int j= 1; j<=M ;j++ ){
                if(j%2==0){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
     
            System.out.println();   //space 

         for(int i = 1; i<=N; i++){
            for(int j= 1; j<=M ;j++ ){
                if(i%2!=0||j==M && i<((N+1)/2)||j==1 && i>((N+1)/2)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

         System.out.println();   //space 

         for(int i = 1; i<=N; i++){
            for(int j= 1; j<=M ;j++ ){
                if(i%2!=0||j==M){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println(); 
        }

         System.out.println();   //space 

         for(int i = 1; i<=N; i++){
            for(int j= 1; j<=M ;j++ ){
                if(j==M||j==1 && i<=((N+1)/2)|| i==((N+1)/2)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

            System.out.println();   //space 

           for(int i = 1; i<=N; i++){
            for(int j= 1; j<=M ;j++ ){
                if(i%2!=0||j==1 && i<=((N+1)/2)||j==M && i>=((N+1)/2)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}

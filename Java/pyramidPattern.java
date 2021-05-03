import java.util.Scanner;

public class pyramidPattern {
   public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        // int pos = n-1;
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<n; j++){
        //         if(j>=pos) System.out.print("*");
        //         else System.out.print(" ");
        //     }
        //     for(int j=0; j<i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //     pos--;
        // }

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
   } 
}

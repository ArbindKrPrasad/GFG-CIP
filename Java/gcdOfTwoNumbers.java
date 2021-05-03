import java.util.Scanner;

public class gcdOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = Math.min(a, b);
        int gcd = -1;
        for(int i=1; i<=m; i++){
            if(a%i==0&&b%i==0) gcd = i;
        }
        System.out.println(gcd);

        sc.close();
        
    }
}

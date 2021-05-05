import java.util.Scanner;

public class primeFactorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                while(n%i==0){
                    System.out.print(i+" ");
                    n = n/i;
                }
            }
        }

        sc.close();

    }

    public static boolean isPrime(int x){
        for(int i=2; i<x; i++){
            if(x%i==0) return false;
        }
        return true;
    }
}
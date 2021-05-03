import java.util.Scanner;

public class findLastDigit {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n  = sc.nextInt();
        int res = n%10;
        System.out.println(res);
        sc.close();
    }
}

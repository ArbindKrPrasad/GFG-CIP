import java.util.*;
public class NthTermGP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();
        int res = a * (int)(Math.pow(r, n-1));
        System.out.println(res);
        sc.close();
    }
}

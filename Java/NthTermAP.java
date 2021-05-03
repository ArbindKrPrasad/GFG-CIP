import java.util.*;
public class NthTermAP {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();

        int res = a+(n-1)*d;
        System.out.println(res);
        sc.close();

    }
}

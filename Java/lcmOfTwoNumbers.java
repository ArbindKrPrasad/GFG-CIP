import java.util.Scanner;

public class lcmOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = Math.max(a, b);
        int lcm = -1;
        for(int i=a*b; i>=max; i--){
            if(i%a==0&&i%b==0) lcm = i;
        }
        System.out.println(lcm);
        sc.close();
    }
}

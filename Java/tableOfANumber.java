import java.util.Scanner;

public class tableOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.print(i*n+ " ");
        }
        sc.close();
    }
}

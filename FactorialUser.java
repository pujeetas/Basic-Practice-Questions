import java.util.Scanner;

public class FactorialUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = fact(n);
        System.out.println(result);
        sc.close();
    }

    public static int fact(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }
}

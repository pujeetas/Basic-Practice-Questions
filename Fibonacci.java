import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        displaySeries(n);
        sc.close();
    }
    public static void displaySeries(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.print(series(i) + " ");
        }
        System.out.println();
    }
    public static int series(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        else return series(n-1)+ series(n-2);
    }
}
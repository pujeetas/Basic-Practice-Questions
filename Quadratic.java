import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double D = b * b - 4 * a * c;

        if (D > 0) {

            double root1 = (-b + Math.sqrt(D)) / (2 * a);

            double root2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println(root1 + " " + root2);
        }
        else if(D == 0){
            double root = -b / (2 *a);
            System.out.println(root);
        }
        else{
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-D) / (2 * a);
            System.out.println("Root 1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2 = " + realPart + " - " + imaginaryPart + "i");
        }
        sc.close();
    }
}

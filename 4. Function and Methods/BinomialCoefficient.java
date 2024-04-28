import java.util.Scanner;

public class BinomialCoefficient {
    public static int binomialCoefficient(int n, int r) {
        int factOfn = 1;
        int factOfr = 1;

        int factOfnMr = 1;
        for(int i = 1; i <= n; i++) {
            factOfn *= i;
        }
        for(int i = 1; i <= r; i++) {
            factOfr *= i;
        }
        for(int i = 1; i <= n - r; i++) {
            factOfnMr *= i;
        }

        return (factOfn)/(factOfr*factOfnMr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter r: ");
        int r = sc.nextInt();


        int result = binomialCoefficient(n, r);
        System.out.println(result);
    }
}
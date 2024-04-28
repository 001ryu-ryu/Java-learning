import java.util.Scanner;

public class BinomialCoeff2 {
    public static int factorial(int n) {
        int fact = 1;
        for(int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static int binomialCoeff(int n, int r) {
        int factn = factorial(n);
        int factr = factorial(r);
        int factnMr = factorial(n - r);
        return (factn)/(factr*factnMr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter r: ");
        int r = sc.nextInt();


        int result = binomialCoeff(n, r);
        System.out.println(result);
    }
}
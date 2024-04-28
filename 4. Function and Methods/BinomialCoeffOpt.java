import java.math.BigInteger;
import java.util.Scanner;

public class BinomialCoeffOpt {
    public static BigInteger binomialCoefficient(int n, int r) {
        if (r < 0 || r > n) {
            return BigInteger.ZERO; // Invalid input
        }

        BigInteger result = BigInteger.ONE;
        for (int i = 0; i < r; i++) {
            result = result.multiply(BigInteger.valueOf(n - i))
                    .divide(BigInteger.valueOf(i + 1));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter r: ");
        int r = sc.nextInt();

        BigInteger result = binomialCoefficient(n, r);
        System.out.println(result);
    }
}

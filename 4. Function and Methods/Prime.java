import java.util.Scanner;

public class Prime {
    public static void checkPrime(int n) {
        boolean isPrime = true;
        if(n <= 1) {
            isPrime = false;
        }
        else if(n == 2) {
            isPrime = true;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime) {
            System.out.println(n + " is prime");
        } else {
            System.out.println(n + " is not prime");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        checkPrime(number);
    }
}
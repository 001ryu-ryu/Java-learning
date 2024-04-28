import java.util.Scanner;

public class Factorial {
    public static int factorial(int n) {
        int fact = 1;
        for(int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number you want to find factorial of: ");
        int number = sc.nextInt();
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is " + result);

    }
}
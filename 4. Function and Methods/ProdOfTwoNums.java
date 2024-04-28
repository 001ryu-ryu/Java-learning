import java.util.Scanner;

public class ProdOfTwoNums {
    public static int prodOfTwoNums(int a, int b) {
        return a * b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        int product = prodOfTwoNums(a, b);
        System.out.println("Product of " + a +" and " + b + " is " + product);

    }
}
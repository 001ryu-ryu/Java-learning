import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter operator: ");
        char operator = sc.next().charAt(0);
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        switch (operator) {
            case '+': System.out.println("Sum is " + (num1 + num2));
                break;
            case '-': System.out.println("Subtraction is " + (num1 - num2));
                break;
            case '*': System.out.println("Multiplication is " + (num1 * num2));
                break;
            case '/': System.out.println("Division is " + (num1 / num2));
                break;
            case '%': System.out.println("Remainder is " + (num1 % num2));
                break;
            default: System.out.println("This calculator can only calculate these!");
                break;
        }
    }
}
